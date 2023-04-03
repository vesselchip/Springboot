package com.sffj2.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private Integer role;
    private Integer isdeleted;
}
