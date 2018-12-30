<!-- 医生个性化设置页面，首诊新增基本信息--byliulu -->
<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="utf-8"%>
<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<% 
request.setCharacterEncoding("UTF-8"); 
response.setCharacterEncoding("UTF-8"); 
response.setContentType("text/html; charset=utf-8"); 
%>
    <% 
      String newitem = request.getParameter("firstHeight");
    %>
<html>
<head>
<title>往数据库插入数据</title>
</head>
	<body>
		<sql:setDataSource var="dataSour" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://101.201.40.158:3306/ehealth?useUnicode=true&characterEncoding=gbk" user="root" password="123456" />
		<c:catch var="error">
		<c:set var="newitem" value="<%=newitem %>" />
		<c:if test="${newitem !='' and newitem!=null}">
			<sql:update var="userlist" dataSource="${dataSour}" >
				alter table mypatient add column <%=newitem %> varchar(10) default '';
			</sql:update>
		</c:if>
		</c:catch>
		<c:out value="${error}"></c:out><br>
		<c:redirect url="/static/doctorSetting.jsp">
		</c:redirect>
		<c:set var="temp" value="value" scope="session"></c:set>
	</body>
</html>