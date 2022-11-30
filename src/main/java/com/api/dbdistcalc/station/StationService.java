package com.api.dbdistcalc.station;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.util.*;

@Service
public class StationService {

    private static final String CSV_FILE = "src/main/resources/D_Bahnhof_2020_alle.csv";

    public static List<Station> readCSVAndConvertList() {
        List<Object> data;
        List<Station> stations = new ArrayList<>();
        try {
            data = new CsvToBeanBuilder<>(new FileReader(CSV_FILE))
                    .withType(Station.class)
                    .withSeparator(';')
                    .withFieldAsNull(CSVReaderNullFieldIndicator.EMPTY_SEPARATORS)
                    .build()
                    .parse();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (Object obj : data) {
            Station station = (Station) obj;
            stations.add(station);
        }
        return stations;
    }

    public static Station findSpecificStation(String ds100) {
        String id = ds100.toUpperCase();
        List<Station> stations = StationService.readCSVAndConvertList();
        for (Station station : stations) {
            if (station.getDS100().equals(id)) {
                return station;
            }
        }
        return null;
    }

    public List<Station> getStations() {
        return readCSVAndConvertList();
    }

}
