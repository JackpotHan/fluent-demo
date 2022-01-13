package com.example.fluentdemo.service.impl;

import com.example.fluentdemo.dao.intf.CheckResultDao;
import com.example.fluentdemo.entity.CheckResult;
import com.example.fluentdemo.service.CheckResultService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.lang.Boolean.FALSE;

/**
 * @author Jackpot
 * @version jdk1.8
 * @date 2022/1/10 4:17 PM
 * @description
 */
@Service
public class CheckResultServiceImpl implements CheckResultService {

    @Autowired
    CheckResultDao dao;

    @Override
    public PageInfo<CheckResult> result() {
        PageHelper.startPage(1,10,FALSE);
        return new PageInfo(Lists.list(dao.selectById("1476110326347927554")));
        //return dao.selectByMap(new Page<>(resultDTO.getPageIndex(), resultDTO.getPageSize()),
        //        new LambdaQueryWrapper<CheckResult>().eq(CheckResult::getRound, lastRound)
        //                .eq(ObjectUtil.isNotEmpty(resultDTO.getServerName()), CheckResult::getServerName, resultDTO.getServerName())
        //                .eq(ObjectUtil.isNotEmpty(resultDTO.getModuleName()), CheckResult::getModuleName, resultDTO.getModuleName()));
    }



}
