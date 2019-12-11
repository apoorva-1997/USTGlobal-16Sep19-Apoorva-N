<%
String s = (String)request.getAttribute("msg");
%>


<html>
<body>

<%-- can use this or this <% %> both give same op--%>

<h2 style="color:blue;">${msg}</h2>									
<h2 style="color:red;"><%=s %></h2>
<h2>${name}</h2>
<h2>${id}</h2>

</body>
</html>
