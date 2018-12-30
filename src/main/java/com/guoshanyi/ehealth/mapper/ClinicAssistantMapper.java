package com.guoshanyi.ehealth.mapper;


import java.util.List;

import com.guoshanyi.ehealth.model.ClinicAssistant;
import com.guoshanyi.ehealth.model.ClinicAssistantExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ClinicAssistantMapper {
    int countByExample(ClinicAssistantExample example);

    int deleteByExample(ClinicAssistantExample example);

    int deleteByPrimaryKey(Integer idmenzhen);

    int insert(ClinicAssistant record);

    int insertSelective(ClinicAssistant record);

    List<ClinicAssistant> selectByExample(ClinicAssistantExample example);

    ClinicAssistant selectByPrimaryKey(Integer idmenzhen);

    int updateByExampleSelective(@Param("record") ClinicAssistant record, @Param("example") ClinicAssistantExample example);

    int updateByExample(@Param("record") ClinicAssistant record, @Param("example") ClinicAssistantExample example);

    int updateByPrimaryKeySelective(ClinicAssistant record);

    int updateByPrimaryKey(ClinicAssistant record);
}