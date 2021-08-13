<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<title>
<decorator:title default="Master-layout"></decorator:title></title>

<body>


<%@include file="/views/templates/admin/header.jsp" %>

<%@include file="/views/templates/admin/sidebar.jsp" %>


<decorator:body />

<%@include file="/views/templates/admin/footer.jsp" %>

</body>
</html>
