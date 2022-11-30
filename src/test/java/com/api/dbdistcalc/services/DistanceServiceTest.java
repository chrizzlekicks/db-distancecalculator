package com.api.dbdistcalc.services;

import com.api.dbdistcalc.distance.Distance;
import com.api.dbdistcalc.distance.DistanceService;
import com.api.dbdistcalc.station.Station;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DistanceServiceTest {

    @Test
    void testCalcDist() {
        Station test1 = new Station(
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
        Station test2 = new Station(
                8000011,
                "AAG",
                "de:01057:3365",
                "Ascheberg(Holst)",
                "RV",
                10.339481,
                54.148462,
                "DB Station und Service AG",
                191,
                null);
        DistanceService distanceService = new DistanceService();
        Distance testDist = distanceService.getDistInfo(test1.getDS100(), test2.getDS100());
        assertEquals(testDist.getDistance(), 473);
    }
}