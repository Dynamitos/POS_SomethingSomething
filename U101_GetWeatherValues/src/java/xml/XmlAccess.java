package xml;

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
