package com.dongdong.android.gson;

/**
 * Created by user on 2017/12/28.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        private String pm25;
    }
}