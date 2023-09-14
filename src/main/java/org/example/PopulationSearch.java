package org.example;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int getPopulation(String city) {
        int populationCount;
        if(city.equals(""))
            throw new NullPointerException ("Input cannot be empty");
        Map<String,Integer> populationMap = getPopulationStatistics();
        if(!populationMap.containsKey(city))
                throw new NullPointerException("Invalid input");
        else
            populationCount = populationMap.get(city);
        return populationCount;
    }

    private Map<String,Integer> getPopulationStatistics(){

        Map<String,Integer> populationMap = new HashMap<>();
        populationMap.put("Bangalore",200000);
        populationMap.put("Hyderabad",500000);
        populationMap.put("Pune",300000);
        populationMap.put("Mumbai",800000);
        return populationMap;
    }

    public boolean checkEqual(String city1, String city2) {
        Map<String,Integer> populationMap = getPopulationStatistics();
        if(populationMap.get(city1) == populationMap.get(city2))
            return true;
        return false;
    }
}