package com.ayatie.ayat.controller;

import com.ayatie.ayat.model.Quraan;
import com.ayatie.ayat.service.QuraanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/api/quraan")
@CrossOrigin
public class QuraanController {
    
    @Autowired
    private QuraanService quraanService;

    @GetMapping
    public List<Quraan> getAllQuraans() {
        return quraanService.getAllQuraan();
    }

    @PostMapping
    public Quraan addQuraan(@RequestBody Quraan quraan) {
        return quraanService.addQuraan(quraan);
    }

}
