<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<tiles:insertDefinition name="layoutDefault">
	<tiles:putAttribute name="title" value="User Edit" />
	<tiles:putAttribute name="body">

	<form:form modelAttribute="user" method="post">
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
				<td>Fullname</td>
				<td><form:input path="fullname" />
				</td>
				<td><form:errors path="fullname" />
				</td>
			</tr>
			<tr>
				<td>Username</td>
				<td><form:input path="username" />
				</td>
				<td><form:errors path="username" />
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:input path="password" />
				</td>
				<td><form:errors path="password" />
				</td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>

	</tiles:putAttribute>
</tiles:insertDefinition>
