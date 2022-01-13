package com.example.fluentdemo;

import cn.org.atool.fluent.mybatis.metadata.DbType;
import cn.org.atool.generator.FileGenerator;
import cn.org.atool.generator.annotation.Table;
import cn.org.atool.generator.annotation.Tables;

/**
 * @author Jackpot
 * @version jdk1.8
 * @date 2022/1/10 11:39 AM
 * @description
 */
public class Generator {

    public static final String url = "jdbc:postgresql://172.16.22.158:55432/wedora3.0?useUnicode=true&characterEncoding=utf-8&reWriteBatchedInserts=true";

    public static void main(String[] args) throws Exception {
        FileGenerator.build(Demo.class);
    }

    @Tables(
            // 设置数据库连接信息
            url = url, username = "postgres", password = "pp!@#ABC!!",
            dbType= DbType.POSTGRE_SQL,
            driver = "org.postgresql.Driver",
            schema = "public",
            // 设置entity类生成src目录, 相对于 user.dir
            srcDir = "src/main/java",
            // 设置entity类的package值
            basePack = "com.example.fluentdemo",
            // 设置dao接口和实现的src目录, 相对于 user.dir
            daoDir = "src/main/java",
            //表前缀
            tablePrefix = "t_",
            mapperPrefix = "hd",
            entitySuffix = "",
            // 设置哪些表要生成Entity文件
            tables = {@Table(value = {"t_check_result"})}
    )

    static class Demo {
    }
}
