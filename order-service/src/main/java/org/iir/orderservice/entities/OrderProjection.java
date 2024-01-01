package org.iir.orderservice.entities;

import org.iir.orderservice.enums.orderStatus;
import org.iir.orderservice.model.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "fullOrder",types = Order.class)
public interface OrderProjection {
    Long getId();
    Date getCreatedAt();
    Long getCustomerId();
    orderStatus getStatus();


}
