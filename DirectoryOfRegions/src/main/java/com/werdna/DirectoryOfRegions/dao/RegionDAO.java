package com.werdna.DirectoryOfRegions.dao;

import com.werdna.DirectoryOfRegions.entity.Region;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RegionDAO {


    @Select("Select * from directory")
    List<Region> findAll();

    @Select(
            "Select id, fullName, shortName from directory where id=#{id}")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "fullName", column = "fullName"),
            @Result(property = "shortName", column = "shortName")
    })
    Region findById(Integer id);


    @Update("Update directory set fullName = #{fullName}, shortName = #{shortName} where id=#{id}")
    void update(Region region);
}
