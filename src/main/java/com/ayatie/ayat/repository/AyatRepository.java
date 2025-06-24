package com.ayatie.ayat.repository;

import com.ayatie.ayat.model.Ayat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AyatRepository extends JpaRepository<Ayat, String> {
}
