package br.com.fiap.springpgadvocacia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_ADV_TIPO_DE_ACAO")
public class TipoDeAcao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ADV_TIPO_DE_ACAO")
    @SequenceGenerator(
            name = "SQ_ADV_TIPO_DE_ACAO",
            sequenceName = "SQ_ADV_TIPO_DE_ACAO",
            allocationSize = 1
    )
    @Column(name = "ADV_ID_TIPO_DE_ACAO")
    private Long id;
    @Column(name = "ADV_NOME_TIPO_DE_ACAO")
    private String nome;

}
