package ac.za.cput.factory;

import ac.za.cput.domain.Zoo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZooFactoryTest {

    @Test
    public void getZoo() {
        String name = "App Dev Play House";
        Zoo z = ZooFactory.getZoo(name);
        System.out.println(z);
        Assert.assertNotNull(z.getZooAddress());
    }
}