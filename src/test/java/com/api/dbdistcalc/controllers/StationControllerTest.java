package com.api.dbdistcalc.controllers;

import com.api.dbdistcalc.station.Station;
import com.api.dbdistcalc.station.StationController;
import com.api.dbdistcalc.station.StationService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StationControllerTest {

    private final StationService stationServiceTest;

    StationControllerTest(StationService stationServiceTest) {
        this.stationServiceTest = stationServiceTest;
    }

    @Test
    void getSomething() {
        StationController controller = new StationController(stationServiceTest);
        List<Station> testStations = controller.getStations();
    }
}
