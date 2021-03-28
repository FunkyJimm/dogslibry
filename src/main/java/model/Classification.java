package model;

public class Classification {
    private String organizationName;
    private String classificationType;

    public Classification() {
    }

    public Classification(String organizationName, String classificationType) {
        this.organizationName = organizationName;
        this.classificationType = classificationType;
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

    @Override
    public String toString() {
        return "Classification{" +
                "organizationName='" + organizationName + '\'' +
                ", classificationType='" + classificationType + '\'' +
                '}';
    }
}
