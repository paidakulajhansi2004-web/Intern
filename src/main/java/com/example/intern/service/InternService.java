package com.example.intern.service;

import com.example.intern.entity.Intern;
import java.util.List;

public interface InternService {

    Intern saveIntern(Intern intern);

    Intern getInternById(Long id);

    List<Intern> getAllInterns();

    void deleteIntern(Long id);
}