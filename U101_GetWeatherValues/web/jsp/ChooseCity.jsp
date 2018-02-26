<%-- 
    Document   : ChooseCity
    Created on : Feb 26, 2018, 11:43:52 AM
    Author     : Stefan Högler
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="bootstrap3.css">
        <title>Get_WeatherValues</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Enter your city</h1>
        <form method="GET" action="">
            <table>
                <tr>
                    <td>
                        <h2>City:</h2>
                    </td>
                    <td>
                        <input type="text"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="get weather data"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>