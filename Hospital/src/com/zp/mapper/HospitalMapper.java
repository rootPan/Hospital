package com.zp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zp.entity.Hospital;
import com.zp.entity.HospitalExample;

@Repository
public interface HospitalMapper {
    int countByExample(HospitalExample example);

    int deleteByExample(HospitalExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(Hospital record);

    List<Hospital> sel_Hospital(@Param(value="grade") String grade);
    
    Hospital sel_Hname(@Param(value="hname") String hname);
    
    List<Hospital> allHospital(@Param(value="hname") String hname);
    
    int selTuijian(@Param(value="hname") String hname);
    
    int insertSelective(Hospital record);

    List<Hospital> selectByExample(HospitalExample example);

    Hospital selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByExample(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
}