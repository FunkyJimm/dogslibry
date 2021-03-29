package com.funkyjimm.dogslibry.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Entity
public class Classification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String organizationName;
    private String classificationType;

    @ManyToMany
    private Set<Dog> dogs = new HashSet<>();

    public Classification(String organizationName, String classificationType) {
        this.organizationName = organizationName;
        this.classificationType = classificationType;
    }
}
