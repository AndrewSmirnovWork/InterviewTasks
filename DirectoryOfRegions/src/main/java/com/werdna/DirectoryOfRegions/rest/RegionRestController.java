package com.werdna.DirectoryOfRegions.rest;

import com.werdna.DirectoryOfRegions.entity.Region;
import com.werdna.DirectoryOfRegions.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping("/api")
public class RegionRestController {

    private Logger log = Logger.getLogger(getClass().getName());

    @Autowired
    private RegionService regionService;

    @Autowired
    public RegionRestController(RegionService regionService) {
        this.regionService = regionService;
    }


    @GetMapping("/regions")
    public List<Region> findAll() {
        return regionService.findAll();
    }


    @GetMapping("/regions/{id}")
    public Region findById(@PathVariable Integer id) {
        log.info("getting user with id " + id);
        return regionService.findById(id);
    }


    @PutMapping("/regions")
    public String update(@RequestBody Region region) {
        regionService.update(region);
        return "Region with id " + region.getId() + " successfully updated!";
    }
}
