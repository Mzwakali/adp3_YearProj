package ac.za.cput.factory;

import ac.za.cput.domain.Caretaker;
import ac.za.cput.util.Misc;

public class CareTakerFactory {
    public static Caretaker getCareTaker(String firstName, String lastName, int age) {
        return new Caretaker.Builder().age(age)
                .keeperFirstName(firstName)
                .keeperLastName(lastName)
                .keeperId(Misc.generateId())
                .build();
    }
}
