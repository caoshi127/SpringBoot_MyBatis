package com.zzuli.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

    private Integer id;
    private String userName;
    private String gender;
    private String address;
    private Integer roleId;

}
