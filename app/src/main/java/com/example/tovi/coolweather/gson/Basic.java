package com.example.tovi.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tovi on 2018/3/11.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;

    }
}
