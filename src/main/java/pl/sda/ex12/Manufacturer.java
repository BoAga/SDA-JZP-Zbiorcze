package pl.sda.ex12;

public class Manufacturer {
    private String name;
    private String country;
    private String creationYear;

    public Manufacturer(String name, String country, String creationYear) {
        this.name = name;
        this.country = country;
        this.creationYear = creationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(String creationYear) {
        this.creationYear = creationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Manufacturer))
            return false;

        Manufacturer that = (Manufacturer) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null)
            return false;
        if (getCountry() != null ? !getCountry().equals(that.getCountry()) : that.getCountry() != null)
            return false;
        return getCreationYear() != null ? getCreationYear().equals(that.getCreationYear()) : that.getCreationYear() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
        result = 31 * result + (getCreationYear() != null ? getCreationYear().hashCode() : 0);
        return result;
    }
}
