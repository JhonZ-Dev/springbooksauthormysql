package com.example.springmysql.serviciosjr;

import com.example.springmysql.modelosjr.AutoresJR;
import com.example.springmysql.repositoriosjr.AutoresRepoJR;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoresServiceJR {

    @Autowired
    private AutoresRepoJR repoJR;

    //metodo para guardar
    public AutoresJR guardar (AutoresJR autoresJR){
        return repoJR.save(autoresJR);
    }

    //metodo apra listar
    public List<AutoresJR> listar(){
        return repoJR.findAll();
    }

    //metodo para eliminar
    public Optional<AutoresJR> encontrarPorId(Long id_autorjr){
        return repoJR.findById(id_autorjr);
    }
    public void eliminar(Long id_autorjr){
        repoJR.deleteById(id_autorjr);
    }
}
