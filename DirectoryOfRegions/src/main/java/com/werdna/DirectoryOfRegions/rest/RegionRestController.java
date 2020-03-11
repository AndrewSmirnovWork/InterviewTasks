package com.werdna.DirectoryOfRegions.rest;

import com.werdna.DirectoryOfRegions.entity.Region;
import com.werdna.DirectoryOfRegions.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegionRestController {

    private RegionService regionService;

    @Autowired
    public RegionRestController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping("/regions")
    public List<Region> findAll() {
        return regionService.findALl();
    }

    @PutMapping("/regions")
    public void update(@RequestBody Region region) {
        regionService.update(region);
    }
}
