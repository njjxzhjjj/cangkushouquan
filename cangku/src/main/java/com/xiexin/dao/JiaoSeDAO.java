package com.xiexin.dao;

import com.xiexin.bean.JiaoSe;
import com.xiexin.bean.JiaoSeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JiaoSeDAO {
    long countByExample(JiaoSeExample example);

    int deleteByExample(JiaoSeExample example);

    int deleteByPrimaryKey(Integer jiaoSeId);

    int insert(JiaoSe record);

    int insertSelective(JiaoSe record);

    List<JiaoSe> selectByExample(JiaoSeExample example);

    JiaoSe selectByPrimaryKey(Integer jiaoSeId);

    int updateByExampleSelective(@Param("record") JiaoSe record, @Param("example") JiaoSeExample example);

    int updateByExample(@Param("record") JiaoSe record, @Param("example") JiaoSeExample example);

    int updateByPrimaryKeySelective(JiaoSe record);

    int updateByPrimaryKey(JiaoSe record);
}