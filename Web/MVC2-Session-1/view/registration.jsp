<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <link href="metacube.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Metacube</title>
    </head>

    <body>
        <div id="wrapper">
            <header>
                METACUBE SOFTWARE
            </header>
            <div id="container">
                <div id='cssmenu'>
                    <ul>
                        <li><a href="index.jsp"><span>Home</span></a>
                        </li>
                        <li><a href="registration.jsp"><span>Registration</span></a>
                        </li>
                        <li><a href="employeelist.jsp"><span>Employee List</span></a>
                        </li>
                        <li class='last'><a href='#'><span>Contact</span></a>
                        </li>
                    </ul>

                    <h2 style="margin-left:30%;">Employee Registration Form</h2>
                    <div>
                        <form action="/MVC2/registration">
                            <table style="margin-left:30%;">
                                <tr>
                                    <td>EmployeeId:</td>
                                    <td>
                                        <input type="number" name="id" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Name:</td>
                                    <td>
                                        <input type="text" name="name" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Email:</td>
                                    <td>
                                        <input type="email" name="email" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Age:</td>
                                    <td>
                                        <input type="number" name="age" required>
                                    </td>
                                </tr>
                            </table>
                            <input style="margin-left:40%;" type="submit" value="Register">
                        </form>

                    </div>
                </div>
            </div>
            </div>
            <footer> &copy 2011 Metacube Software Pvt. Ltd. All rights reserved.
            </footer>
    </body>

    </html>