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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ADV_ESTADO")
    @SequenceGenerator(
            name = "SQ_ADV_ESTADO",
            sequenceName = "SQ_ADV_ESTADO",
            allocationSize = 1
    )
    @Column(name = "ADV_ID_ESTADO")
    private Long id;
    @Column(name = "ADV_NOME_ESTADO")
    private String nome;
    @Column(name = "ADV_SIGLA_ESTADO")
    private String sigla;
}
