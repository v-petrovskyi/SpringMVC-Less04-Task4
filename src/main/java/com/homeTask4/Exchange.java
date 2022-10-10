package com.homeTask4;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Exchange {

    private double rate;
    private String currency;


    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public void setRandomRate() {
        this.rate = (double)Math.round(new Random().nextDouble(500) * 1000d) / 1000d;
    }

    public String getCurrency() {
        return currency;
    }

    public void setRandomCurrency() {
        List<String> list = Arrays.asList("AUD","CNY", "HRK", "CZK", "HRK", "HUF");
        this.currency = list.get(new Random().nextInt(list.size()-1));
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
