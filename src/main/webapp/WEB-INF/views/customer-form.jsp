<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/7/2022
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Save Customer</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>

</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>CRM - Customer Relationship Manager</h2>
        </div>
    </div>
    <div id="container">
        <h3>save student</h3>
        <f:form action="saveCustomer" modelAttribute="customer" method="POST">
            <table>
                <tbody>
                    <tr>
                       <td><label>First Name:</label></td>
                        <td><f:input path="firstName"/></td>
                    </tr>
                    <tr>
                        <td><label>Last Name:</label></td>
                        <td><f:input path="lastName"/></td>
                    </tr>
                    <tr>
                        <td><label>Email:</label></td>
                        <td><f:input path="email"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="save" class="save" /></td>
                    </tr>
                </tbody>
            </table>
        </f:form>
        <br>
        <br>
        <p>
            <a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
        </p>
    </div>
</body>
</html>
