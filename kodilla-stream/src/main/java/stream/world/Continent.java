package stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {


    private final List<Country> countries= new ArrayList<>();


    public void addCountry(Country country){
        countries.add(country);
    }

    public boolean removeCountry(Country country){
        if(countries.size()!=0) return countries.remove(country);
        return false;
    }

    public List<Country> getCountries(){
        return countries;
    }



}


