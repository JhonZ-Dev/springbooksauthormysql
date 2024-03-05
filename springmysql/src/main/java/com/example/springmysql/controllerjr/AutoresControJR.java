package com.example.springmysql.controllerjr;

import com.example.springmysql.modelosjr.AutoresJR;
import com.example.springmysql.serviciosjr.AutoresServiceJR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/autorjr")
public class AutoresControJR {

    @Autowired
    private AutoresServiceJR autoresServiceJR;

    //metodo para guardara;

    @PostMapping("/guardar")
    public AutoresJR autoresJR (AutoresJR autoresJR){
        return autoresServiceJR.guardar(autoresJR);
    }

    
}
