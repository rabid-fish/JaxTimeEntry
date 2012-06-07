<jsp:include page="../../tile/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<c:if test="${empty entries}">
	<p>${message}</p>
	</c:if>
	
	<c:if test="${not empty entries}">
	<table>
		<tr>
			<th>Id</th>
			<th>User Id</th>
			<th>Issue Id</th>
			<th>Entry Date</th>
			<th>Hours</th>
		</tr>
		<c:forEach items="${entries}" var="entry">
			<tr>		
				<td>${entry.id}</td>
				<td>${entry.userId}</td>
				<td>${entry.issueId}</td>
				<td>${entry.entryDate}</td>
				<td>${entry.hours}</td>
			</tr>
		</c:forEach>
	</table>
	</c:if>
	
	<a href="create">Create a new Entry</a>

<jsp:include page="../../tile/footer.jsp" />
