<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <div align=center>
        <table border=1 cellpadding=0 cellspacing=0 style='height:40px;width:250px;margin-bottom: 20px;'>
            <tr>
                <th>姓名</th>
                <th>年纪</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${student}" var="student">
                <tr style="text-align:center">
                    <td>${student.name}</td>
                    <td>${student.age}</td>
                    <td>
                        <a href="${pageContext.request.contextPath }/student/delete/${student.id}">删除</a>
                        <a href="${pageContext.request.contextPath }/student/toUpdate/${student.id}">修改</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <button onclick="window.open('${pageContext.request.contextPath }/add.jsp');">新增</button>
    </div>
</body>
</html>
