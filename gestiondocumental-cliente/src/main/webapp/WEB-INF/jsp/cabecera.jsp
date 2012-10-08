<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="topPan">
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p class="Estilo1">
		<a href="${pageContext.request.contextPath}/index.jsp"><span class="Estilo5">Gestion Documental</span> </a>
	</p>
	<c:if test="${s_expediente != null}">
	<ul>	
		<li><a href="${pageContext.request.contextPath}/gestion/general.htm">Datos Generales</a></li>
		<li><a href="${pageContext.request.contextPath}/gestion/seguimiento.htm">Seguimiento</a></li>
		<li><a href="${pageContext.request.contextPath}/gestion/anexos.htm">Anexos</a></li>
		<li><a href="${pageContext.request.contextPath}/gestion/recibo.htm">Recibo</a></li>
		<li><a href="${pageContext.request.contextPath}/contactenos.jsp">Contactenos</a></li>
	</ul>
	</c:if>
</div>
	<div id="headerPan">
		<div id="headerPanleft">
			<c:if test="${s_expediente != null}">			
			<div id="ourblog">
				<a href="${pageContext.request.contextPath}/gestion/general.htm"><h2>Datos Generales</h2></a>
			</div>
			<div id="possib">
				<a href="${pageContext.request.contextPath}/gestion/seguimiento.htm"><h2>Seguimiento</h2></a>
			</div>
			<div id="solution">
				<a href="${pageContext.request.contextPath}/gestion/recibo.htm"> <h2>Recibos</h2> </a>
			</div>
			<div id="solution">
				<a href="${pageContext.request.contextPath}/gestion/anexos.htm"> <h2>Anexos</h2> </a>
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