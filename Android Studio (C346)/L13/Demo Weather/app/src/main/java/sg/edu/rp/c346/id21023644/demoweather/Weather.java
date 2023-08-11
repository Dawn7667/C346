package sg.edu.rp.c346.id21023644.demoweather;

public class Weather {
    String area;
    String forecast;

    public Weather(String area, String forecast){
        this.area = area;
        this.forecast = forecast;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString(){
        return "WEATHER \n" + "Area: " + area + "\n" + "Forecast: " + forecast;
    }
}


