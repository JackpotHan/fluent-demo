package com.example.fluentdemo.controller;

import com.example.fluentdemo.service.CheckResultService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jackpot
 * @version jdk1.8
 * @date 2022/1/10 3:34 PM
 * @description
 */
@RestController
@RequestMapping("result")
public class CheckResultController {

    @Autowired
    CheckResultService checkResultService;

    @GetMapping
    public PageInfo<?> getResult(){
        return checkResultService.result();
    }


}
