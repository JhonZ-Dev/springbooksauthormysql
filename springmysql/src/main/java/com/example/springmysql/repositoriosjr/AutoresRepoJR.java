package com.example.springmysql.repositoriosjr;

import com.example.springmysql.modelosjr.AutoresJR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoresRepoJR extends JpaRepository<AutoresJR, Long> {
}
