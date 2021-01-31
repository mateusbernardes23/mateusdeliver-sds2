package com.mateus.devsuperior.mateusdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.devsuperior.mateusdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
