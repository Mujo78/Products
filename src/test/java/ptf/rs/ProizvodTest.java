package ptf.rs;

import org.junit.Test;


public class ProizvodTest {

    @Test
    public void testEquals() {
        Proizvod a = new Proizvod("A", 2);
        Proizvod b = new Proizvod("A", 2);
        System.out.println(a.equals(b));
    }
}