package com.example.fluentdemo.service;


import com.example.fluentdemo.entity.CheckResult;
import com.github.pagehelper.PageInfo;

/**
 * @author Jackpot
 * @version jdk1.8
 * @date 2022/1/10 4:16 PM
 * @description
 */
public interface CheckResultService {

    /**
     * 自检结果查询
     * @return org.springframework.data.domain.Page<com.example.fluentdemo.service.CheckResult>
     * @author Jackpot
     * @date 2022/1/10 4:25 PM
     */
    PageInfo<CheckResult> result();
}
