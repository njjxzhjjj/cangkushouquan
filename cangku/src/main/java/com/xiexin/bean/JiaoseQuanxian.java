package com.xiexin.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * jiaose_quanxian
 * @author 
 */
@ToString// lombok的插件的注解，不用写tostring
@Data
public class JiaoseQuanxian implements Serializable {
    private Integer jiaoseQuanxianId;

    private Integer jiaoseId;

    private Integer quanxianId;

    private static final long serialVersionUID = 1L;

}