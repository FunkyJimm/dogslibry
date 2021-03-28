package com.funkyjimm.dogslibry.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Classification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String organizationName;
    private String classificationType;

    @ManyToMany
    private Set<Dog> dogs = new HashSet<>();

    public Classification() {
    }

    public Classification(String organizationName, String classificationType) {
        this.organizationName = organizationName;
        this.classificationType = classificationType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getClassificationType() {
        return classificationType;
    }

    public void setClassificationType(String classificationType) {
        this.classificationType = classificationType;
    }

    public Set<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "Classification{" +
                "id=" + id +
                ", organizationName='" + organizationName + '\'' +
                ", classificationType='" + classificationType + '\'' +
                ", dogs=" + dogs +
                '}';
    }
}
