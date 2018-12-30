package com.guoshanyi.ehealth.mapper;


import java.util.List;

import com.guoshanyi.ehealth.model.Mypatient;
import com.guoshanyi.ehealth.model.MypatientExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MypatientMapper {
    int countByExample(MypatientExample example);

    int deleteByExample(MypatientExample example);

    int deleteByPrimaryKey(Integer idmypatient);

    int insert(Mypatient record);

    int insertSelective(Mypatient record);

    List<Mypatient> selectByExample(MypatientExample example);

    Mypatient selectByPrimaryKey(Integer idmypatient);

    int updateByExampleSelective(@Param("record") Mypatient record, @Param("example") MypatientExample example);

    int updateByExample(@Param("record") Mypatient record, @Param("example") MypatientExample example);

    int updateByPrimaryKeySelective(Mypatient record);

    int updateByPrimaryKey(Mypatient record);
}