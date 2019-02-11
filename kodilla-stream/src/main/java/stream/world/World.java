package stream.world;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents= new ArrayList<>();

    public void addConinent(Continent continent){
        continents.add(continent);
    }

    public boolean removeContinent(Continent continent){
        if(continents.size()!=0) {
            continents.remove(continent);
            return true;
        }
        return false;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal population = continents.stream()
                .flatMap(x->x.getCountries().stream())
                .map(country -> country.getPeopleQuantityInCountry())
                .reduce(BigDecimal.ZERO, (sum, current)-> sum.add(current));
        return population;
    }



}
