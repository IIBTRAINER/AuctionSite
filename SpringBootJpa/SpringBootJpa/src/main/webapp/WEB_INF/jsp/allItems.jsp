<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1>Auction Item page</h1>

<ul>
<c:forEach items="${auction}" var="auction">
   <li>${auction}</li>
</c:forEach>
</ul>