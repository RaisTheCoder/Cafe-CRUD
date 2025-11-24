package me.raiko.cafecrud.Repository;

import me.raiko.cafecrud.Model.Branch;
import me.raiko.cafecrud.Model.Order;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByBranch(Branch branch);
}
