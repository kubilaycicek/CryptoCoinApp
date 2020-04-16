package com.kubilaycicek.cryptocoin.controller;

import com.kubilaycicek.cryptocoin.model.Coins;
import com.kubilaycicek.cryptocoin.model.Main;
import com.kubilaycicek.cryptocoin.network.CoinServiceImpl;
import com.kubilaycicek.cryptocoin.util.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(Constants.WEB_BASE_URL)
public class CoinController {

    @GetMapping(Constants.MAPPING_GET_COIN_LIST)
    public String getCoins(Model model) throws IOException {
        List<Coins> coins =CoinServiceImpl.getCoins().getData().getCoins();

        model.addAttribute("coins",coins);
        return Constants.WEB_GET_COIN_LIST;
    }

    @GetMapping(Constants.MAPPING_GET_DETAIL + "/{id}")
    public String getCoin(Model model, @PathVariable long id) {
        return Constants.WEB_GET_COIN;
    }
}
