package Seminar6.clinic.patients;

import Seminar6.clinic.cliens.Owner;
import Seminar6.clinic.support.Vaccination;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Animal {

    protected Long id;

    protected String name;

    protected String breed;

    protected LocalDate birthDate;

    protected Owner owner;

    protected List<Vaccination> vaccinations = new ArrayList<>();

    public Animal() {
        this.id = -1L; // поле id в Animal присывиваем значение, которое приходит из вне поля id. this - это ссылка на объект в котором находимся
        this.name = "Animal";
        this.birthDate = LocalDate.now();
        this.owner = new Owner(-1L, "Test");
        this.breed = "дворовой";
    }

    public Animal(Long id, String name, String breed, LocalDate birthDate, Owner owner) {
        this.id = id; // поле id в Animal присывиваем значение, которое приходит из вне поля id. this - это ссылка на объект в котором находимся
        this.name = name;
        this.breed = breed;
        this.birthDate = birthDate;
        this.owner = owner;
    }

    public Animal(String name, String breed, LocalDate birthDate, Owner owner) {
        this.id = id; // поле id в Animal присывиваем значение, которое приходит из вне поля id. this - это ссылка на объект в котором находимся
        this.name = name;
        this.breed = breed;
        this.birthDate = birthDate;

    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getName(String sample) {
        return sample;
        }

    public void inject(Vaccination v) {
        this.vaccinations.add(v);
    }

    @Override
    public String toString() {
        return name + " " + breed;
    }
}
