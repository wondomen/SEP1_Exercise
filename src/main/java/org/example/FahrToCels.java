package org.example;
public class FahrToCels{
    public static float convertFahr(float f) {
        float c = (float) ((f - 32) * 5 / 9.0);
        return Math.round(c);
    }
    public static float kelvinToCel(float kel) {
        return (float) (kel - 273.15);
    }
}

