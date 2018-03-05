/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Stefan Högler
 */
public class Wind {
    private Speed speed;
    private Direction direction;

    @XmlElement(name="speed")
    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    @XmlElement(name="direction")
    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Wind() {
    }
}
