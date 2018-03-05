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
public class Humidity {
    private float value;
    public Humidity()
    {
    }
    @XmlAttribute(name="value")
    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
}
