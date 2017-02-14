<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>Spring 3 MVC REST web service</h1>

<c:if test="${not empty movies}">

	<ul>
		<c:forEach var="movie" items="${movies}">
			<li>${movie.name}</li>
		</c:forEach>
	</ul>

</c:if>
</body>
</html>