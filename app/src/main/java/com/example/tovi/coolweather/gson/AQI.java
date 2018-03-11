package com.example.tovi.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tovi on 2018/3/11.
 */

public class AQI {
    public class AQICity{
        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }

    @SerializedName("city")
    public AQICity city;
}
