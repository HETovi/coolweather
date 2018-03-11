package com.example.tovi.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tovi on 2018/3/11.
 */

public class Forecast {
    @SerializedName("date")
    public String date;

    public class Temperature{
        @SerializedName("max")
        public String max;

        @SerializedName("min")
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;
}

