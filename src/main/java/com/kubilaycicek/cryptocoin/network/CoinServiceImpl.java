package com.kubilaycicek.cryptocoin.network;

import com.kubilaycicek.cryptocoin.model.Main;
import com.kubilaycicek.cryptocoin.util.Constants;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class CoinServiceImpl {
    private static CoinService coinService = null;

    public static CoinService getCoinService() {
        if (coinService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            coinService = retrofit.create(CoinService.class);
        }
        return coinService;
    }
    public static Main getCoins() throws IOException{
        Call<Main> retrofitCall = CoinServiceImpl.getCoinService().getCoins();
        Response<Main> response = retrofitCall.execute();
        return  response.body();
    }
}
