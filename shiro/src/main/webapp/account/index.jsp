<%--
  Created by IntelliJ IDEA.
  User: miracle
  Date: 2018/2/1
  Time: 上午11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../include.jsp" %>

<html>
<head>
    <link type="text/css" rel="stylesheet" href="<c:url value="/style.css"/>"/>
</head>
<body>

<h2>Users only</h2>

<p>You are currently logged in.</p>

<p><a href="<c:url value="/home.jsp"/>">Return to the home page.</a></p>

<p><a href="<c:url value="/logout"/>">Log out.</a></p>
</body>
</html>
