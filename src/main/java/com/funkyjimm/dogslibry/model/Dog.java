package com.funkyjimm.dogslibry.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    public Dog() {
    }

    public Dog(String breedName, DogGroup dogGroup, float dogSize, float dogWeight, Origin dogOrigin, String dogDescription) {
        this.breedName = breedName;
        this.dogGroup = dogGroup;
        this.dogSize = dogSize;
        this.dogWeight = dogWeight;
        this.dogOrigin = dogOrigin;
        this.dogDescription = dogDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public DogGroup getDogGroup() {
        return dogGroup;
    }

    public void setDogGroup(DogGroup dogGroup) {
        this.dogGroup = dogGroup;
    }

    public float getDogSize() {
        return dogSize;
    }

    public void setDogSize(float dogSize) {
        this.dogSize = dogSize;
    }

    public float getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(float dogWeight) {
        this.dogWeight = dogWeight;
    }

    public Origin getDogOrigin() {
        return dogOrigin;
    }

    public void setDogOrigin(Origin dogOrigin) {
        this.dogOrigin = dogOrigin;
    }

    public String getDogDescription() {
        return dogDescription;
    }

    public void setDogDescription(String dogDescription) {
        this.dogDescription = dogDescription;
    }

    public Set<Classification> getDogClassifications() {
        return dogClassifications;
    }

    public void setDogClassifications(Set<Classification> dogClassifications) {
        this.dogClassifications = dogClassifications;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedName='" + breedName + '\'' +
                ", dogGroup='" + dogGroup + '\'' +
                ", dogSize=" + dogSize +
                ", dogWeight=" + dogWeight +
                ", dogOrigin='" + dogOrigin + '\'' +
                ", dogDescription='" + dogDescription + '\'' +
                ", dogClassifications=" + dogClassifications +
                '}';
    }
}
