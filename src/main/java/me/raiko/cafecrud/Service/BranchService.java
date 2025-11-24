package me.raiko.cafecrud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import me.raiko.cafecrud.Model.Branch;
import me.raiko.cafecrud.Repository.BranchRepository;

@Service
public class BranchService {
    private final BranchRepository branchRepository;

    public BranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    // Service Methods
    public List<Branch> findAllBranches() {
        return branchRepository.findAll();
    }

    public Optional<Branch> findById(@NonNull Long id) {
        return branchRepository.findById(id);
    }

    public Branch save(@NonNull Branch branch) {
        return branchRepository.save(branch);
    }

    public void deleteBranch(@NonNull Branch branch) {
        branchRepository.delete(branch);
    }
}
