package com.zzuli.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@ApiModel("分页参数")
public class PageInfo {
    @ApiModelProperty("页码")
    private Integer num;        // 页码, 从1开始计数
    @ApiModelProperty("每页记录条数")
    private Integer size;       // 每页显示的记录条数
}
