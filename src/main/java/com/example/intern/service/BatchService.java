package com.example.intern.service;

import com.example.intern.entity.Batch;
import java.util.List;

public interface BatchService {

    Batch saveBatch(Batch batch);

    List<Batch> getAllBatches();
}