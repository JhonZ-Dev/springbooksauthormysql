package com.example.springmysql.controllerjr;

import com.example.springmysql.modelosjr.AutoresJR;
import com.example.springmysql.modelosjr.LibroJR;
import com.example.springmysql.serviciosjr.LibrosServiceJR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/librosjr")
public class LibrosControJR {

    @Autowired
    private LibrosServiceJR librosServiceJR;

    //guarada
    @PostMapping("/guardarjr")
    public LibroJR libroJR(@RequestBody LibroJR  libroJR){
        return librosServiceJR.guardarlibros(libroJR);
    }
}
