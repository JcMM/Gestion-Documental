<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Seguimiento :.</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/layer.css" type="text/css" />
</head>
<body>

	<jsp:include page="cabecera.jsp"/>
	
<form action="index.html" method="get">
<div id="bodyPan">
  <div id="leftPan">
    <div id="Layer2">
      <div id="Layer3">
        <div align="center" class="Estilo2">
          <p>Documento / Expediente </p>
          <hr />
          <p>&nbsp;</p>
        </div>
        <hr />
        <label></label>
        <div class="Estilo4" id="Layer7">Itm. Fecha </div>
        
      </div>
      
      <div class="Estilo3" id="Layer4">Nro : <input name="textnro" type="text" size="10" value="${expediente.tiponumeroanio}"/>  </div>
      <div class="Estilo3" id="Layer5">Fecha Ingreso : <input name="textfeching" type="text" size="12" value="${expediente.docfchcre}" />  </div>
      <div class="Estilo3" id="Layer6">Estado : <input name="textestado" type="text" size="16"  value="${expediente.estados.stsdsc}" /> </div>
      
    </div>
    <hr />
    <div id="Layer8"> <hr /> </div>
	
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
		
	<table width="100%" border="1" cellpadding="3" cellspacing="0">
		<tr>
			<th>Hora</th>
			<th>Tarea</th>
			<th>Estado</th>
			<th>UO Origen</th>
			<th>UO Destino</th>
			<th>Usuario</th>
			<th>Glosario Seguimiento</th>
		</tr>
		<c:if test="${not empty lista }">
		<c:forEach items="${lista}" var="seg">
		<tr>
			<th>${seg.seghra}</th>
			<th>${seg.tareas.tardsc}</th>
			<th>${seg.estados.stsdsc}</th>
			<th>${seg.origen}</th>
			<th>${seg.destino}</th>
			<th>${seg.usuario}</th>
			<th>${seg.segglo}</th>
		</tr>
		</c:forEach>
		</c:if>
	</table>
	<div id="Layer63">  <input type="submit" name="Submit" value="Imprimir" />  </div>
	<div id="Layer64"> <input type="reset" name="Submit2" value="Salir" /> </div>
		
  </div>
</div>

</form>

</body>
</html>
