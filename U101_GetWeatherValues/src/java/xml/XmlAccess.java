/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

/**
 *
 * @author Stefan Högler
 */
public class XmlAccess {
    private static XmlAccess instance;
    
    private XmlAccess()
    {
        
    }
    public static XmlAccess getInstance()
    {
        if(instance==null)
            instance = new XmlAccess();
        return instance;
    }
}
