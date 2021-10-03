<%--
  Created by IntelliJ IDEA.
  User: lishan
  Date: 2021-10-03
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label for="bookName">书籍名称：</label>
            <input type="text" name="bookName" class="form-control" id="bookName" required>
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量：</label>
            <input type="text" name="bookCounts" class="form-control" id="bookCounts" required>
        </div>
        <div class="form-group">
            <label for="bookDetail">书籍描述：</label>
            <input type="text" name="detail" class="form-control" id="bookDetail" required>
        </div>
        <input type="submit" class="btn btn-primary" value="添加">
    </form>
</div>
</body>
</html>
