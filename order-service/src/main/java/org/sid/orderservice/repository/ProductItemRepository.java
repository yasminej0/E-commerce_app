package org.sid.orderservice.repository;

import org.sid.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {

public Collection<ProductItem> findByBillId(Long id);
}
