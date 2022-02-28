package observerPattern.notifications;

import observerPattern.weatherForecast.WeatherForecast;

public class TvNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Tv - nowa prognoza pogody: " + weatherForecast.getTemperature()
                + " stopni, ciśnienie: " + weatherForecast.getPressure()+"hPa");
    }
}
