<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<tiles:insertDefinition name="layoutDefault">
	<tiles:putAttribute name="title" value="User List" />
	<tiles:putAttribute name="body">

<c:if test="${empty list}">
<p>${message}</p>
</c:if>

<c:if test="${not empty list}">
	<div class="tableWrapper">
		<table class="dataTable">
			<thead>
				<tr>
					<th>Id</th>
					<th>Full Name</th>
					<th>Username</th>
					<th>Password</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="user">
					<tr>
						<td class="center"><a class="modal" href="update?id=${user.id}">${user.id}</a></td>
						<td><a class="modal" href="update?id=${user.id}">${user.fullname}</a></td>
						<td><a class="modal" href="update?id=${user.id}">${user.username}</a></td>
						<td><a class="modal" href="update?id=${user.id}">${user.password}</a></td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<th>Id</th>
					<th>Full Name</th>
					<th>Username</th>
					<th>Password</th>
				</tr>
			</tfoot>
		</table>
	</div>
	
</c:if>

<div class="buttonWrapper">
	<a class="button modal" href="create">Create a new User</a>
</div>

	</tiles:putAttribute>
</tiles:insertDefinition>
