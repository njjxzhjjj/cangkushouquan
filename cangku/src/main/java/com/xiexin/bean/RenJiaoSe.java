package com.xiexin.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * ren_jiao_se
 * @author 
 */
@ToString// lombok的插件的注解，不用写tostring
@Data
public class RenJiaoSe implements Serializable {
    private Integer renJiaoseId;

    private Integer renId;

    private Integer jiaoseId;

    private static final long serialVersionUID = 1L;


}