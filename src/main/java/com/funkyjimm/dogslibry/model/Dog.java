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
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String breedName;
    @ManyToOne
    private DogGroup dogGroup;
    private float dogSize;
    private float dogWeight;
    @ManyToOne
    private Origin dogOrigin;
    @Lob
    private String dogDescription;

    @ManyToMany(mappedBy = "dogs")
    private Set<Classification> dogClassifications = new HashSet<>();

    public Dog(String breedName, DogGroup dogGroup, float dogSize, float dogWeight, Origin dogOrigin, String dogDescription) {
        this.breedName = breedName;
        this.dogGroup = dogGroup;
        this.dogSize = dogSize;
        this.dogWeight = dogWeight;
        this.dogOrigin = dogOrigin;
        this.dogDescription = dogDescription;
    }
}
