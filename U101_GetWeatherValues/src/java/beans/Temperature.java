package beans;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

public class Temperature {

    @XmlType
    @XmlEnum(String.class)
    public static enum UnitEnum {
        KELVIN("kelvin"),
        CELSIUS("celsius");

        private UnitEnum(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        private final String name;
    }

    private float value;
    private float min;
    private float max;
    private UnitEnum unit;

    public Temperature() {
    }

    @XmlAttribute(name="value")
    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @XmlAttribute(name="min")
    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    @XmlAttribute(name="max")
    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    @XmlAttribute(name="unit")
    public UnitEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }
    
    @XmlTransient
    public String getFormattedValue()
    {
        return (unit==UnitEnum.KELVIN) ? (value+" / ") : (" / "+value);
    }
}
