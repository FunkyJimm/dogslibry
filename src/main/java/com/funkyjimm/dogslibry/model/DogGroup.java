package com.funkyjimm.dogslibry.model;

import javax.persistence.*;

@Entity
public class DogGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String groupName;
    private String groupDescription;

    public DogGroup() {
    }

    public DogGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    @Override
    public String toString() {
        return "DogGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupDescription='" + groupDescription + '\'' +
                '}';
    }
}
