package com.bat.wz.controller;


import com.bat.wz.common.api.CommonResult;
import com.bat.wz.mbg.entity.CommodityList;
import com.bat.wz.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by asus on 2017/5/25.
 */

@Controller
@RequestMapping("/ajax")
public class AjaxController {
    @Autowired
    private GoodService goodService;

    @RequestMapping(value = "/findGoods",produces="text/html;charset=UTF-8", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public CommonResult findGoodInfo(HttpServletRequest request, String location){
        List<CommodityList> goodlist =  goodService.getGoodList(location);
        if(goodlist!=null || goodlist.size() != 0 ){
            return CommonResult.success(goodlist);
        }
        return CommonResult.success(goodlist);
    }
}
