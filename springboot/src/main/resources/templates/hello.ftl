<!DOCTYPE html>
<html lang ="en">
<body>
	<h1> List of users: </h1>
	<#if users?has_content>
		<#list users as u>
			<h4>ID: ${u.getId()}, Name: ${u.getName()}</h4>
		</#list>
	<#else>
		No users added yet! Please use REST service to do so, for e.g. POST: /users?name=John
	</#if>
</body>
</html>