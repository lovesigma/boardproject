<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>


<script src="//code.jquery.com/jquery.js"></script>
<script src="<c:url value="/resources/js/angular.js" />"></script>
<script src="<c:url value="/resources/js/angular-resource.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/service/boards.js" />"></script>
<script src="<c:url value="/resources/js/controller/main.js" />"></script>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0-wip/css/bootstrap.min.css">
<link rel="stylesheet"href="<c:url value="/resources/css/main.css" />">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0-wip/js/bootstrap.min.js"></script> 


<title>Home</title>
</head>
<body ng-app = "RedisBoard">
 <%@include  file="main.jsp" %>
</body>
</html>
