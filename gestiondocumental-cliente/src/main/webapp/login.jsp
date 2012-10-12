<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Recibo :.</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
</head>
<body>

	<c:if test="${not empty param.login_error}">
		<div class="errors" style="color: #000;" align="right">
			No pudo ingresar al sistema, Intentelo nuevamente.<br />
			Razon: ${sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message}
		</div>
	</c:if>
					
					
	<form name="f" action="${pageContext.request.contextPath}/j_spring_security_check" method="post">
	
		<table align="right" width="250px">
			<tr>
				<td>Usuario</td>
				<td>
					<c:if test="${not empty param.login_error}">
						<c:set var="username" value="${sessionScope.SPRING_SECURITY_LAST_USERNAME}"/>
					</c:if>
					<input type="text" name="j_username" size="15" value="${username}"/>
				</td>
				<td></td>
			</tr>	
			<tr>
				<td>Contrase&ntilde;a</td>
				<td><input type="password" name="j_password" size="15" value=""/></td>
				<td> </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login" /></td>
				<td></td>
			</tr>		
		</table>
	
	</form>
	
					
</body>
</html>