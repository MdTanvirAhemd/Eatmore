package com.ahmed.eatmore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodItemAdapter extends RecyclerView.Adapter<FoodItemAdapter.FoodHolder> {

    List<FoodItem> data;

    public FoodItemAdapter(List<FoodItem> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.food_view_holder,parent,false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {
        holder.txtPrice.setText(String.format("$%d",data.get(position).getPrice()));
        holder.txtName.setText(data.get(position).getName());
        holder.imgFood.setImageResource(data.get(position).getImage());
        holder.ratingBar.setRating(data.get(position).getRating());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class FoodHolder extends RecyclerView.ViewHolder {

        ImageView imgFood;
        TextView txtPrice, txtName;
        RatingBar ratingBar;

        public FoodHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.food_title);
            txtPrice = itemView.findViewById(R.id.txt_price);
            ratingBar = itemView.findViewById(R.id.rating);
            imgFood = itemView.findViewById(R.id.food_img);
        }
    }
}
