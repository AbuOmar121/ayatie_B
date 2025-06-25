package com.ayatie.ayat.repository;

import com.ayatie.ayat.model.Ayat;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AyatRepository extends JpaRepository<Ayat, Integer> {

    void deleteById(int id);

    Optional<Ayat> findById(int id);
}
