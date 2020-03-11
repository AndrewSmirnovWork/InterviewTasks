package com.werdna.DirectoryOfRegions.jpa;

import com.werdna.DirectoryOfRegions.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Integer> {
}
