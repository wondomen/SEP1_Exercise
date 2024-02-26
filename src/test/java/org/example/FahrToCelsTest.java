package org.example;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FahrToCelsTest {
    @Test
    public void testConvertFahr() {
        assertEquals(0, FahrToCels.convertFahr(32), 0.01);
        assertEquals(100, FahrToCels.convertFahr(212), 0.01);
        assertEquals(37, FahrToCels.convertFahr(98.6f), 0.01);
    }
    @Test
    public void testKelvinToCel() {
        assertEquals(0, FahrToCels.kelvinToCel(273.15f), 0.01);
        assertEquals(100, FahrToCels.kelvinToCel(373.15f), 0.01);
        assertEquals(37, FahrToCels.kelvinToCel(310.15f), 0.01);
    }
}