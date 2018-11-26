package com.zhanglin.networkSlicingBackend.ms.mapper;

import com.zhanglin.networkSlicingBackend.ms.entity.Slice;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SliceMapper {

    @Select("SELECT * FROM Slice")
    @Results({
    })
    List<Slice> selectAll();


    @Select("SELECT * FROM Slice WHERE slice_id = #{sliceId} ")
    @Results({
    })
    Slice selectTripByTripId(@Param("slice_id") String sliceId);


    @Insert("INSERT INTO Slice(slice_id, slice_name, slice_switch) "
            + "VALUES(#{slice_id},#{slice_name},#{slice_switch})")
    void saveSlice(Slice slice);


}
