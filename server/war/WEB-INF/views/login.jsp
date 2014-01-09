<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
<h1>GAE + Struts 2 Example</h1>
 
<form action="/User/Welcome">
	<s:textfield name="user" />
	<s:submit />
</form>
 
</body>
</html>