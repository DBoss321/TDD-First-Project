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


}
