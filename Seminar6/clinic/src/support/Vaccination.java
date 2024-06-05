package Seminar6.clinic.support;

public class Vaccination {
    public String name;

    public Vaccination(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
