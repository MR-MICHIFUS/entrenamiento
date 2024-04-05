package com.ejemplo.indra.store.shoppingservice.repository;

import com.ejemplo.indra.store.shoppingservice.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
