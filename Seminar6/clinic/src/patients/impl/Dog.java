package patients.impl;
import Seminar6.clinic.cliens.Owner;
import Seminar6.clinic.patients.Animal;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(Long id, String name, String breed, LocalDate birthDate, Owner owner) {
        super(id, name, breed, birthDate, owner);
    }

    public Dog(String name, String breed, LocalDate birthDate, Owner owner) {
        super(name, breed, birthDate, owner);
    }
}
