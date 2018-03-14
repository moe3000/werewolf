package com.yclee.werewolf.controller;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyc1
 * @version V1.0.0
 * Copyright 杭州融都科技股份有限公司 All Rights Reserved
 * 官方网站：www.erongdu.com
 * <p>
 * 未经授权不得进行修改、复制、出售及商业使用
 * @date 2018/3/14 16:48
 */
@RestController
public class StaticViewController {

    @RequestMapping("/index")
    public String index () {
        return "index";
    }


}
