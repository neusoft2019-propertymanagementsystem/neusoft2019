package com.neusoft.wuyemis.security.model;

import java.io.Serializable;
import java.util.Date;

/*
 * 模块：用户安全模块
 * Model层：
 * @Author: 张云强
 */
public class UserModel implements Serializable {
      private String id=null;
      private String password=null;
      private String name=null;
      private String role=null;
      private int age=0;
      private Date joinDate=null;
      public String getId() {
    	  return id;
      }
     public void setId(String id) {
    	 this.id = id;
     }
}
