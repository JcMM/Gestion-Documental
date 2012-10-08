<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Recibo :.</title>
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
        <p>&nbsp;</p>
        <p>&nbsp;</p> 
        
        <div class="Estilo5" id="Layer7">Recibo Emitido </div>
        <p>&nbsp;</p>
      </div>
       <div class="Estilo3" id="Layer4">Nro : 
      			<label><input name="textnro" type="text" size="10" value="${expediente.tiponumeroanio}"/> </label>
      </div>
      <div class="Estilo3" id="Layer5">Fecha Ingreso :
        <label> <input name="textfeching" type="text" size="12" value="${expediente.docfchcre}" /> </label>
      </div>
      <div class="Estilo3" id="Layer6">Estado :
        <input name="textestado" type="text" size="16"  value="${expediente.estados.stsdsc}" />
      </div>
    </div>
    <hr />    
	
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<table width="100%" border="1px" cellpadding="3" cellspacing="0">
		<tr>
			<th>Serie Comprobante</th>
			<th>Monto</th>
			<th>Fecha</th>
			<th>Comprobante emitido</th>
		</tr>
		<c:if test="${not empty recibo}">
			<td>${recibo.docrecser}</td>
			<td>${recibo.docrecmnt}</td>
			<td>${recibo.docrecfecc}</td>
			<td> <input type="checkbox" name="checkbox" value="checkbox" /> </td>	
		</c:if>
	</table>
	
		<p>&nbsp;</p>
		<p>&nbsp;Detalle Recibo :</p>
	 	<p>&nbsp;</p>
	
	
	<table width="100%" border="1px" cellpadding="3" cellspacing="0">
		<tr>
			<th>Item</th>
			<th>Concepto de Pago</th>
			<th>Importe</th>
		</tr>
		<c:if test="${not empty lista}">
			<c:forEach items="${lista}" var="detalle"  varStatus="rowNum">
				<td>${rowNum.count}</td>
				<td>${detalle.concepto}</td>
				<td>${detalle.importe}</td>
			</c:forEach>
		</c:if>	
	</table>
	
	
	<div id="Layer63"> <input type="submit" name="Submit" value="Consulta" />  </div>
	<div id="Layer64"> <input type="reset" name="Submit2" value="Salir" />	</div>
	
	</div>
	</div>


</form>

</body>
</html>
