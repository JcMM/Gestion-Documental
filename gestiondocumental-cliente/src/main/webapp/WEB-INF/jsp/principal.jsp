<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Principal :.</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/layer.css" type="text/css" />
</head>
<body>

	<jsp:include page="cabecera.jsp"/>
	
	<form:form action="." modelAttribute="expediente">
	 
		<div id="bodyPan">
			<div id="leftPan">
				<div id="Layer2">
					<div id="Layer3">
						<div align="center" class="Estilo5">
							<p>Documento / Expediente</p>
							<hr />
							<p></p>
						</div>
						<hr />
						<div class="Estilo4" id="Layer7">Solicitante :</div>
					</div>
					<div class="Estilo3" id="Layer4"> Nro  :  <input name="textnro" type="text" size="10" value="${expediente.tiponumeroanio}" />  </div>
					<div class="Estilo3" id="Layer5"> Fecha Ingreso : <input name="textfeching" type="text" size="12" value="${expediente.docfchcre}" />  </div>
					<div class="Estilo3" id="Layer6">Estado : <input name="textestado" type="text" size="16" value="${expediente.estados.stsdsc}" /> </div>
				</div>
				<hr />
				<div id="Layer8">
					<label> <input name="textsolicitante" type="text" class="textposition" size="59" /> </label>
				</div>
				<div class="Estilo4" id="Layer9">Dni :</div>
				<div id="Layer10">
					<label> <input type="text" name="textdni" value="${expediente.personas.dni}" /> </label>
				</div>
				<div id="Layer11">
					<label> <input type="text" name="textruc" /> </label>
				</div>
				<div class="Estilo4" id="Layer12">Ruc :</div>

				<div class="Estilo4" id="Layer13">Asunto :</div>

				<div class="Estilo4" id="Layer14">Folios :</div>
				<div class="Estilo5" id="Layer15">Ubicaci&oacute;n Actual</div>
				<div id="Layer16">
					<label> <input name="textasunto" type="text" size="59" /> </label>
				</div>
				<div id="Layer17">
					<label> <input name="textfolios" type="text" size="59" /> </label>
				</div>
				<div class="Estilo4" id="Layer18">U.O. Destino :</div>
				<div id="Layer19">
					<label> <input name="textuodestino" type="text" size="59" /> </label>
				</div>
				<div class="Estilo4" id="Layer20">Cargo Destino :</div>
				<div id="Layer21">
					<label> <input name="textcdestino" type="text" size="59" value="${expediente.cargo.cardsc}" /> </label>
				</div>
				<div class="Estilo4" id="Layer22">Fecha Recepci&oacute;n :</div>
				<div id="Layer23">
					<label> <input type="text" name="textfield3" /> </label>
				</div>
				<div class="Estilo5" id="Layer24">Datos de Direcci&oacute;n :
				</div>
				<div class="Estilo4" id="Layer25">Fiscal :</div>
				<div id="Layer26">
					<label> <input name="textfiscal" type="text" size="59" value="${expediente.docdirfisc}" /> </label>
				</div>
				<div class="Estilo4" id="Layer27">Correspondencia :</div>
				<div id="Layer28">
					<label> <input name="textcorrespondencia" type="text" size="59" value="${expediente.docdircorc}" /> </label>
				</div>
				<div class="Estilo4" id="Layer29">Inmueble :</div>
				<div id="Layer30">
					<label> <input name="textinmueble" type="text" size="59" value="${expediente.dvigucdir}" /> </label>
				</div>
				<div class="Estilo4" id="Layer31">Observaciones :</div>
				<div id="Layer32">
					<label> <input name="textobservaciones" type="text" size="59" value="${expediente.docobs}" /> </label>
				</div>
				<div class="Estilo4" id="Layer33">Observaci&oacute;n Situacional :</div>
				<div id="Layer34">
					<label> <input name="textosituacional" type="text" size="55" /> </label>
				</div>
				<div class="Estilo4" id="Layer35">Telefono Fijo :</div>
				<div class="Estilo4" id="Layer36">Celular :</div>
				<div class="Estilo4" id="Layer37">Correo :</div>
				<div id="Layer38">
					<label> <input name="texttfijo" type="text" size="18" /> </label>
				</div>
				<div id="Layer39">
					<label> <input name="textcelular" type="text" size="18" /> </label>
				</div>
				<div id="Layer40">
					<label> <input name="textcorreo" type="text" size="59" /> </label>
				</div>
				<div class="Estilo6" id="Layer41">Hoja Cargo ?</div>
				<div id="Layer42">
					<label> <input name="texthcargo" type="text" size="5" value="${expediente.docflghc}" /> </label>
				</div>
				<div id="Layer43">
					<label> <input name="texthcargot" type="text" size="45" /> </label>
				</div>
				<div class="Estilo6" id="Layer44">Anexado ?</div>
				<div id="Layer45">
					<label> <input name="textanexado" type="text" size="5" value="${expediente.docflganx}" /> </label>
				</div>
				<div class="Estilo6" id="Layer46">Archivado ?</div>
				<div id="Layer47">
					<label> <input name="textarchivado" type="text" size="5" value="${expediente.docflgarc}" /> </label>
				</div>
				<div class="Estilo5" id="Layer48">Auditoria</div>
				<div class="Estilo7" id="Layer49">Creaci&oacute;n</div>
				<div class="Estilo4" id="Layer50">Usuario :</div>
				<div id="Layer51">
					<label> <input name="textcusuario" type="text" size="15" value="${expediente.usuariosa.usrlog}" /> </label>
				</div>
				<div class="Estilo4" id="Layer52">Fecha :</div>
				<div id="Layer53">
					<label> <input name="textcfecha" type="text" size="12" value="${expediente.docfchcre}" /> </label>
				</div>
				<div class="Estilo4" id="Layer54">Hora :</div>
				<div id="Layer55">
					<label> <input name="textchora" type="text" size="10" /> </label>
				</div>
				<div class="Estilo7" id="Layer56">Modificaci&oacute;n</div>
				<div class="Estilo4" id="Layer57">Usuario :</div>
				<div id="Layer58">
					<label> <input name="textmusuario" type="text" size="15" value="${expediente.usuariosb.usrlog}" /> </label>
				</div>
				<div class="Estilo4" id="Layer59">Fecha :</div>
				<div id="Layer60">
					<label> <input name="textmfecha" type="text" size="12" value="${expediente.docfchmod}" /> </label>
				</div>
				<div class="Estilo4" id="Layer61">Hora :</div>
				<div id="Layer62">
					<label> <input name="textmhora" type="text" size="10" /> </label>
				</div>
				<div id="Layer63">
					<label> <input type="submit" name="Submit" value="Imprimir" /> </label>
				</div>
				<div id="Layer64">
					<label> <input type="reset" name="Submit2" value="Salir" /> </label>
				</div>

			</div>
		</div>
</form:form>
</body>
</html>