package com.example.springmysql.repositoriosjr;

import com.example.springmysql.modelosjr.LibroJR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrosRepoJr extends JpaRepository<LibroJR, Long> {
}
