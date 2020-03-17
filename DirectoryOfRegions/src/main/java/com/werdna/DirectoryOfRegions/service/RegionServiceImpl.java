package com.werdna.DirectoryOfRegions.service;

import com.werdna.DirectoryOfRegions.dao.RegionDAO;
import com.werdna.DirectoryOfRegions.entity.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    RegionDAO regionDAO;

    @Override
    public List<Region> findAll() {
        return regionDAO.findAll();
    }

    @Override
    public Region findById(Integer id) {
        return regionDAO.findById(id);
    }

    @Override
    public void update(Region region) {
        regionDAO.update(region);
    }
}
