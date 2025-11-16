package me.raiko.cafecrud.Service;

import me.raiko.cafecrud.Model.Cafe;
import me.raiko.cafecrud.Repository.CafeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CafeService {
    private final CafeRepository cafeRepository;

    public CafeService(CafeRepository cafeRepository) {
        this.cafeRepository = cafeRepository;
    }

    // Service Methods
    public List<Cafe> findAllCafes() {
        return cafeRepository.findAll();
    }

    public Optional<Cafe> findById(Long id) {
        return cafeRepository.findById(id);
    }

    public List<Cafe> findAllCafe() {
        return cafeRepository.findAll();
    }

    public Cafe save(Cafe cafe) {
        return cafeRepository.save(cafe);
    }

    public void deleteCafe(Cafe cafe) {
        cafeRepository.delete(cafe);
    }
}
