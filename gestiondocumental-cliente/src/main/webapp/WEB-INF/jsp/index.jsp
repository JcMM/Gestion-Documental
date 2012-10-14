<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Gestion Documental :.</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/layer.css" type="text/css" />
</head>
<body>

	<jsp:include page="cabecera.jsp"/>
	

<form action="datosGenerales.htm" method="post">
<div id="bodyPan">
  <div id="leftPan">
  
  <div class="Estilo5" id="Layer65">Consultas Tr&aacute;mite Documentario </div>
  
    <div id="Layer2">
      <div id="Layer3">
        <div align="center" class="Estilo2">
          <p>&nbsp;</p>
          <hr />
          <p>&nbsp;</p>
          
          <div align="center" style="color: red"> <c:out value="${msgError}"/> </div>
          
        </div>
        <div class="Estilo4" id="Layer7">INGRESE NUMERO DE DOCUMENTO: </div>        
      </div>
      </div>
    	<hr />
    	
    <div id="Layer8"> <input name="textndocumento1" type="text" class="textposition" size="6" maxlength="4"/> </div>
	
	<div class="Estilo4" id="Layer9">TIPO DE DOCUMENTO: </div>
	<div id="Layer10"><input name="textndocumento2" type="text" size="13" maxlength="10"/> </div>
	
    <div class="Estilo4" id="Layer13">
      <label>
      <select name="select">
      	<option value="">-ELIGE-</option>
      	<option value="EXPE">EXPE</option>
      </select>
      </label>
    </div>
	
    <div id="Layer17">
  		<label></label>
  		<hr />
  		<hr />
	</div>
	<div id="Layer63"><input type="submit" name="Submit" value="Consultar" /></div>
    
  </div>
  
</div>
</form>
</body>
</html>
