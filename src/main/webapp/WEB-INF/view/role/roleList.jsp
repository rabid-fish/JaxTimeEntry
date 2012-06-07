<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<tiles:insertDefinition name="layoutDefault">
	<tiles:putAttribute name="title" value="Role List" />
	<tiles:putAttribute name="body">

<h3>Roles</h3>

<c:if test="${empty list}">
<p>${message}</p>
</c:if>

<c:if test="${not empty list}">
	<div class="tableWrapper">
		<table class="display dataTable">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="role">
					<tr>		
						<td class="center"><a href="update?id=${role.id}">${role.id}</a></td>
						<td><a href="update?id=${role.id}">${role.name}</a></td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<th>Id</th>
					<th>Name</th>
				</tr>
			</tfoot>
		</table>
	</div>
</c:if>

<a href="create" class="button">Create a new Role</a>

	</tiles:putAttribute>
</tiles:insertDefinition>
