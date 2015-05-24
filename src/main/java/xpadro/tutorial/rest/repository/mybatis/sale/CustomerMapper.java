package xpadro.tutorial.rest.repository.mybatis.sale;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xpadro.tutorial.rest.model.mybatis.sale.Customer;
import xpadro.tutorial.rest.model.mybatis.sale.CustomerExample;

public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer c_CUSTKEY);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Integer c_CUSTKEY);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}