public class ConversorTemperatura {
    public static void main(String[] args) {
        double temperaturaCelcius = 24.3;
        double temperaturaFahrenheit = (temperaturaCelcius*1.8)+32;
        String mensaje = String.format("La temperatura %.1f en grados Celcius equivale a %.1f en grados Fahrenheit",temperaturaCelcius, temperaturaFahrenheit);
        System.out.println(mensaje);

        int temperaturaFahrenheitEntera = (int) temperaturaFahrenheit;

        System.out.println("la temperatura en grados Fahrenheit es "+temperaturaFahrenheitEntera);
    }
}
