package com.bat.wz.mbg.mapper;

import com.bat.wz.mbg.entity.CommodityList;
import com.bat.wz.mbg.entity.CommodityListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityListMapper {
    long countByExample(CommodityListExample example);

    int deleteByExample(CommodityListExample example);

    int deleteByPrimaryKey(String goodId);

    int insert(CommodityList record);

    int insertSelective(CommodityList record);

    List<CommodityList> selectByExample(CommodityListExample example);

    CommodityList selectByPrimaryKey(String goodId);

    int updateByExampleSelective(@Param("record") CommodityList record, @Param("example") CommodityListExample example);

    int updateByExample(@Param("record") CommodityList record, @Param("example") CommodityListExample example);

    int updateByPrimaryKeySelective(CommodityList record);

    int updateByPrimaryKey(CommodityList record);

    List<CommodityList> findGoods(@Param("location") String location);
}