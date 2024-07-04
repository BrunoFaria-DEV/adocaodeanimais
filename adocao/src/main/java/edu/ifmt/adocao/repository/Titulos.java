package edu.ifmt.adocao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.ifmt.adocao.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {
}
