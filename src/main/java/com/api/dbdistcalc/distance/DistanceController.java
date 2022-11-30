package com.api.dbdistcalc.distance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/distance/")
public class DistanceController {

    private final DistanceService distanceService;

    @Autowired
    public DistanceController(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

    @GetMapping(value = "{from}/{to}")
    public Distance getDistance(@PathVariable("from") String from, @PathVariable("to") String to) {
        return distanceService.getDistance(from, to);
    }
}
