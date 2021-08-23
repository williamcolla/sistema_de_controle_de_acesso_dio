package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;


@Getter // Usado para não ser necessário colocar o método get
@Setter // Usado para não ser necessário colocar o método set
@AllArgsConstructor // Usado para não ser necessário colocar o construtor
@NoArgsConstructor // Usado para não ser necessário colocar o construtor vazio
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;
}
