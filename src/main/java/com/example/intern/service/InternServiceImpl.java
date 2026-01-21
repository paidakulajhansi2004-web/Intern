package com.example.intern.service;

import com.example.intern.entity.Intern;
import com.example.intern.repository.InternRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternServiceImpl implements InternService {

    private final InternRepository internRepository;

    public InternServiceImpl(InternRepository internRepository) {
        this.internRepository = internRepository;
    }

    @Override
    public Intern saveIntern(Intern intern) {
        return internRepository.save(intern);
    }

    @Override
    public Intern getInternById(Long id) {
        return internRepository.findById(id).orElse(null);
    }

    @Override
    public List<Intern> getAllInterns() {
        return internRepository.findAll();
    }

    @Override
    public void deleteIntern(Long id) {
        internRepository.deleteById(id);
    }
}