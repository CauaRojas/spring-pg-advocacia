package br.com.fiap.springpgadvocacia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_ADV_ESTADO")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADV_ESTADO")
    @SequenceGenerator(
            name = "SQ_ESTADO",
            sequenceName = "ADV_ESTADO",
            allocationSize = 1
    )
    @Column(name = "ID_ESTADO")
    private Long id;
    @Column(name = "NOME_ESTADO")
    private String nome;
    @Column(name = "SIGLA_ESTADO")
    private String sigla;
}
