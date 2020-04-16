package com.kubilaycicek.cryptocoin.util;

public class Constants {
    /* COINRANKING API */
    public static final String API_BASE_URL = "https://api.coinranking.com/v1/public/";
    public static final String API_GET_COIN_LIST = "coins?limit=40";

    /*SPRING MAPPING */
    public static final String MAPPING_GET_COIN_LIST="coin-list";
    public static final String MAPPING_GET_DETAIL="coin-detail";

    /* SPRING MVC */
    public static final String WEB_BASE_URL="coin-market/";
    public static final String WEB_GET_COIN_LIST = "coin-list";
    public static final String WEB_GET_COIN = "coin-detail";
}
