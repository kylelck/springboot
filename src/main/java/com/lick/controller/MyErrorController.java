package com.lick.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description：
 * @Author: lick@hsyuntai.com
 * @Date: 2017年10月23日 21:12
 * @Copyright: 版权归hsyuntai 所有
 */
@Controller
public class MyErrorController implements ErrorController {
    private static final String ERROR_PATH = "/error";
    @RequestMapping(value=ERROR_PATH)
    public String handleError(){
        return "errorpage/error";
    }
    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
