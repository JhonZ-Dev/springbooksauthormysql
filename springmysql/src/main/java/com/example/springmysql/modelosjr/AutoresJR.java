package com.example.springmysql.modelosjr;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

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

    //relacion de uno a muchos
    @OneToMany(mappedBy = "id_autor", cascade = CascadeType.ALL)
    private LibroJR libroJR;
}
