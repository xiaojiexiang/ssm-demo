package com.qf.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: DHC
 * Date: 2018/2/28
 * Time: 21:13
 * Version:V1.0
 */
@Controller
public class IndexAction {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
