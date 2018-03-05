/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Stefan Högler
 */
public class LastUpdate {
    private LocalDateTime value;

    public LastUpdate() {
    }

    @XmlAttribute(name="value")
    public LocalDateTime getValue() {
        return value;
    }

    public void setValue(LocalDateTime value) {
        this.value = value;
    }
    
}
