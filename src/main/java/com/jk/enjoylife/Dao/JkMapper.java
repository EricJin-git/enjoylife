package com.jk.enjoylife.Dao;

import com.jk.enjoylife.Entity.Jk;
import com.jk.enjoylife.Entity.JkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JkMapper {
    List<Jk> selectall();
    long countByExample(JkExample example);

    int deleteByExample(JkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jk record);

    int insertSelective(Jk record);

    List<Jk> selectByExample(JkExample example);

    Jk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jk record, @Param("example") JkExample example);

    int updateByExample(@Param("record") Jk record, @Param("example") JkExample example);

    int updateByPrimaryKeySelective(Jk record);

    int updateByPrimaryKey(Jk record);
}