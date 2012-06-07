<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<tiles:insertDefinition name="layoutDefault">
	<tiles:putAttribute name="title" value="Entry Edit" />
	<tiles:putAttribute name="body">

<form:form modelAttribute="entry" method="post">
	<form:errors path="*"></form:errors>
	<table>
		<tr>
			<td>Id</td>
			<td><form:input path="id" /></td>
			<td><form:errors path="id" /></td>
		</tr>
		<tr>
			<td>User Id</td>
			<td><form:input path="userId" /></td>
			<td><form:errors path="userId" /></td>
		</tr>
		<tr>
			<td>Issue Id</td>
			<td><form:input path="issueId" /></td>
			<td><form:errors path="issueId" /></td>
		</tr>
		<tr>
			<td>Entry Date</td>
			<td><form:input path="entryDate" /></td>
			<td><form:errors path="entryDate" /></td>
		</tr>
		<tr>
			<td>Hours</td>
			<td><form:input path="hours" /></td>
			<td><form:errors path="hours" /></td>
		</tr>
		<tr>
			<td colspan="3"><input type="submit" /></td>
		</tr>
	</table>
</form:form>

	</tiles:putAttribute>
</tiles:insertDefinition>
