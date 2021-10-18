package com.xiexin.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * quan_xian
 * @author 
 */
@ToString// lombok的插件的注解，不用写tostring
@Data
public class QuanXian implements Serializable {
    private Integer quanXianId;

    /**
     * 菜单权限编码
     */
    private String quanXianCode;

    /**
     * 菜单权限名称
     */
    private String quanXianName;

    /**
     * 授权(如：sys:user:add)
     */
    private String quanXianPerms;

    private String quanXianUrl;

    private String quanXianMethod;

    private Integer quanXianPid;

    private Integer quanXianOrder;

    private Integer quanXianType;

    private Integer quanXianStatus;

    private static final long serialVersionUID = 1L;

}