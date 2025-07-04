package com.ayatie.ayat.service;

import com.ayatie.ayat.model.Quraan;
import com.ayatie.ayat.repository.QuraanRepository;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class QuraanService {

    private QuraanRepository quraanRepository;

    public Quraan addQuraan(Quraan quraan) {
        return quraanRepository.save(quraan);
    }

    public List<Quraan> getAllQuraan() {
        return quraanRepository.findAll();
    }

    public Optional<Quraan> getAyatById(int id) {
        return quraanRepository.findById(id);
    }

    public void deleteQuraan(int id) {
        quraanRepository.deleteById(id);
    }
}
