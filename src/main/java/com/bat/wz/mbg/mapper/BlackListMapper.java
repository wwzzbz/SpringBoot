package com.bat.wz.mbg.mapper;

import com.bat.wz.mbg.entity.BlackList;
import com.bat.wz.mbg.entity.BlackListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlackListMapper {
    long countByExample(BlackListExample example);

    int deleteByExample(BlackListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BlackList record);

    int insertSelective(BlackList record);

    List<BlackList> selectByExample(BlackListExample example);

    BlackList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BlackList record, @Param("example") BlackListExample example);

    int updateByExample(@Param("record") BlackList record, @Param("example") BlackListExample example);

    int updateByPrimaryKeySelective(BlackList record);

    int updateByPrimaryKey(BlackList record);
}