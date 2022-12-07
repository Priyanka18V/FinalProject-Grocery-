package com.example.demo.repository;

import com.example.demo.domain.Order;
import com.example.demo.domain.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    List<Order> findAllOrdersByCustomer_UsernameOrderByIssuedOn(String customerName);

    List<Order> findAllOrdersByStatus_OrderByIssuedOn(Status status);

    List<Order> findAllOrdersByCustomerUsernameAndStatus_OrderByIssuedOn(String customerName, Status status);
}
