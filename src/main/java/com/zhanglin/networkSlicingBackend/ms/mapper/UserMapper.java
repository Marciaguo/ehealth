package com.zhanglin.networkSlicingBackend.ms.mapper;

import com.zhanglin.networkSlicingBackend.ms.entity.Slice;
import com.zhanglin.networkSlicingBackend.ms.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM User")
    @Results({
    })
    List<Slice> selectAll();


    @Select("SELECT * FROM User WHERE userName = #{userName} ")
    @Results({
    })
    User queryUserByUserName(@Param("userName") String userName);


    @Insert("INSERT INTO User(userName, password) "
            + "VALUES(#{userName},#{password})")
    void saveUser(User user);
}
