package com.ayatie.ayat.service;

import com.ayatie.ayat.model.Ayat;
import com.ayatie.ayat.repository.AyatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AyatService {

    @Autowired
    private AyatRepository ayatRepository;

    public Ayat addAyat(Ayat ayat) {
        return ayatRepository.save(ayat);
    }

    public List<Ayat> getAllAyat() {
        return ayatRepository.findAll();
    }

    public Optional<Ayat> getAyatById(int id) {
        return ayatRepository.findById(id);
    }

    public void deleteAyat(int id) {
        ayatRepository.deleteById(id);
    }

    public Ayat updateAyat(int id, Ayat updatedAyat) {
        updatedAyat.setAid(id);
        return ayatRepository.save(updatedAyat);
    }
}
