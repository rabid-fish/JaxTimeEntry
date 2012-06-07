<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<tiles:insertDefinition name="layoutDefault">
	<tiles:putAttribute name="title" value="Welcome" />
	<tiles:putAttribute name="body">

<h1>Welcome</h1>
<p>${message}</p>

<h2>Here's a list of entities:</h2>
<ul>
	<li><a href="user/list">User</a></li>
	<li><a href="role/list">Role</a></li>
	<li><a href="project/list">Project</a></li>
	<li><a href="issue/list">Issue</a></li>
	<li><a href="entry/list">Entry (Time Entry)</a></li>
</ul>

<p id="updateTime">The server-side time is: <span id="theTime"></span></p>

	</tiles:putAttribute>
</tiles:insertDefinition>
