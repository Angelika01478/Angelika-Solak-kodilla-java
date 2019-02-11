package stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantityInCountry() {
        return peopleQuantity;
    }
}
