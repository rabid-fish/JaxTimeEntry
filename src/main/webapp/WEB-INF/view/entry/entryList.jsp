<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<tiles:insertDefinition name="layoutDefault">
	<tiles:putAttribute name="title" value="Entry List" />
	<tiles:putAttribute name="body">

<h3>Entries</h3>

<c:if test="${empty list}">
<p>${message}</p>
</c:if>

<c:if test="${not empty list}">
	<div class="tableWrapper">
		<table class="display dataTable">
			<thead>
				<tr>
					<th>Id</th>
					<th>User Id</th>
					<th>Issue Id</th>
					<th>Entry Date</th>
					<th>Hours</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="entry">
					<tr>
						<td class="center"><a href="update?id=${entry.id}">${entry.id}</a></td>
						<td class="center"><a href="update?id=${entry.id}">${entry.userId}</a></td>
						<td class="center"><a href="update?id=${entry.id}">${entry.issueId}</a></td>
						<td class="center"><a href="update?id=${entry.id}">${entry.entryDate}</a></td>
						<td class="center"><a href="update?id=${entry.id}">${entry.hours}</a></td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<th>Id</th>
					<th>User Id</th>
					<th>Issue Id</th>
					<th>Entry Date</th>
					<th>Hours</th>
				</tr>
			</tfoot>
		</table>
	</div>
</c:if>

<a href="create" class="button">Create a new Entry</a>

	</tiles:putAttribute>
</tiles:insertDefinition>
