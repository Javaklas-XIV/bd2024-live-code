package com.infosupport.h13;

import com.infosupport.h7.Human;
import com.infosupport.h7.Person;

import java.util.ArrayList;
import java.util.List;

import static com.infosupport.h13.Util.verwerkSafeContravariant;
import static com.infosupport.h13.Util.verwerkSafeCovariant;
import static com.infosupport.h13.Util.verwerkSafeInvariant;
import static com.infosupport.h13.Util.verwerkSafeRaw;
import static com.infosupport.h13.Util.verwerkUnsafeRaw;

public class Demo {

    // Generics = Generic types
    public static void main(String[] args) {
        List personenUnsafe = new ArrayList();
        personenUnsafe.add(new Person("Bram", 44));
        personenUnsafe.add(new Person("Leon", 24));
        personenUnsafe.add("Corne");

        verwerkSafeRaw(personenUnsafe);
        verwerkUnsafeRaw(personenUnsafe);

        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Bram", 44));
        personen.add(new Person("Leon", 24));
        // personen.add("Corne"); // NOK

        verwerkSafeRaw(personen);
        verwerkUnsafeRaw(personen);
        verwerkSafeInvariant(personen);

        verwerkSafeInvariant(new Person("Bram", 44));
        verwerkSafeInvariant(new Trainee());

        List<Human> humans = new ArrayList<>();
        List<Trainee> trainees = new ArrayList<>();

        // call site (argument)
        // verwerkSafeCovariant(humans); super persons not allowed
        verwerkSafeCovariant(personen);
        verwerkSafeCovariant(trainees);

        verwerkSafeContravariant(humans);
        verwerkSafeContravariant(personen);
        // verwerkSafeContravariant(trainees); // sub persons not allowed
    }


}
