package beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "current")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class CurrentRoot {

    private City city;
    private Temperature temp;
    private Humidity humidity;
    private Pressure pressure;
    private Wind wind;
    private Clouds clouds;
    private Weather weather;
    private LastUpdate lastUpdate;

    public CurrentRoot() {
    }

    @XmlElement(name = "city")
    public City getCity() {
        return city;
    }

    @XmlElement(name = "temperature")
    public Temperature getTemp() {
        return temp;
    }

    @XmlElement(name = "humidity")
    public Humidity getHumidity() {
        return humidity;
    }

    @XmlElement(name = "pressure")
    public Pressure getPressure() {
        return pressure;
    }

    @XmlElement(name = "wind")
    public Wind getWind() {
        return wind;
    }

    @XmlElement(name = "clouds")
    public Clouds getClouds() {
        return clouds;
    }

    @XmlElement(name = "weather")
    public Weather getWeather() {
        return weather;
    }

    @XmlElement(name = "lastupdate")
    public LastUpdate getLastUpdate() {
        return lastUpdate;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public void setLastUpdate(LastUpdate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    

}
