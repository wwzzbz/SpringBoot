package com.bat.wz.mbg.mapper;

import com.bat.wz.mbg.entity.Gag;
import com.bat.wz.mbg.entity.GagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GagMapper {
    long countByExample(GagExample example);

    int deleteByExample(GagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Gag record);

    int insertSelective(Gag record);

    List<Gag> selectByExample(GagExample example);

    Gag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Gag record, @Param("example") GagExample example);

    int updateByExample(@Param("record") Gag record, @Param("example") GagExample example);

    int updateByPrimaryKeySelective(Gag record);

    int updateByPrimaryKey(Gag record);
}