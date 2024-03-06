package com.example.springmysql.repositoriosjr;

import com.example.springmysql.modelosjr.AutoresJR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AutoresRepoJR extends JpaRepository<AutoresJR, Long> {
    @Query(value = "SELECT * FROM autoresjr WHERE YEAR(anionacimientojr) BETWEEN ?1 AND ?2", nativeQuery = true)
    List<AutoresJR> findByAnioNacimientoBetween(int inicio, int fin);


    List<AutoresJR> findByAniojrBefore(int aniojr);


}
