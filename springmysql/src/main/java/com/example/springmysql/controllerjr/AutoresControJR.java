package com.example.springmysql.controllerjr;

import com.example.springmysql.modelosjr.AutoresJR;
import com.example.springmysql.repositoriosjr.AutoresRepoJR;
import com.example.springmysql.serviciosjr.AutoresServiceJR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AutoresControJR {

    @Autowired
    private AutoresServiceJR autoresServiceJR;

    @Autowired
    private AutoresRepoJR autoresRepoJR;

    //metodo para guardara;

    @PostMapping("/guardar")
    public AutoresJR autoresJR (@RequestBody AutoresJR autoresJR){
        return autoresServiceJR.guardar(autoresJR);
    }

    @GetMapping("/listarPorFechaNacimiento/{inicio}/{fin}")
    public List<AutoresJR> listarAutoresPorFechaNacimiento(@PathVariable("inicio") int inicio,
                                                           @PathVariable("fin") int fin) {
        return autoresServiceJR.listarPorFechaNacimiento(inicio, fin);
    }

    @GetMapping("/autoresEdadMayorA25")
    public List<AutoresJR> listarAutoresEdadMayorA25() {
        // Calcular el año hace 25 años
        int anioLimite = Year.now().getValue() - 25;

        // Llamar al método generado automáticamente
        return autoresRepoJR.findByAniojrBefore(anioLimite);
    }



}
