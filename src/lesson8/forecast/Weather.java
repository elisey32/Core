package lesson8.forecast;

import java.util.List;

public class Weather {
    List<DailyForecasts> dailyforecasts;

    public Weather() {
    }

    public Weather(List<DailyForecasts> dailyforecasts) {
        this.dailyforecasts = dailyforecasts;
    }

    @Override
    public String toString() {
        return "Daily lesson8.forecast: " + dailyforecasts;
    }

    public List<DailyForecasts> getDailyforecasts() {
        return dailyforecasts;
    }

    public void setDailyforecasts(List<DailyForecasts> dailyforecasts) {
        this.dailyforecasts = dailyforecasts;
    }
}
