package xpadro.tutorial.rest.repository.mybatis.sale;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xpadro.tutorial.rest.model.mybatis.sale.Supplier;
import xpadro.tutorial.rest.model.mybatis.sale.SupplierExample;

public interface SupplierMapper {
    int countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(Integer s_SUPPKEY);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(Integer s_SUPPKEY);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}