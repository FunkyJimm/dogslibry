package com.funkyjimm.dogslibry.model;

import javax.persistence.*;

@Entity
public class DogGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String gName;
    private String gDescription;

    public DogGroup() {
    }

    public DogGroup(String gName, String gDescription) {
        this.gName = gName;
        this.gDescription = gDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgDescription() {
        return gDescription;
    }

    public void setgDescription(String gDescription) {
        this.gDescription = gDescription;
    }

    @Override
    public String toString() {
        return "DogGroup{" +
                "gName='" + gName + '\'' +
                ", gDescription='" + gDescription + '\'' +
                '}';
    }
}
