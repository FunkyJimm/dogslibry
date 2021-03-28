package model;

import java.util.HashSet;
import java.util.Set;

public class Dog {
    private String breedName;
    private String dogGroup;
    private float dogSize;
    private float dogWeight;
    private String dogOrigin;
    private String dogDescription;

    private Set<Classification> dogClassifications = new HashSet<>();

    public Dog() {
    }

    public Dog(String breedName, String dogGroup, float dogSize, float dogWeight, String dogOrigin, String dogDescription) {
        this.breedName = breedName;
        this.dogGroup = dogGroup;
        this.dogSize = dogSize;
        this.dogWeight = dogWeight;
        this.dogOrigin = dogOrigin;
        this.dogDescription = dogDescription;
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public String getDogGroup() {
        return dogGroup;
    }

    public void setDogGroup(String dogGroup) {
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

    public String getDogOrigin() {
        return dogOrigin;
    }

    public void setDogOrigin(String dogOrigin) {
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