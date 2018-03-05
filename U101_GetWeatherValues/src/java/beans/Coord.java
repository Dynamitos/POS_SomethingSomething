package beans;

import javax.xml.bind.annotation.XmlAttribute;

public class Coord {
    private float lon;
    private float lat;
    public Coord() {
    }
    @XmlAttribute(name="lon")
    public float getLon() {
        return lon;
    }
    public void setLon(float lon) {
        this.lon = lon;
    }

    @XmlAttribute(name="lat")
    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }
    

}
