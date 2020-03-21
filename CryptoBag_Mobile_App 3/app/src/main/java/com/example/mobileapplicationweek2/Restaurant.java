package com.example.mobileapplicationweek2;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String location;
    private double rating;


    public Restaurant() {
    }

    public Restaurant(String name, String location, double rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }



    public static ArrayList<Restaurant> getCoins() {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Rara Ramen", "Redfern", 5));
        restaurants.add(new Restaurant("Aria", "Point", 4.8));
        restaurants.add(new Restaurant("Otto", "XRP", 4.8));
        restaurants.add(new Restaurant("Bitcoin Cash", "BCH", 4.75));
        restaurants.add(new Restaurant("Bitcoin SV", "BCHSV", 4.75));
        restaurants.add(new Restaurant("Tether", "USDT", 4.7));
        restaurants.add(new Restaurant("Litecoin", "LTC", 4.7));
        restaurants.add(new Restaurant("EOS", "EOS", 4.7));
        restaurants.add(new Restaurant("Binance Coin", "BNB", 4.7));
        restaurants.add(new Restaurant("Stellar", "XLM", 4.7));
        return restaurants;
    }

    public static Restaurant searchRestaurant(String search) {
        Restaurant result = null;
        ArrayList<Restaurant> restaurants = getCoins();
        for(Restaurant coin : restaurants) {
            if(search.equals(coin.getName()) || search.equals(coin.getLocation())){
                result = coin;
                break;
            }
        }
        return result;
    }

}
