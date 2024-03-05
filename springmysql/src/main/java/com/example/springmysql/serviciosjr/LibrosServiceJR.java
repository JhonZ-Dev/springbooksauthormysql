package com.example.springmysql.serviciosjr;

import com.example.springmysql.modelosjr.AutoresJR;
import com.example.springmysql.modelosjr.LibroJR;
import com.example.springmysql.repositoriosjr.LibrosRepoJr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibrosServiceJR {

    @Autowired
    private LibrosRepoJr librosRepoJr;

    //metodo para guardar
    public LibroJR guardarlibros(LibroJR libroJR, AutoresJR id_autor){
        //relacion
        libroJR.setId_autor(id_autor);
        return librosRepoJr.save(libroJR);
    }
}
