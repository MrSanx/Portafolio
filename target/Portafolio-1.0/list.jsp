<%-- 
    Document   : list
    Created on : 20/09/2020, 6:13:00 p. m.
    Author     : sanx
--%>

<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<String> list = new ArrayList<String>();
    File f = new File("dataBase.txt");
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);

    String line;
    while ((line = br.readLine()) != null) {
        list.add(line);
    }

    br.close();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="sources\brand.png" type="image/icon type">
        <title>Contact List | Sanx Portafolio</title>
        <!--FONT AWESOME-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
        <!--FONT ROBOTO-->
        <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;0,500;1,400&display=swap"
              rel="stylesheet">
        <!--FONT OPEN SANS-->
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@700&display=swap" rel="stylesheet">
        <!--CUSTOM CSS-->
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <!--Just the header-->
        <div class="header">
            <nav class="nav-main">
                <!--Left Part-->
                <img src="sources\brand.png" alt="brand" class="nav-brand">
                <ul class="nav-menu">
                    <li>
                        <a href="index.html">Home</a>
                    </li>
                    <li>
                        <a href="portafolio.html">Portafolio</a>
                    </li>
                    <li>
                        <a href="about_me.html">About me</a>
                    </li>
                    <li>
                        <a href="contact.html">Contact</a>
                    </li>
                </ul>
                <!--Right Part-->
                <ul>
                    <li>
                        <a href="#">
                            <img src="sources\en.png" alt="Language" class="nav-languages">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <i class="fas fa-search"></i>
                        </a>
                    </li>
                </ul>
            </nav>
            <hr>
        </div>

        <div class ="formulary">
            <div class ="formulary-box">
                <div class="formulary-box2">
                    <h1>Sanx Portafolio</h1>
                    <h2>Contact List</h2>
                    <table>
                        <tbody>
                            <tr>
                                <th>Name      </th>
                                <th>Surname   </th>
                                <th>Company   </th>
                                <th>Mail      </th>
                                <th>Need      </th>
                                <th>Summary   </th>
                            </tr>
                            <% for (String element : list) { %>
                            <% String[] data = element.split(",");%>
                            <tr>
                                <td><%= data[0]%> </td>
                                <td><%= data[1]%> </td>
                                <td><%= data[2]%> </td>
                                <td><%= data[3]%> </td>
                                <% if (data[4].equals("1")) { %>
                                <td>Business </td>
                                <% } else if (data[4].equals("2")) { %>
                                <td>Information</td>
                                <% } else { %>
                                <td>N/A</td>
                                <% }%>
                                <td><%= data[5]%> </td>
                            </tr>
                            <% }%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
