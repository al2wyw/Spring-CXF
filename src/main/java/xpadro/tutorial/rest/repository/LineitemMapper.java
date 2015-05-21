package xpadro.tutorial.rest.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xpadro.tutorial.rest.model.mybatis.Lineitem;
import xpadro.tutorial.rest.model.mybatis.LineitemExample;
import xpadro.tutorial.rest.model.mybatis.LineitemKey;

public interface LineitemMapper {
    int countByExample(LineitemExample example);

    int deleteByExample(LineitemExample example);

    int deleteByPrimaryKey(LineitemKey key);

    int insert(Lineitem record);

    int insertSelective(Lineitem record);

    List<Lineitem> selectByExample(LineitemExample example);

    Lineitem selectByPrimaryKey(LineitemKey key);

    int updateByExampleSelective(@Param("record") Lineitem record, @Param("example") LineitemExample example);

    int updateByExample(@Param("record") Lineitem record, @Param("example") LineitemExample example);

    int updateByPrimaryKeySelective(Lineitem record);

    int updateByPrimaryKey(Lineitem record);
    
    List<Lineitem> selectByPage(@Param("offset") int offset, @Param("limit") int limit);
}