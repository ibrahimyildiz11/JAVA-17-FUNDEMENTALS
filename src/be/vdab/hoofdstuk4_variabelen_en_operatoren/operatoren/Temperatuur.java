package be.vdab.hoofdstuk4_variabelen_en_operatoren.operatoren;

public class Temperatuur {
    public static void main(String[] args) {
        float tempCelcius = 37.0F;
        float tempFahr = tempCelcius * 9 / 5 + 32;

        System.out.println("Temperatuur in graden Celcius: " + tempCelcius);
        System.out.println("Temperatuur in graden  Fahrenheit: " + tempFahr);
    }
}
