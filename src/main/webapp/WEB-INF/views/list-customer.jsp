<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/7/2022
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Customer</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>CRM - Customer Relationship Manager</h2>
        </div>
    </div>
    <div id="container">
        <div id="content">
            <input type="button" value="Add Customer"
                   onclick="window.location.href='showFormForAdd';return false"
                   class="add-button"
            />

            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="tempCustomer"  items="${customers}">
                    <tr>
                        <td>${tempCustomer.firstName}</td>
                        <td>${tempCustomer.lastName}</td>
                        <td>${tempCustomer.email}</td>
                        <td>
<%--                            <c:url var="updateLink" value="/customer/showFormForUpdate">--%>
<%--                                <c:param name="customerId" value="${tempCustomer.id}"/>--%>
<%--                            </c:url>--%>
                            <a href="<c:url value="/customer/showFormForUpdate?customerId=${tempCustomer.id}"/>">update</a>
                            <a href="<c:url value="/customer/delete?customerId=${tempCustomer.id}"/>"
                                onclick="if(!confirm('Are u sure delete customer ${tempCustomer.id}')) return false">
                                delete</a>

                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>
