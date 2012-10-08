<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Anexos :.</title>
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
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
        <div class="Estilo4" id="Layer7">Nro. de Documento </div>
        
      </div>
     
      <div class="Estilo3" id="Layer4">Nro : <input name="textnro" type="text" size="10" value="${expediente.tiponumeroanio}"/>  </div>
      <div class="Estilo3" id="Layer5">Fecha Ingreso : <input name="textfeching" type="text" size="12" value="${expediente.docfchcre}" />  </div>
      <div class="Estilo3" id="Layer6">Estado : <input name="textestado" type="text" size="16"  value="${expediente.estados.stsdsc}" /> </div>
    </div>
    <hr />
    <div id="Layer8">
  <hr />
</div>
	
	
	<table>
		<tr>
			<th>Nro. Doc</th>
			<th>Fec. Inicio</th>
			<th>Fec. Fin</th>
			<th>UO ORIGEN</th>
			<th>Asunto</th>
			<th>Observacion</th>
			<th>Ubicacion Folio</th>
		</tr>
		<c:if test="${empty lista}">
		<tr>
			<td colspan="7">No se han encontrado resultados</td>
		</tr>
		</c:if>
		<c:if test="${not empty lista}">
		<c:forEach items="${lista}" var="anexo">
		<tr>
			<th>${anexo.nroDocumento}</th>
			<th>${anexo.fecInicio}</th>
			<th>${anexo.fecFin}</th>
			<th>${anexo.origen}</th>
			<th>${anexo.asunto}</th>
			<th>${anexo.observacion}</th>
			<th>${anexo.ubicacionFolio}</th>
		</tr>
		</c:forEach>
		</c:if>
	</table>
	
	<div id="Layer63"><input type="submit" name="Submit" value="Imprimir" /> </div>
	<div id="Layer64"><input type="reset" name="Submit2" value="Salir" /> </div>
	
</div>
</div>

</form>

</body>
</html>
