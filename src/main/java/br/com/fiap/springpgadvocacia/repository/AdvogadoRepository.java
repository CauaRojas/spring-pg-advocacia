package br.com.fiap.springpgadvocacia.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface AdvogadoRepository extends JpaRepository<Advogado, Long> {
}
