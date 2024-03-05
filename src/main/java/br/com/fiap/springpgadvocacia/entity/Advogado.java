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
@Table(name = "TB_ADV_ADVOGADO")
public class Advogado {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ADVOGADO")
    @SequenceGenerator(
            name = "SQ_ADVOGADO",
            sequenceName = "SQ_ADVOGADO",
            allocationSize = 1
    )
    @Column(name = "ID_ADVOGADO")
    private Long id;
    @Column(name = "NOME_ADVOGADO")
    private String nome;
    @Column(name = "NUMERO_OAB_ADVOGADO")
    private String numeroOAB;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "ESTADO_ADVOGADO",
            referencedColumnName = "ID_ESTADO",
            foreignKey = @ForeignKey(name = "FK_ADVOGADO_ESTADO")
    )
    private Estado estado;
}
