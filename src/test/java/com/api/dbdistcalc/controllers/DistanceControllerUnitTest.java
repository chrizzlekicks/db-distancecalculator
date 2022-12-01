package com.api.dbdistcalc.controllers;

import com.api.dbdistcalc.distance.Distance;
import com.api.dbdistcalc.distance.DistanceController;
import com.api.dbdistcalc.distance.DistanceService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DistanceControllerUnitTest {

    private Distance testDist;

    @BeforeEach
    void setUp() {
        testDist = new Distance("Frankfurt(Main)Hbf", "Berlin(Hbf)", 432, "km");
    }

    @Test
    void getDistance() {
        DistanceService mockDistanceService = Mockito.mock(DistanceService.class);
        Mockito.when(mockDistanceService.getDistInfo("FF", "BLS")).thenReturn(testDist);
        DistanceController distanceController = new DistanceController(mockDistanceService);
        assertNotNull(distanceController.getDistance("FF", "BLS"));
        assertEquals(distanceController.getDistance("FF", "BLS"), testDist);
        assertEquals(distanceController.getDistance("FF", "BLS").getDistance(), 432);
    }
}