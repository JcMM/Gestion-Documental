<%@ taglib uri='http://www.springframework.org/security/tags' prefix='security'%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="topPan">
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p class="Estilo1">
		<a href="${pageContext.request.contextPath}/index.jsp"><span class="Estilo5">Gestion Documental</span> </a>
	</p>
	
	<ul>
		<security:authorize ifAnyGranted="ROLE_ADMIN">
		<li><a href="${pageContext.request.contextPath}/admin/usuarios.htm">Usuarios</a></li>
		</security:authorize>
	<c:if test="${s_expediente != null}">
		<li><a href="${pageContext.request.contextPath}/general.htm">Datos Generales</a></li>
		<li><a href="${pageContext.request.contextPath}/seguimiento.htm">Seguimiento</a></li>
		<li><a href="${pageContext.request.contextPath}/anexos.htm">Anexos</a></li>
		<li><a href="${pageContext.request.contextPath}/recibo.htm">Recibo</a></li>
		<li><a href="${pageContext.request.contextPath}/contactenos.jsp">Contactenos</a></li>
	</c:if>
	</ul>
</div>
	<div id="headerPan">
		<div id="headerPanleft">
			<c:if test="${s_expediente != null}">			
			<div id="ourblog">
				<a href="${pageContext.request.contextPath}/general.htm"><h2>Datos Generales</h2></a>
			</div>
			<div id="possib">
				<a href="${pageContext.request.contextPath}/seguimiento.htm"><h2>Seguimiento</h2></a>
			</div>
			<div id="solution">
				<a href="${pageContext.request.contextPath}/recibo.htm"> <h2>Recibos</h2> </a>
			</div>
			<div id="solution">
				<a href="${pageContext.request.contextPath}/anexos.htm"> <h2>Anexos</h2> </a>
			</div>
			</c:if>
		</div>
		<div id="leftmemberPan">
			<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
				codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0"
				width="499" height="239">
				<param name="movie" value="${pageContext.request.contextPath}/img/GD.swf" />
				<param name="quality" value="high" />
				<embed src="${pageContext.request.contextPath}/img/GD.swf" quality="high"
					pluginspage="http://www.macromedia.com/go/getflashplayer"
					type="application/x-shockwave-flash" width="499" height="239"></embed>
			</object>
		</div>
	</div>