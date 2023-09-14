package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PopulationSearchTest {

    @Test
    public void findPopulation(){
        String city = "Bangalore";
        PopulationSearch ps = new PopulationSearch();
        int expectedPopulationCount = 200000;
        int actualCount = ps.getPopulation(city);
        Assert.assertEquals(expectedPopulationCount, actualCount);
    }

    @Test(expected = NullPointerException.class)
    public void findPopulationWithEmptyInput(){
        String city = "";
        PopulationSearch ps = new PopulationSearch();
        int expectedPopulationCount = 0;
        int actualCount = ps.getPopulation(city);
        Assert.assertEquals(expectedPopulationCount, actualCount);
    }

    @Test(expected = NullPointerException.class)
    public void findPopulationWithInvalidInput(){
        String city = "ABC";
        PopulationSearch ps = new PopulationSearch();
        int expectedPopulationCount = 0;
        int actualCount = ps.getPopulation(city);
        Assert.assertEquals(expectedPopulationCount, actualCount);
    }

    @Test(expected = AssertionError.class)
    public void checkIfEqual(){
        String city1 = "Bangalore";
        String city2 = "Hyderabad";
        PopulationSearch ps = new PopulationSearch();
//        return ps.checkEqual(city1,city2);
        int city1Population = ps.getPopulation(city1);
        int city2Population = ps.getPopulation(city2);
        Assert.assertEquals(city1Population,city2Population);
    }

}
