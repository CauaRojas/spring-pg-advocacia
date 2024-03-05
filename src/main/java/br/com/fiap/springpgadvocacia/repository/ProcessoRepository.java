package br.com.fiap.springpgadvocacia.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long>{
}
