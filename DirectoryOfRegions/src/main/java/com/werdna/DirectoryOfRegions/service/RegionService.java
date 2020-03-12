package com.werdna.DirectoryOfRegions.service;

import com.werdna.DirectoryOfRegions.entity.Region;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface RegionService {

    @Select("Select * from directory")
    List<Region> findAll();

    @Select(
            "Select id, fullName, shortName from directory where id=#{id}")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property="fullName", column = "fullName"),
            @Result(property = "shortName", column = "shortName")
    })
    Region findById(Integer id);

    @Update("Update directory set fullName = #{fullName}, shortName = #{shortName} where id=#{id}")
    void update(Region region);
}
