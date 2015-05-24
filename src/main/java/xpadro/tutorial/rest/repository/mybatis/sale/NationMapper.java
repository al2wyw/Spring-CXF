package xpadro.tutorial.rest.repository.mybatis.sale;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xpadro.tutorial.rest.model.mybatis.sale.Nation;
import xpadro.tutorial.rest.model.mybatis.sale.NationExample;

public interface NationMapper {
    int countByExample(NationExample example);

    int deleteByExample(NationExample example);

    int deleteByPrimaryKey(Integer n_NATIONKEY);

    int insert(Nation record);

    int insertSelective(Nation record);

    List<Nation> selectByExample(NationExample example);

    Nation selectByPrimaryKey(Integer n_NATIONKEY);

    int updateByExampleSelective(@Param("record") Nation record, @Param("example") NationExample example);

    int updateByExample(@Param("record") Nation record, @Param("example") NationExample example);

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);
}