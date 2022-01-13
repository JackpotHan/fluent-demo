package com.example.fluentdemo.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.annotation.TableField;
import cn.org.atool.fluent.mybatis.annotation.TableId;
import cn.org.atool.fluent.mybatis.base.RichEntity;
import cn.org.atool.fluent.mybatis.metadata.DbType;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * CheckResult: 数据映射实体定义
 *
 * @author Powered By Fluent Mybatis
 */
@SuppressWarnings({"rawtypes", "unchecked"})
@Data
@Accessors(
    chain = true
)
@EqualsAndHashCode(
    callSuper = false
)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FluentMybatis(
    table = "t_check_result",
    schema = "public",
    mapperBeanPrefix = "hd",
    suffix = "",
    dbType = DbType.POSTGRE_SQL
)
public class CheckResult extends RichEntity {
  private static final long serialVersionUID = 1L;

  @TableId(
      value = "id",
      desc = "主键"
  )
  private String id;

  @TableField(
      value = "api_name",
      desc = "接口名称"
  )
  private String apiName;

  @TableField(
      value = "api_url",
      desc = "接口路径"
  )
  private String apiUrl;

  @TableField(
      value = "elapsed_time",
      desc = "耗时(单位：ms)"
  )
  private Long elapsedTime;

  @TableField(
      value = "end_time",
      desc = "结束时间"
  )
  private Date endTime;

  @TableField(
      value = "module_name",
      desc = "模块名称"
  )
  private String moduleName;

  @TableField(
      value = "request",
      desc = "请求参数"
  )
  private String request;

  @TableField(
      value = "response",
      desc = "响应结果"
  )
  private String response;

  @TableField(
      value = "result_code",
      desc = "结果状态码"
  )
  private String resultCode;

  @TableField(
      value = "round",
      desc = "轮次"
  )
  private Integer round;

  @TableField(
      value = "server_name",
      desc = "服务名称"
  )
  private String serverName;

  @TableField(
      value = "start_time",
      desc = "开始时间"
  )
  private Date startTime;

  @Override
  public final Class entityClass() {
    return CheckResult.class;
  }
}
