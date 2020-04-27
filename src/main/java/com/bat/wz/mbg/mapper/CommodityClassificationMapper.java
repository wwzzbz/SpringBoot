package com.bat.wz.mbg.mapper;

import com.bat.wz.mbg.entity.CommodityClassification;
import com.bat.wz.mbg.entity.CommodityClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityClassificationMapper {
    long countByExample(CommodityClassificationExample example);

    int deleteByExample(CommodityClassificationExample example);

    int deleteByPrimaryKey(Integer classifyId);

    int insert(CommodityClassification record);

    int insertSelective(CommodityClassification record);

    List<CommodityClassification> selectByExample(CommodityClassificationExample example);

    CommodityClassification selectByPrimaryKey(Integer classifyId);

    int updateByExampleSelective(@Param("record") CommodityClassification record, @Param("example") CommodityClassificationExample example);

    int updateByExample(@Param("record") CommodityClassification record, @Param("example") CommodityClassificationExample example);

    int updateByPrimaryKeySelective(CommodityClassification record);

    int updateByPrimaryKey(CommodityClassification record);
}