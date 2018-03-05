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
public enum ServletEnum {
    CHOOSECITY("/ChooseCity");
    private ServletEnum(String name)
    {
        this.name = name;
    }
    private String name;
    public String getUrlPattern()
    {
        return name;
    }
}
