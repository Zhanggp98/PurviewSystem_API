package com.silence.purview.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private Integer userId;
  private String userName;
  private String userAccount;
  private String userPwd;
  private Integer userStatus;
  private java.sql.Timestamp createTime;

}
