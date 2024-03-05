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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ADV_ADVOGADO")
    @SequenceGenerator(
            name = "SQ_ADV_ADVOGADO",
            sequenceName = "SQ_ADV_ADVOGADO",
            allocationSize = 1
    )
    @Column(name = "ADV_ID_ADVOGADO")
    private Long id;
    @Column(name = "ADV_NOME_ADVOGADO")
    private String nome;
    @Column(name = "ADV_NUMERO_OAB")
    private String numeroOAB;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "ADV_ESTADO_ADVOGADO",
            referencedColumnName = "ADV_ID_ESTADO",
            foreignKey = @ForeignKey(name = "FK_ADVOGADO_ESTADO")
    )
    private Estado estado;
}
