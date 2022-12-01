package com.api.dbdistcalc.controllers;

import com.api.dbdistcalc.station.Station;
import com.api.dbdistcalc.station.StationController;
import com.api.dbdistcalc.station.StationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StationControllerUnitTest {

    private Station test1;
    private Station test2;

    @BeforeEach
    void setUp() {
        test1 = new Station(
                8000001,
                "KA",
                "de:05334:1008",
                "Aachen Hbf",
                "FV",
                6.091499,
                50.7678,
                "DB Station und Service AG",
                1,
                null);
        test2 = new Station(
                8000011,
                "AAG",
                "de:01057:3365",
                "Ascheberg(Holst)",
                "RV",
                10.339481,
                54.148462,
                "DB Station und Service AG",
                191,
                null
        );
    }

    @Test
    void getStations() {
        StationService mockStationService = Mockito.mock(StationService.class);
        Mockito.when(mockStationService.getStations()).thenReturn(List.of(test1, test2));
        StationController stationController = new StationController(mockStationService);
        assertNotNull(stationController.getStations());
        assertEquals(stationController.getStations().size(), 2);
        assertEquals(stationController.getStations(), List.of(test1, test2));
    }
}