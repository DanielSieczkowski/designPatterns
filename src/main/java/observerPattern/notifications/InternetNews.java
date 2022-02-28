package observerPattern.notifications;

import observerPattern.weatherForecast.WeatherForecast;

public class InternetNews implements Observer{

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: " + weatherForecast.getTemperature()
                + " stopni, ciśnienie: " + weatherForecast.getPressure()+"hPa");
    }
}
