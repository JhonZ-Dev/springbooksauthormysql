package com.example.springmysql.modelosjr;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "autoresjr")
@Data
public class AutoresJR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_autorjr;
    private int aniojr;
    private LocalDate anionacimientojr;
    private String nombrejr;

    //relacion de uno a muchos con libros
    @OneToMany(mappedBy = "id_autor", cascade = CascadeType.ALL)
    private List<LibroJR> libros;
}
