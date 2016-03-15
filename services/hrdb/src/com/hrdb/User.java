/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.hrdb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * User generated by hbm2java
 */
@Entity
@Table(name="`USER`"
    ,schema="PUBLIC"
)

public class User  implements java.io.Serializable {

    
    private Integer userid;
    
    private String username;
    
    private String password;
    
    private String role;
    
    private Integer tenantid;

    public User() {
    }


    @Id @GeneratedValue(strategy=IDENTITY)
    

    @Column(name="`USERID`", precision=10)
    public Integer getUserid() {
        return this.userid;
    }
    
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    

    @Column(name="`USERNAME`", length=20)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    

    @Column(name="`PASSWORD`", length=20)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    

    @Column(name="`ROLE`", length=20)
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    

    @Column(name="`TENANTID`", precision=10)
    public Integer getTenantid() {
        return this.tenantid;
    }
    
    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof User) )
		    return false;

		 User that = (User) o;

		 return ( (this.getUserid()==that.getUserid()) || ( this.getUserid()!=null && that.getUserid()!=null && this.getUserid().equals(that.getUserid()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getUserid() == null ? 0 : this.getUserid().hashCode() );

         return result;
    }


}

