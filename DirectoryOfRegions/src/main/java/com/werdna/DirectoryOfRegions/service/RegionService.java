package com.werdna.DirectoryOfRegions.service;

import com.werdna.DirectoryOfRegions.entity.Region;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface RegionService {

    @Select("Select * from directory")
    List<Region> findAll();

    @Update("Update directory set name = #{name} and shortName = #{shortName} where id=#{id}")
    void update(Region region);
}
