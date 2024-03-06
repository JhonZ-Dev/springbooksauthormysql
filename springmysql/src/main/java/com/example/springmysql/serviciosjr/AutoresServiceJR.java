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
    //metodo para editar
    public AutoresJR editar (AutoresJR autoresJR, Long id_autorjr){
        Optional<AutoresJR> existe = encontrarPorId(id_autorjr);
        if(existe.isPresent()){
            //procedo con la actualizacino
            AutoresJR autoresJRExistente = existe.get();
            autoresJRExistente.setAniojr(autoresJR.getAniojr());
            autoresJRExistente.setAnionacimientojr(autoresJR.getAnionacimientojr());
            autoresJRExistente.setNombrejr(autoresJR.getNombrejr());
            return repoJR.save(autoresJRExistente);
        }else{
            throw new IllegalArgumentException("El autor con el ID proporcionado no existe");
        }
    }

    // En tu servicio AutoresServiceJR

    public List<AutoresJR> listarPorFechaNacimiento(int inicio, int fin) {
        return repoJR.findByAnioNacimientoBetween(inicio, fin);
    }



}
