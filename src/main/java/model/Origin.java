package model;

public class Origin {
    private String countryName;
    private String countryCapital;

    public Origin() {
    }

    public Origin(String countryName, String countryCapital) {
        this.countryName = countryName;
        this.countryCapital = countryCapital;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    @Override
    public String toString() {
        return "Origin{" +
                "countryName='" + countryName + '\'' +
                ", countryCapital='" + countryCapital + '\'' +
                '}';
    }
}
