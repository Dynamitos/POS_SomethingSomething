/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author Stefan Högler
 */
public class Sun {
    private LocalDateTime rise;
    private LocalDateTime set;

    public Sun() {
    }
    @XmlAttribute(name="rise")
    @XmlJavaTypeAdapter(DateAdapter.class)
    public LocalDateTime getRise() {
        return rise;
    }
    public void setRise(LocalDateTime rise) {
        this.rise = rise;
    }

    @XmlAttribute(name="set")
    @XmlJavaTypeAdapter(DateAdapter.class)
    public LocalDateTime getSet() {
        return set;
    }

    public void setSet(LocalDateTime set) {
        this.set = set;
    }
    
}
