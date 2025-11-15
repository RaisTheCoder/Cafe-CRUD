package me.raiko.cafecrud.Repository;

import me.raiko.cafecrud.Model.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface CafeRepository extends JpaRepository<Cafe, Long> {
}
