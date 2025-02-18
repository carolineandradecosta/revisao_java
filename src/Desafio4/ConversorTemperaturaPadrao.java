package Desafio4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double temperaturaEmCelsius) {
        double temperaturaFahrenheit = (temperaturaEmCelsius * 9/5) + 32;
        System.out.println(temperaturaEmCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit");
    }

    @Override
    public void fahrenheitParaCelsius(double temperaturaEmfahrenheit) {
        double temperaturaCelsius =  (temperaturaEmfahrenheit - 32) * 5 / 9;
        System.out.println(temperaturaEmfahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius");
    }
}
