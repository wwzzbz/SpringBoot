package com.bat.wz.service;

import com.bat.wz.mbg.entity.CommodityList;

import java.util.List;

/**
 * Created by ${符柱成} on 2017/4/6.
 */
public interface GoodService {
    public List<CommodityList> findGoodByClassifyName(String ClassifyName) throws Exception;

    public List<CommodityList> findIndex(String keyword, int start, int row);

    public CommodityList findGoodAllDetailsById(String realGoodid);


    public List<CommodityList> getGoodList(String location);

    public List<Integer> methodOfWarn(List<CommodityList> goodDetailsList) throws Exception;

}
