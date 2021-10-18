package com.xiexin.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * jiao_se
 * @author 
 */
@ToString// lombok的插件的注解，不用写tostring
@Data
public class JiaoSe implements Serializable {
    private Integer jiaoSeId;

    private String jiaoSeName;

    private static final long serialVersionUID = 1L;

}