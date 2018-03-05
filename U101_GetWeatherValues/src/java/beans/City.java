package beans;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class City {
    private int id;
    private String name;
    private Coord coords;
    private Sun sun;
    public City() {
    }
    @XmlAttribute(name="id")
    public int getId() {
        return id;
    }
    @XmlAttribute(name="name")
    public String getName() {
        return name;
    }
    @XmlElement(name="coord")
    public Coord getCoords() {
        return coords;
    }
    @XmlElement(name="sun")
    public Sun getSun() {
        return sun;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoords(Coord coords) {
        this.coords = coords;
    }

    public void setSun(Sun sun) {
        this.sun = sun;
    }
    
}
