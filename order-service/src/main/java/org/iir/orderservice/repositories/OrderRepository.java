package org.iir.orderservice.repositories;

import org.iir.orderservice.entities.Order;
import org.iir.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order,Long> {
    @RestResource(path = "/byCustomerId")
    List<Order> findAllByCustomerId(@Param("customerId") Long customerId);
}
