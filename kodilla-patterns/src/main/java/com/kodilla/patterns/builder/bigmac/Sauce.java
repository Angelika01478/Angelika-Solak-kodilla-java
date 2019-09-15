package com.kodilla.patterns.builder.bigmac;

public class Sauce {

    public static final String STANDARD = "STANDARD";
    public static final String THOUSAND_ISLANDS = "THOUSAND_ISLANDS";
    public static final String BARBECUE = "BARBECUE";
    private String sauceType;

    public Sauce(String sauceType) {

        if (sauceType.equals(STANDARD)
                || sauceType.equals(THOUSAND_ISLANDS)
                || sauceType.equals(BARBECUE)) {
            this.sauceType = sauceType;
        }else {
            throw new IllegalStateException("We do not have such sauce type");
        }
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "sauceType='" + sauceType + '\'' +
                '}';
    }
}
