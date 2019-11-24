package com.zzuli.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@ApiModel("用户")
public class Role {

    @ApiModelProperty("ID")
    private Integer id;

    @ApiModelProperty("角色名")
    private String roleName;

}
