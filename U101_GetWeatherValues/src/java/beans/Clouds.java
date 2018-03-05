/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Stefan Högler
 */
public class Clouds {
    private float value;
    private String name;

    public Clouds() {
    }
    @XmlAttribute(name="value")
    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    @XmlAttribute(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
