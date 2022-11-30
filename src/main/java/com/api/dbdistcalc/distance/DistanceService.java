package com.api.dbdistcalc.distance;

import com.api.dbdistcalc.station.Station;
import com.api.dbdistcalc.station.StationService;
import org.springframework.stereotype.Service;

@Service
public class DistanceService {

    public Distance getDistance(String from, String to) {
        Station start = StationService.findSpecificStation(from);
        Station end = StationService.findSpecificStation(to);
        int result = calculateDistance(start, end);
        return new Distance(start.getNAME(), end.getNAME(), result, "km");
    }

    public static int calculateDistance(Station station1, Station station2) {
        // convert from degrees to radians for better calculation
        double lon1 = Math.toRadians(station1.getLaenge());
        double lat1 = Math.toRadians(station1.getBreite());
        double lon2 = Math.toRadians(station2.getLaenge());
        double lat2 = Math.toRadians(station2.getBreite());

        // using the Haversine formula
        double diffLon = lon2 - lon1;
        double diffLat = lat2 - lat1;
        double a = Math.pow(Math.sin(diffLat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(diffLon / 2), 2);

        double b = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers.
        double r = 6371;

        // calculate the result
        double v = b * r;

        // cast int
        return (int) v;
    }
}
