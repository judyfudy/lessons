package com.company;

public enum Currency {
    UKRAINE("UAH"), USA("USD"), POLAND("PLZ");

    private String name;

    Currency(String name) {
        this.name = name;
    }
}
