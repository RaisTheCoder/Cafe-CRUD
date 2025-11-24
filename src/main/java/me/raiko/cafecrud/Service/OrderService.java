package me.raiko.cafecrud.Service;

import me.raiko.cafecrud.Model.Order;
import me.raiko.cafecrud.Repository.OrderRepository;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import me.raiko.cafecrud.Model.Branch;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // Service Methods
    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    public List<Order> findAllByBranch(@NonNull Branch branch) {
        return orderRepository.findAllByBranch(branch);
    }

    public Optional<Order> findById(@NonNull Long id) {
        return orderRepository.findById(id);
    }

    public Order save(@NonNull Order order) {
        return orderRepository.save(order);
    }

    public void delete(@NonNull Order order) {
        orderRepository.delete(order);
    }
}
