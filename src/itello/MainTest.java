package itello;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cof on 2016-11-14.
 */
public class MainTest {
@Test
    public void itello(){
    String v ="itello";
    String everyOtherEncryption=Main.getEveryOtherEncryption(v);
    assertEquals("ieltlo",everyOtherEncryption);
}
@Test
    public void alphanumeric(){
    String v="Varannanbokstavskod 123 är lätt att skriva på papper!?.";
    String everyOtherEncryption=Main.getEveryOtherEncryption(v);
    assertEquals("Vrnabktvkd2ältatkiaåapraannosaso13rättsrvpppe", everyOtherEncryption);
}
}