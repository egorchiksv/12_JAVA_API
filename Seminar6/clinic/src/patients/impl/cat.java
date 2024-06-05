package patients.impl;

import Seminar6.clinic.cliens.Owner;
import Seminar6.clinic.patients.Animal;
import java.time.LocalDate;

public class cat extends Animal {

    public float height;

    public cat(float height, String tom, String seam, LocalDate localDate, Owner owner, int i) {
        this.height = height;
    }

    public cat(Long id, String name, String breed, LocalDate birthDate, Owner owner) {
        super(id, name, breed, birthDate, owner);
        this.height = 13;
    }

    public cat(String name, String breed, LocalDate birthDate, Owner owner) {
        super(name, breed, birthDate, owner);
    }
}
