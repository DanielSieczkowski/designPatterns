package observerPattern.notifications;

import observerPattern.weatherForecast.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
