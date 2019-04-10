package ac.za.cput.factory;

import ac.za.cput.domain.Zoo;
import ac.za.cput.util.Misc;

public class ZooFactory {
    public static Zoo getZoo(String zooName) {
        return new Zoo.Builder().zooAddress(Misc.generateId())
                .zooName(zooName)
                .build();
    }
}
