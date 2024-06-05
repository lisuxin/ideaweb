<%--
  Created by IntelliJ IDEA.
  User: djdl
  Date: 2024/6/5
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
1.属性：
test必须属性，接收boolean表达式
如果表达式的为true,则显示，如果为false，则不显示标签体内容
一般情况下，test属性值会结合el表达式一起使用
2.注意
c:if标签么有else，想要else，则可以在定义一个c:if
--%>
<c:if test=""></c:if>
<c:choose>
    <c:when test=""></c:when>
    <c:otherwise></c:otherwise>
</c:choose>
<c:forEach begin="1" end="10" var="i" step="1"></c:forEach>
<c:forEach items="${list}" var="str" varStatus="s">
    ${str}
</c:forEach>
</body>
</html>
