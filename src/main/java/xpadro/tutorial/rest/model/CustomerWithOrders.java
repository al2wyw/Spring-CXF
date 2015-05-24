package xpadro.tutorial.rest.model;

import xpadro.tutorial.rest.model.mybatis.sale.Customer;
import xpadro.tutorial.rest.model.mybatis.sale.Orders;

import java.util.List;

/**
 * Created by apple on 24/05/2015.
 */
public class CustomerWithOrders {
    private Customer customer;
    private List<Orders> orders;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
