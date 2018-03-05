/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author Stefan Högler
 */
public class LastUpdate {
    private LocalDateTime value;

    public LastUpdate() {
    }

    @XmlAttribute(name="value")
    @XmlJavaTypeAdapter(DateAdapter.class)
    public LocalDateTime getValue() {
        return value;
    }
    
    @XmlTransient
    public String getFormattedDate()
    {
        return value.format(DateTimeFormatter.ofPattern("dd.MM.YYYY"));
    }
    
    public void setValue(LocalDateTime value) {
        this.value = value;
    }
    
}
