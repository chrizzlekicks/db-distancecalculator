package com.api.dbdistcalc.services;

import com.api.dbdistcalc.station.Station;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Objects;

import static com.api.dbdistcalc.station.StationService.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StationServiceUnitTest {

    private List<Station> testStations;

    @BeforeEach
    void populate() {
        testStations = readCSVAndConvertList();
    }

    @Test
    void returnList() {
        assertNotNull(testStations);
    }

    @Test
    void findRightElement() {
        Station testStation = findSpecificStation("FF");
        assertEquals(Objects.requireNonNull(testStation).getNAME(), "Frankfurt(Main)Hbf");
    }
}