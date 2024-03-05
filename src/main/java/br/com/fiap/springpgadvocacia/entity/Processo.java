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
@Table(name = "TB_ADV_PROCESSO")
public class Processo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PROCESSO")
    @SequenceGenerator(
            name = "SQ_PROCESSO",
            sequenceName = "SQ_PROCESSO",
            allocationSize = 1
    )
    @Column(name = "ID_PROCESSO")
    private Long id;

    @Column(name = "NUMERO_PROCESSO")
    private String numero;

    @Column(name = "PRO_BONO_PROCESSO")
    private Boolean proBono;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "ADVOGADO_PROCESSO",
            referencedColumnName = "ID_ADVOGADO",
            foreignKey = @ForeignKey(name = "FK_PROCESSO_ADVOGADO")
    )
    private Advogado advogado;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "TIPO_DE_ACAO_PROCESSO",
            referencedColumnName = "ID_TIPO_DE_ACAO",
            foreignKey = @ForeignKey(name = "FK_PROCESSO_TIPO_DE_ACAO")
    )
    private TipoDeAcao tipoDeAcao;
}
