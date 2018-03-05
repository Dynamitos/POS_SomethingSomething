
<%@page import="resources.ResourceEnum"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Redirecting</title>
    </head>
    <body>
        <% response.sendRedirect(pageContext.getServletContext().getContextPath() + ResourceEnum.CHOOSECITY.getName()); %>
    </body>
</html>
