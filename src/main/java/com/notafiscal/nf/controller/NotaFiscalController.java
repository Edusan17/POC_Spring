package com.notafiscal.nf.controller;

import java.util.List;

import com.notafiscal.nf.model.NotaFiscal;
import com.notafiscal.nf.repository.NotaFiscalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notafiscal")
@CrossOrigin(origins = "", allowedHeaders = "")
public class NotaFiscalController {

    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    @GetMapping
    public ResponseEntity<List<NotaFiscal>> getAll(){
        return ResponseEntity.ok(notaFiscalRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotaFiscal> getById(@PathVariable Long id){
        return notaFiscalRepository.findById(id)
                .map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

}
