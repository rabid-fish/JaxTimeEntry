<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<tiles:insertDefinition name="layoutDefault">
	<tiles:putAttribute name="title" value="Issue List" />
	<tiles:putAttribute name="body">

<h3>Issues</h3>

<c:if test="${empty list}">
<p>${message}</p>
</c:if>

<c:if test="${not empty list}">
	<div class="tableWrapper">
		<table class="display dataTable">
			<thead>
				<tr>
					<th>Id</th>
					<th>Project Id</th>
					<th>Title</th>
					<th>Description</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="issue">
					<tr>
						<td class="center"><a href="update?id=${issue.id}">${issue.id}</a></td>
						<td class="center"><a href="update?id=${issue.id}">${issue.projectId}</a></td>
						<td><a href="update?id=${issue.id}">${issue.title}</a></td>
						<td><a href="update?id=${issue.id}">${issue.description}</a></td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<th>Id</th>
					<th>Project Id</th>
					<th>Title</th>
					<th>Description</th>
				</tr>
			</tfoot>
		</table>
	</div>
</c:if>

<a href="create" class="button">Create a new Issue</a>

	</tiles:putAttribute>
</tiles:insertDefinition>
