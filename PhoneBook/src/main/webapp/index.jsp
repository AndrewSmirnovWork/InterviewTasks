<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Middle Name</th>
        <th>position</th>
    </tr>

    <!-- loop over and print our customers -->
    <c:forEach var="tempPerson" items="${persons}">
        <c:url var="updateLink" value="/person/showFormForUpdate">
            <c:param name="personId" value="${tempPerson.id}"></c:param>
        </c:url>

        <c:url var="deleteLink" value="/customer/deleteCustomer">
            <c:param name="personId" value="${tempPerson.id}"></c:param>
        </c:url>

        <tr>
            <td> ${tempPerson.firstName} </td>
            <td> ${tempPerson.lastName} </td>
            <td> ${tempPerson.middleName} </td>
            <td> ${tempPerson.position} </td>
            <td><a href="${updateLink}">Update </a>
                |
                <a href="${deleteLink}"
                   onclick="if (!(confirm('Are you sure you want to delete this person?'))) return false">Delete </a>
            </td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
