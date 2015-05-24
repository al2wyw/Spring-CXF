package xpadro.tutorial.rest.repository;

import xpadro.tutorial.rest.model.CustomerWithOrders;

/**
 * Created by apple on 24/05/2015.
 */
public interface CustomerWithOrdersMapper {
    CustomerWithOrders getCustomerWithOrdersById(int i);
}
