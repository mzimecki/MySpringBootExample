<!DOCTYPE html>
<html lang ="en">
<body>
	<h1> List of users</h1>
	<#if users?has_content>
		<ul>
			<#list users as u>
				<li>Id: ${u.getId()}, Name: ${u.getName()}</li>
			</#list>
		</ul>
	<#else>
		No users added yet! Please use REST service to do so, for e.g. POST {"name": "John"} using /users or the form below.
	</#if>
	
	</br></br>
	
	<fieldset>
    	<legend>Add User</legend>
  		<form name="user" action="add" method="post">
    		Name: <input type="text" name="name" /> <br/>
	    	<input type="submit" value="Save" />
  		</form>
  	</fieldset>
</body>
</html>