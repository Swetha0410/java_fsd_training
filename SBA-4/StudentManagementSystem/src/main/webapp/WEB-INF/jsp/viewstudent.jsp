    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Student List</h1>
	<table border="2" width="70%" cellpadding="2" color="pink">
	<tr><th>Id</th><th>Name</th><th>Physics</th><th>Chemistry</th><th> Biology</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="s" items="${list}"> 
    <tr>
    <td>${s.id}</td>
    <td>${s.name}</td>
    <td>${s.physics}</td>
    <td>${s.chemistry}</td>
    <td>${s.biology}</td>
    <td><a href="editstudent/${s.id}">Edit</a></td>
    <td><a href="deletestudent/${s.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="studentform">Add New Student</a>