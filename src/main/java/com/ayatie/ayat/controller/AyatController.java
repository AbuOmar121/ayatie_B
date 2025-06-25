package com.ayatie.ayat.controller;

import com.ayatie.ayat.model.Ayat;
import com.ayatie.ayat.service.AyatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ayat")
@CrossOrigin
public class AyatController {

    @Autowired
    private AyatService ayatService;

    @GetMapping
    public List<Ayat> getAllAyat() {
        return ayatService.getAllAyat();
    }

    @PostMapping
    public Ayat addAyat(@RequestBody Ayat ayat) {
        return ayatService.addAyat(ayat);
    }

    @PutMapping("/{id}")
    public Ayat updateAyat(@PathVariable int id, @RequestBody Ayat ayat) {
        return ayatService.updateAyat(id, ayat);
    }

    @DeleteMapping("/{id}")
    public void deleteAyat(@PathVariable int id) {
        ayatService.deleteAyat(id);
    }
}