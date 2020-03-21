package com.example.mobileapplicationweek2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    private TextView coinL;
    private TextView coinS;
    private TextView value;


    public DetailFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detail, container, false);
        Bundle arguments = getArguments();
        int position = arguments.getInt("POSITION");
        Restaurant coin = Restaurant.getCoins().get(position);

        coinL = v.findViewById(R.id.mCoinLong);
        coinS = v.findViewById(R.id.mCoinShort);
        value = v.findViewById(R.id.mValue);

        coinL.setText(coin.getName());
        coinS.setText(coin.getLocation());
        value.setText(coin.getRating()+" stars");

        return v;
    }



}
