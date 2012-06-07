<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<tiles:insertDefinition name="layoutDefault">
	<tiles:putAttribute name="title" value="Role Edit" />
	<tiles:putAttribute name="body">

<form:form modelAttribute="role" method="post">
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
			<td>Name</td>
			<td><form:input path="name" />
			</td>
			<td><form:errors path="name" />
			</td>
		</tr>
		<tr>
			<td colspan="3"><input type="submit" /></td>
		</tr>
	</table>
</form:form>

	</tiles:putAttribute>
</tiles:insertDefinition>

