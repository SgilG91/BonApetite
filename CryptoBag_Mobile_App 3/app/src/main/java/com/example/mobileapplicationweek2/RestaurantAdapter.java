package com.example.mobileapplicationweek2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.CoinViewHolder> {
    private ArrayList<Restaurant> mCoins;
    private RecyclerViewClickListener mListener;


    //RestaurantAdapter Constructor
    public RestaurantAdapter(ArrayList<Restaurant> coins, RecyclerViewClickListener listener) {
        mCoins = coins;
        mListener = listener;
    }


    //Creates an interface template
    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }


    //Creates a CoinViewHolder class that can be invoked without RestaurantAdapter class
    public static class CoinViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name, value, location;
        private RecyclerViewClickListener mListener;

        //Constructor for CoinViewHolder
        public CoinViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            name = v.findViewById(R.id.tvName);
            value = v.findViewById(R.id.tvValue);
            location= v.findViewById(R.id.tvLocation);
        }

        //onClick method from RecyclerViewClickListener interface
        @Override
        public void onClick(View view) { mListener.onClick(view, getAdapterPosition()); }
    }


    //Creates CoinViewHolder (layout object) and sets it
    @Override
    public RestaurantAdapter.CoinViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.coin_list_row, parent, false);
        return new CoinViewHolder(v, mListener);
    }


    //Sets text for TextView elements
    @Override
    public void onBindViewHolder(CoinViewHolder holder, int position) {
        Restaurant coin = mCoins.get(position);
        holder.name.setText(coin.getName());
        holder.value.setText(coin.getRating()+"  ");
        holder.location.setText(coin.getLocation());

    }


    //Needed for RecyclerView
    @Override
    public int getItemCount() { return mCoins.size(); }
}
