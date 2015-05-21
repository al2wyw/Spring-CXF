package xpadro.tutorial.rest.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xpadro.tutorial.rest.model.mybatis.Partsupp;
import xpadro.tutorial.rest.model.mybatis.PartsuppExample;
import xpadro.tutorial.rest.model.mybatis.PartsuppKey;

public interface PartsuppMapper {
    int countByExample(PartsuppExample example);

    int deleteByExample(PartsuppExample example);

    int deleteByPrimaryKey(PartsuppKey key);

    int insert(Partsupp record);

    int insertSelective(Partsupp record);

    List<Partsupp> selectByExample(PartsuppExample example);

    Partsupp selectByPrimaryKey(PartsuppKey key);

    int updateByExampleSelective(@Param("record") Partsupp record, @Param("example") PartsuppExample example);

    int updateByExample(@Param("record") Partsupp record, @Param("example") PartsuppExample example);

    int updateByPrimaryKeySelective(Partsupp record);

    int updateByPrimaryKey(Partsupp record);
}