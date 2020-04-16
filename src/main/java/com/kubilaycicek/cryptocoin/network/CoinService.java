package com.kubilaycicek.cryptocoin.network;

import com.kubilaycicek.cryptocoin.model.Main;
import com.kubilaycicek.cryptocoin.util.Constants;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CoinService {
    @GET(Constants.API_GET_COIN_LIST)
    Call<Main> getCoins();
}
