<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.CurrentRoot" %>
<%@page import="resources.ResourceEnum" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <label>City: ${Root.city.name} at ${Root.lastUpdate.formattedDate}</label>
            <table>
                <tr>
                    <td>Temperature [Kelvin/Celsius]</td>
                    <td>Humidity [%]</td>
                    <td>Pressure [hPa]</td>
                </tr>
                <tr>
                    <td>${Root.temp.formattedValue}</td>
                    <td>${Root.humidity.value}</td>
                    <td>${Root.pressure.value}</td>
                </tr>
                
            </table>
        </div>
    </body>
</html>
