import Seminar6.clinic.cliens.Owner;
import Seminar6.clinic.patients.Animal;
import Seminar6.clinic.support.Vaccination;
import patients.impl.Dog;
import patients.impl.cat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clinicmain {
    public static void main(String[] args) {

        Owner boris = new Owner(1, "Борис");

        Dog barbos = new Dog();

        Animal tom = new cat(
                1L,
                "Tom",
                "seam",
                LocalDate.of(2023, 5, 13),
                new Owner(2, "Елена"), 13); // экземпляр класса Animal - конкретный представитель класса - шаблона

        List<Animal> patients = new ArrayList<Animal>(List.of(barbos, tom));
        System.out.println(patients);

        System.out.println(barbos.getVaccinations());

        barbos.inject(new Vaccination("От чумки"));

        System.out.println(barbos.getVaccinations());

        barbos.inject(new Vaccination("От столбняка"));

        System.out.println(barbos.getVaccinations());

        barbos.inject(new Vaccination("фывафвыафывафыва"));

        System.out.println(barbos.getVaccinations());

//        String s = Vaccination.name;
    }
}