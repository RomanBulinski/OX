import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCOde {


    @Test
    public void testOXtrue(){
        Ox ox = new Ox();
        assertTrue(ox.getXO("xo"));
    }


    @Test
    public void testOXtrue2(){
        Ox ox = new Ox();
        assertTrue(ox.getXO("fdsgasd"));
    }


    @Test
    public void testOXFalse(){
        Ox ox = new Ox();
        assertFalse(ox.getXO("xxjjjjo"));
    }



}
