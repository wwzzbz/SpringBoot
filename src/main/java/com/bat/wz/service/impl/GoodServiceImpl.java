package com.bat.wz.service.impl;


import com.bat.wz.mbg.entity.CommodityList;
import com.bat.wz.mbg.mapper.CommodityListMapper;
import com.bat.wz.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ${符柱成} on 2017/4/6.
 */
@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private CommodityListMapper goodMapper;

    @Override
    public List<CommodityList> findGoodByClassifyName(String ClassifyName) throws Exception {
        return null;
    }

    @Override
    public List<CommodityList> findIndex(String keyword, int start, int row) {
        /*List<CommodityList> goodDetailsList;
        try {
            long start2 = System.nanoTime();
            goodDetailsList = luceneDao.findIndex(keyword, start, row);
            long time = System.nanoTime() - start2;
            System.out.println("测试索引耗时！！！！"+time);
            return goodDetailsList;
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        return null;
    }

    @Override
    public CommodityList findGoodAllDetailsById(String goodId) {
        CommodityList goodDetails = goodMapper.selectByPrimaryKey(goodId);
        return goodDetails;
    }

    @Override
    public List<CommodityList> getGoodList(String location) {
        List<CommodityList> goodList= goodMapper.findGoods(location);
        System.out.println(goodList.toString());
        return goodList;
    }

    @Override
    public List<Integer> methodOfWarn(List<CommodityList> goodDetailsList) throws Exception {
        return null;
    }
}
