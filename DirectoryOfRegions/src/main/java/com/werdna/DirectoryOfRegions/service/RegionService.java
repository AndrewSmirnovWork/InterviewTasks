package com.werdna.DirectoryOfRegions.service;

import com.werdna.DirectoryOfRegions.entity.Region;

import java.util.List;


public interface RegionService {

    List<Region> findAll();

    Region findById(Integer id);

    void update(Region region);

}
