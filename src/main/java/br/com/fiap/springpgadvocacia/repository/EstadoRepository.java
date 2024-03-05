package br.com.fiap.springpgadvocacia.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
