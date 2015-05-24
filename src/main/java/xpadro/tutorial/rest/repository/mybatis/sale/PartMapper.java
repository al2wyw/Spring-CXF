package xpadro.tutorial.rest.repository.mybatis.sale;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xpadro.tutorial.rest.model.mybatis.sale.Part;
import xpadro.tutorial.rest.model.mybatis.sale.PartExample;

public interface PartMapper {
    int countByExample(PartExample example);

    int deleteByExample(PartExample example);

    int deleteByPrimaryKey(Integer p_PARTKEY);

    int insert(Part record);

    int insertSelective(Part record);

    List<Part> selectByExample(PartExample example);

    Part selectByPrimaryKey(Integer p_PARTKEY);

    int updateByExampleSelective(@Param("record") Part record, @Param("example") PartExample example);

    int updateByExample(@Param("record") Part record, @Param("example") PartExample example);

    int updateByPrimaryKeySelective(Part record);

    int updateByPrimaryKey(Part record);
}