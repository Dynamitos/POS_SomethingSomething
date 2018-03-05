/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

/**
 *
 * @author Högler Stefan
 */
public enum ResourceEnum {
    CHOOSECITY("/jsp/ChooseCity.jsp"),
    EXCEPTIONHANDLER("/jsp/ExceptionHandler.jsp"),
    WEATHERVALUES("/jsp/WeatherValues.jsp");
    private String name;
    private ResourceEnum(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
