    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Students List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Age</th><th>Branch</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="student100" items="${list}"> 
    <tr>
    <td>${student100.id}</td>
    <td>${student100.name}</td>
    <td>${student100.age}</td>
    <td>${student100.branch}</td>
    <td><a href="editstudent100/${student100.id}">Edit</a></td>
    <td><a href="deletestudent100/${student100.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="empform">Add New Student</a>