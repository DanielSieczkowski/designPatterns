package observerPattern.notifications;

import observerPattern.weatherForecast.WeatherForecast;

public class RadioNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: " + weatherForecast.getTemperature()
                + " stopni, ciśnienie: " + weatherForecast.getPressure()+"hPa");
    }
}
