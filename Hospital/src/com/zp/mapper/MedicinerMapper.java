package com.zp.mapper;

import com.zp.entity.Mediciner;
import com.zp.entity.MedicinerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicinerMapper {
    int countByExample(MedicinerExample example);

    int deleteByExample(MedicinerExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Mediciner record);

    int insertSelective(Mediciner record);
    
    List<Mediciner> selAllTitle();
    
    Mediciner sel_docu(Integer mid);
    
    List<Mediciner> selMediciners(String obj);
    
    List<Mediciner> selMed(@Param(value="title") String title);

    List<Mediciner> selectByExample(MedicinerExample example);

    Mediciner selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Mediciner record, @Param("example") MedicinerExample example);

    int updateByExample(@Param("record") Mediciner record, @Param("example") MedicinerExample example);

    int updateByPrimaryKeySelective(Mediciner record);

    int updateByPrimaryKey(Mediciner record);
}