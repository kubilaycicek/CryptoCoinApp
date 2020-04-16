package com.kubilaycicek.cryptocoin.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Coins implements Serializable {
    private int id;
    private String symbol;
    private String name;
    private String description;
    private String color;
    private String iconUrl;
    private double price;
}
