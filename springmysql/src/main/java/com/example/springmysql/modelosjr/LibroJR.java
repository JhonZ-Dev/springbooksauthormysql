package com.example.springmysql.modelosjr;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table(name = "librosjr")
@Data
public class LibroJR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_librojr;
    private String isbnjr;
    private int numerospagjr;
    @CreationTimestamp
    private LocalDate fechapublicacionjr;
    private String titulo;
    @ManyToOne
    @JoinColumn(name = "id_autor") // Nombre de la columna que almacena la clave externa
    private AutoresJR id_autor;


}
