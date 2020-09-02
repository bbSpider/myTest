<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%--isELIgnored="false" 表示使用el表达式--%>
<html>
<head>
    <title>数据修改</title>
</head>
<body>
    <div>
        <form action="${pageContext.request.contextPath }/student/update" method="post">
                 <input type="hidden" name="id" value="${s.id}"> <!--id用于识别目前是哪条数据-->
            姓名：<input type="text" name="name" value="${s.name}"/><br/>
            年龄：<input type="text" name="age" value="${s.age}"/><br/>
                 <input type="submit" value="提交">
        </form>
    </div>
</body>
</html>
