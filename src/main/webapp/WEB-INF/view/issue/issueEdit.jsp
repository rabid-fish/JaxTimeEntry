<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<tiles:insertDefinition name="layoutDefault">
	<tiles:putAttribute name="title" value="Issue Edit" />
	<tiles:putAttribute name="body">

<form:form modelAttribute="issue" method="post">
	<form:errors path="*"></form:errors>
	<table>
		<tr>
			<td>Id</td>
			<td><form:input path="id" />
			</td>
			<td><form:errors path="id" />
			</td>
		</tr>
		<tr>
			<td>Project Id</td>
			<td><form:input path="projectId" />
			</td>
			<td><form:errors path="projectId" />
			</td>
		</tr>
		<tr>
			<td>Title</td>
			<td><form:input path="title" />
			</td>
			<td><form:errors path="title" />
			</td>
		</tr>
		<tr>
			<td>Description</td>
			<td><form:input path="description" />
			</td>
			<td><form:errors path="description" />
			</td>
		</tr>
		<tr>
			<td colspan="3"><input type="submit" /></td>
		</tr>
	</table>
</form:form>

	</tiles:putAttribute>
</tiles:insertDefinition>
