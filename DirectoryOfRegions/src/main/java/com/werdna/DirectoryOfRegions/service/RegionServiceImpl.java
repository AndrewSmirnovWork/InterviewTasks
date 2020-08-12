package com.werdna.DirectoryOfRegions.service;

import com.werdna.DirectoryOfRegions.dao.RegionDAO;
import com.werdna.DirectoryOfRegions.entity.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    RegionDAO regionDAO;

    @Override
    @Transactional
    public List<Region> findAll() {
        return regionDAO.findAll();
    }

    @Override
    @Transactional
    public Region findById(Integer id) {
        return regionDAO.findById(id);
    }

    @Override
    @Transactional
    public void update(Region region) {
        regionDAO.update(region);
    }
}
