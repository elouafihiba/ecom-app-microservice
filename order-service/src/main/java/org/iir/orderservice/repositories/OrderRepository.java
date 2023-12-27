package org.iir.orderservice.repositories;

import org.iir.orderservice.entities.Order;
import org.iir.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order,Long> {

}
