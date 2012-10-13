<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Admin - Usuarios :.</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/layer.css" type="text/css" />
</head>
<body>

	<jsp:include page="../cabecera.jsp"/>
	
	<form:form action="." modelAttribute="expediente">
	 
		<div id="bodyPan">
			<div id="leftPan">
				
				Lista de usuarios y documentos consultados
				
				usuario uno 
				usuario dos
				

			</div>
		</div>
</form:form>
</body>
</html>