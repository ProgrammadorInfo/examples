<html>
<head>
    <%@include file="include.jsp"%>
</head>
<body>
    <%
        String runText = request.getParameter("runText");
        if(runText == null){
            runText = "nothing was entered";
        }
    %>

    <a href="index.jsp" class="btn">&lt;&lt;Back</a>
    <br>
    <br>
    <u>The text you have entered:</u> <%=runText%>
</body>
</html>