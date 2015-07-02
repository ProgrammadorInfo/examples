<html>
    <head>
        <%@include file="include.jsp"%>
        <script type="text/javascript">
            $(function(){
                $("#run2").on('click', function(event){
                    $("#processForm").submit();
                    event.preventDefault();
                    event.stopPropagation();
                });
            });
        </script>
    </head>
<body>
    Ola, programmador!


    <form id="processForm" action="processForm.jsp">
        <input id="runText" type="text" name="runText" placeholder="Please enter text"/>
        <input type="submit" value="Method 1 (enter text and click me)"/>
    </form>


    <a id="run2" class="btn btn-success">Method 2 (click me)</a>
</body>
</html>
