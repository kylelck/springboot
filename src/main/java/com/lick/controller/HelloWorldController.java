package com.lick.controller;

import com.alibaba.fastjson.JSONObject;
import com.lick.service.QaContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: lick@hsyuntai.com
 * @Date: 2017年10月23日 14:21
 * @Copyright: 版权归hsyuntai 所有
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {
    @Autowired
    private QaContentService qaContentService;
    @RequestMapping("/")
    String home(HttpServletRequest request, ModelMap map) {
        map.put("data",JSONObject.toJSONString(qaContentService.getQaContent()));
        return "index";
    }
}
