package com.example.listycities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     * @throws IllegalArgumentException if city is already in list
     *
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     *
    This method returns true if city is in cityList false if it is not
     * @param city
     *      city we want to look for
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     *
     * this method deletes a city from cityList
     * @param city
     *         city to be deleted
     * @throws IllegalArgumentException if city is not in list
     */
    public void delete(City city){
        if (!(cities.contains(city))) {
            throw new IllegalArgumentException();
        }else{
            cities.remove(city);
        }
    }

    /**
     * this method gets the number of cities in list
     * @return
     *      returns the number of cites in cityList
     */
    public int countCities(){
        return cities.size();
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
