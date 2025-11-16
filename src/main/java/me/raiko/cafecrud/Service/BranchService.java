package me.raiko.cafecrud.Service;

import me.raiko.cafecrud.Model.Branch;
import me.raiko.cafecrud.Repository.BranchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Branch> findById(Long id) {
        return branchRepository.findById(id);
    }

    public Branch save(Branch branch) {
        return branchRepository.save(branch);
    }

    public void deleteBranch(Branch branch) {
        branchRepository.delete(branch);
    }
}
