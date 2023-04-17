package com.online_forum.entity;

import lombok.Data;
import java.util.Date;

/**
 * 用户实体类
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private int gender;
    private int status;
    private String phone;
    private String avatar;
    private Date createdAt;
    private Date  timestamp;
    private int type;
}
