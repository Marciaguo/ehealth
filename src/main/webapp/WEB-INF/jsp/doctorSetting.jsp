<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="utf-8"%> 
<%@ page contentType="text/html;charset=utf-8"%> 
<% 
 request.setCharacterEncoding("UTF-8"); 
 response.setCharacterEncoding("UTF-8"); 
 response.setContentType("text/html; charset=UTF-8"); 
%> 
<!DOCTYPE HTML>
<html>
<head>
<title>设置</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Petsy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<link href="../css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="../css/style.css" rel='stylesheet' type='text/css' />
<script src="../js/jquery.min.js"> </script>
<script src="../js/bootstrap.min.js"></script>

<script type="text/javascript" src="../js/move-top.js"></script>
<script type="text/javascript" src="../js/easing.js"></script>
<!--/script-->
<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},900);
				});
			});
			function addclinicBasicItem(){
			/*	$("#clinicbasiclast").append(
						'<div class="col-md-4" >'+
						'<p class="col-md-4 your-para" style="padding-top: 5%">'+$("#newclinicitem").val() +'</p>'+
						'<div class="col-md-8" style="padding-top: 4%">'+
						'<input type="text" class="form-control" id="identity" placeholder="">'+
						'</div></div>'	+'<input style="display:none" type="text" class="form-control" id="newclinicitem" name="newitem" value=" '+$("#newclinicitem").val()+'">'							
				);*/
				var newval=$("#newclinicitem").val();
				var newdiv=$('#clinicFat').clone();
				newdiv.find("p").text(newval);	
				newdiv.append('<input style="display:none" type="text"  name="clinicItem"  value=" '+newval+'">');
				$("#clinicbasiclast").append(newdiv);
			}
			var i=0;
			function addfirstBasicItem(){
				var newval=$("#newfirstitem").val();
				var newdiv=$('#firstHeight').clone();
				newdiv.find("p").text(newval);	
				++i;
				newdiv.append('<input style="display:none" type="text"  name="firstHeight"  value=" '+newval+'">');
				//newdiv.find("input").val(newval);
				//newdiv.find("input").attr("name",++i)
				$("#firstnew").append(newdiv);
			}
			function addGroupItem(){
				var newval=$("#groupName").val();
				$('#newGroupName').append(' <div style="float:left"><p class="col-md-2 your-para" style="padding:3px 0px" value=" '+newval+'">'+newval+'</p></div>');
				$('#newGroupName').append('<input style="display:none" type="text"  name="groupname1"  value=" '+newval+'">');
			}
</script>

</head>
<body>
	<!--start-header-->
			<div id="home" class="header two">
					<div class="top-header">
						<div class="container">
							<div class="logo">
							  <a href="doctorIndex"><h2>北京协和医院</h2></a>
						    </div>
					     <div class="top-menu">
							<span class="menu"> </span>
								<ul class="cl-effect-16">
								<li><a href="doctorIndex" data-hover="主页">主页</a></li>
								<li><a href="doctorAbout" data-hover="关于">关于</a></li>
								<li><a href="doctorHelper" data-hover="门诊助手">门诊助手</a></li>
								<li><a href="doctorPatient" data-hover="我的病人">我的病人</a></li>
								<li><a href="doctorAppoint" data-hover="日程管理">日程管理</a></li>
								<li><a class="active" href="doctorSetting" data-hover="设置">设置</a></li>
								<li style="color: white">|</li>
								<li><span class="glyphicon glyphicon-qrcode"  data-toggle="modal" data-target="#scanQRcode" data-backdrop="static" style="cursor: pointer;color: white"></span></li>
								<li class="dropdown" style="text-align: left;">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span></a>
									<ul class="dropdown-menu" role="menu" id="doctor-contents">
										<li><a href="doctorProfile"><span class="glyphicon glyphicon-cog"></span> 修改资料</a></li>
										<li><a href="login"><span class="glyphicon glyphicon-log-out"></span> 退出</a></li>
									</ul>
			  					</li>		
								  <div class="clearfix"></div>
								</ul>
							</div>
							<!-- script-for-menu -->
								<script>
									$("span.menu").click(function(){
										$(".top-menu ul").slideToggle("slow" , function(){
										});
									});
								</script>
								<!-- script-for-menu -->
							<div class="clearfix"> </div>
					</div>
				</div>
	     </div>
     </div>
		<!--start-contact-->
	<div class="contact contact-grid">
		<div class="container">
		    <h3 class="tittle" style="font-size: 1.9em">设置</h3>
		    <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="padding-top: 10px">
			<ul id="myTab" class="nav nav-tabs" role="tablist">
			  <li role="presentation" class="active"><a href="#first" id="profile-tab" role="tab" data-toggle="tab" aria-controls="first-tab" aria-expanded="true">首诊</a></li>
			  <li role="presentation" class=""><a href="#next" role="tab" id="profile-tab" data-toggle="tab" aria-controls="next" aria-expanded="false">复诊</a></li>
			  <li role="presentation" class=""><a href="#long" role="tab" id="profile-tab" data-toggle="tab" aria-controls="long" aria-expanded="false">更年期一日门诊</a></li>
			  <li role="presentation" class=""><a href="#medicine" role="tab" id="profile-tab" data-toggle="tab" aria-controls="medicine" aria-expanded="false">药品管理</a></li>
			  <li role="presentation" class=""><a href="#group" role="tab" id="profile-tab" data-toggle="tab" aria-controls="group" aria-expanded="false">组别管理</a></li>
			</ul>
			<br />
			<div id="myTabContent" class="tab-content">
<!-- **********************************************首诊*************************************************************************** -->
			  <div role="tabpanel" class="tab-pane fade active in" id="first" aria-labelledby="first-tab">
				<div class="panel-group" id="infoFirst">
            <div class="panel panel-default">
              <div class="panel-heading">
                <h4 class="panel-title" style="font-size: 1.4em; "> <a data-toggle="collapse" class="panel-toggle" data-parent="#infoFirst" href="#collapseOne" style="text-decoration: none;">1. 诊疗信息</a> </h4>
              </div>
              <div id="collapseOne" class="panel-collapse collapse in">
                <div class="panel-body"> 
                		<%
							//变量声明
							java.sql.Connection sqlCon1; //数据库连接对象
							java.sql.Statement sqlStmt1; //SQL语句对象
							java.sql.ResultSet sqlRst1; //结果集对象
							java.lang.String strCon1;//数据库连接字符串
							java.lang.String strSQL1;//SQL语句
							//装载JDBC驱动程序
							Class.forName("com.mysql.jdbc.Driver").newInstance();
							//设置数据库连接字符串
							strCon1="jdbc:mysql://127.0.0.1:3306/ehealth";
							//连接数据库
							sqlCon1=java.sql.DriverManager.getConnection(strCon1,"root","123456");
							//创建一个可以滚动的只读的SQL语句对象
							sqlStmt1=sqlCon1.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_READ_ONLY);
							//准备SQL语句
							strSQL1="show columns from mypatient";
							//执行SQL语句并获取结果集
							sqlRst1=sqlStmt1.executeQuery(strSQL1);
							//获取记录总数
							sqlRst1.last();
							%>
					<form method="post" action="doctorFirstBasicAdd">

					<div id="firstnew">
				    	<div class="col-md-4" id="firstHeight">
						   <p class="col-md-4 your-para" style="padding-top: 3%">身高</p>
						   <div class="col-md-8">
						   <input type="text" class="form-control" id="name" placeholder="">
						   </div>
						</div>
						
						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 3%">体重</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="age" placeholder="">
						</div>
						</div>
						
						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 5%">腰围</p>
						<div class="col-md-8" style="padding-top: 4%">
							<input type="text" class="form-control" id="name" placeholder="">
						</div>
						</div>
						
						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 5%">臀围</p>
						<div class="col-md-8" style="padding-top: 4%">
							<input type="text" class="form-control" id="name" placeholder="">
						</div>
						</div>
						
						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 5%">血脂</p>
						<div class="col-md-8" style="padding-top: 4%">
						<input type="text" class="form-control" id="identity" placeholder="">
						</div>
						</div>
						
						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 5%">血糖</p>
						<div class="col-md-8" style="padding-top: 4%">
						<input type="text" class="form-control" id="identity" placeholder="">
						</div>
						</div>
				 	    
				 	    <div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 5%">电话</p>
						<div class="col-md-8" style="padding-top: 4%">
						<input type="text" class="form-control" id="identity" placeholder="">
						</div>
				 		</div>
				 		
                        <div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 5%">医生电话</p>
						<div class="col-md-8" style="padding-top: 4%">
						<input type="text" class="form-control" id="identity" placeholder="">
						</div>
				 		</div>
				 	<%
				        sqlRst1.absolute(17);
						while(!sqlRst1.isAfterLast()){
					 %>
						<div class="col-md-4">
						   <p class="col-md-4 your-para" style="padding-top: 3%"><%=sqlRst1.getString(1)%></p>
						   <div class="col-md-8">
						   <input type="text" class="form-control" placeholder="">
						   </div>
						</div>
           			<%
					 sqlRst1.next();			
					 }
					%>
						</div>
						<br /><br /><br /><br />
						<div class="col-md-12 send" style="margin-left: 1.5%">
						<br />
							<input type="button" data-toggle="modal" data-target="#addBasic" data-backdrop="static" value="新增">
							&nbsp&nbsp<input type="submit" value="保存" >
						</div>
					</form>
                </div>
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">
                <h4 class="panel-title" style="font-size: 1.4em; ">  <a data-toggle="collapse" class="panel-toggle" data-parent="#infoFirst" href="#collapseTwo" style="text-decoration: none;">2. 超声学检查结果</a> </h4>
              </div>
              <div id="collapseTwo" class="panel-collapse collapse">
                <div class="panel-body contact-grid"> 
                <form>
						<div class="col-md-10">
						<p class="col-md-2 your-para" style="padding-top: 1%">妇科</p>
						<div class="col-md-8" >
						<textarea class="col-md-12" style="border: 1px solid #C1C1C1;"cols="60" rows="3" value=" "></textarea>
						<div class="col-md-12 report-file" style="margin-top: 2%; margin-bottom: 2%">
      					<span>上传文件</span><input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName').value=this.value.split('\\').pop()">
 						</div>
 						<input type="text" name="" id="textName" style="margin-top:2%; height: 30px;width:70%; border:1px solid #ffffff" readonly= "true " placeholder="请上传文件"/>
						</div>
						</div>
						<br /><br />

						<div class="col-md-10">
						<p class="col-md-2 your-para" style="padding-top: 1%">乳腺</p>
						<div class="col-md-8">
						<textarea class="col-md-12"  style="border: 1px solid #C1C1C1;" cols="60" rows="3" value=" "></textarea>
						<div class="col-md-12 report-file" style="margin-top: 2%; margin-bottom: 2%">
      					<span>上传文件</span><input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName').value=this.value.split('\\').pop()">
 						</div>
 						<input type="text" name="" id="textName" style="margin-top:2%; height: 30px;width:70%; border:1px solid #ffffff" readonly= "true " placeholder="请上传文件"/>
						</div>
						</div>
						<br /><br />

						<div class="col-md-10">
						<p class="col-md-2 your-para" style="padding-top: 1%">甲状腺</p>
						<div class="col-md-8">
						<textarea class="col-md-12" style="border: 1px solid #C1C1C1;" cols="60" rows="3" value=" "></textarea>
						<div class="col-md-12 report-file" style="margin-top: 2%; margin-bottom: 2%">
      					<span>上传文件</span><input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName').value=this.value.split('\\').pop()">
 						</div>
 						<input type="text" name="" id="textName" style="margin-top:2%; height: 30px;width:70%; border:1px solid #ffffff" readonly= "true " placeholder="请上传文件"/>
						</div>
						</div>
						
						<br /><br />
						<div class="col-md-12 send" style="margin-left: 1.5%">
						<br />
							<input type="button" data-toggle="modal" data-target="#addCheck" data-backdrop="static" value="新增">
							&nbsp&nbsp<input type="submit" value="保存" >
						</div>
					</form>
                </div>
                </div>
              </div>
               </div>
			  </div>
<!-- **********************************************首诊结束、复诊开始 *****************************************************************-->
			  <div role="tabpanel" class="tab-pane fade" id="next" aria-labelledby="next-tab">
				<div class="panel-group" id="infoNext">
            <div class="panel panel-default">
              <div class="panel-heading">
                <h4 class="panel-title" style="font-size: 1.4em; "> <a data-toggle="collapse" class="panel-toggle" data-parent="#infoNext" href="#collapseTwo1" style="text-decoration: none;">1. 调查问卷</a> </h4>
              </div>
              <div id="collapseTwo1" class="panel-collapse collapse in">
                <div class="panel-body"> 民族、职业习惯等 
					<div class="col-md-12 send" >
						<br />
							<input type="button" data-toggle="modal" data-target="#addInvest" data-backdrop="static" value="新增">
							&nbsp&nbsp<input type="submit" value="保存" >
						</div>
                </div>
                
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">
                <h4 class="panel-title" style="font-size: 1.4em; "> <a data-toggle="collapse" class="panel-toggle" data-parent="#infoNext" href="#collapseThree1" style="text-decoration: none;"> 2. 超声学检查结果</a> </h4>
              </div>
              <div id="collapseThree1" class="panel-collapse collapse">
                <div class="panel-body"> 
                <form>
						<div class="col-md-10">
						<p class="col-md-2 your-para" style="padding-top: 1%">妇科</p>
						<div class="col-md-8" >
						<textarea class="col-md-12" style="border: 1px solid #C1C1C1;"cols="60" rows="3" value=" "></textarea>
						<div class="col-md-12 report-file" style="margin-top: 2%; margin-bottom: 2%">
      					<span>上传文件</span><input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName').value=this.value.split('\\').pop()">
 						</div>
 						<input type="text" name="" id="textName" style="margin-top:2%; height: 30px;width:70%; border:1px solid #ffffff" readonly= "true " placeholder="请上传文件"/>
						</div>
						</div>
						<br /><br />

						<div class="col-md-10">
						<p class="col-md-2 your-para" style="padding-top: 1%">乳腺</p>
						<div class="col-md-8">
						<textarea class="col-md-12"  style="border: 1px solid #C1C1C1;" cols="60" rows="3" value=" "></textarea>
						<div class="col-md-12 report-file" style="margin-top: 2%; margin-bottom: 2%">
      					<span>上传文件</span><input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName').value=this.value.split('\\').pop()">
 						</div>
 						<input type="text" name="" id="textName" style="margin-top:2%; height: 30px;width:70%; border:1px solid #ffffff" readonly= "true " placeholder="请上传文件"/>
						</div>
						</div>
						<br /><br />

						<div class="col-md-10">
						<p class="col-md-2 your-para" style="padding-top: 1%">甲状腺</p>
						<div class="col-md-8">
						<textarea class="col-md-12" style="border: 1px solid #C1C1C1;" cols="60" rows="3" value=" "></textarea>
						<div class="col-md-12 report-file" style="margin-top: 2%; margin-bottom: 2%">
      					<span>上传文件</span><input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName').value=this.value.split('\\').pop()">
 						</div>
 						<input type="text" name="" id="textName" style="margin-top:2%; height: 30px;width:70%; border:1px solid #ffffff" readonly= "true " placeholder="请上传文件"/>
						</div>
						</div>
						
						<br /><br />
						<div class="col-md-12 send" style="margin-left: 1.5%">
						<br />
							<input type="button" data-toggle="modal" data-target="#addCheck" data-backdrop="static" value="新增">
							&nbsp&nbsp<input type="submit" value="保存" >
						</div>
					</form>
                </div>
                </div>
              </div>
               </div>
			  </div>
			  
			  
<!--******************************************复诊结束      更年期 一日门诊 *****************************************************************-->
			  
			  <div role="tabpanel" class="tab-pane fade" id="long" aria-labelledby="long-tab">
				<div class="panel-group" id="infoLong">
                <div class="panel panel-default">
                 <div class="panel-heading">
                  <h4 class="panel-title" style="font-size: 1.4em; "> <a data-toggle="collapse" class="panel-toggle" data-parent="#infoLong" href="#collapseOne2" style="text-decoration: none;">1. 诊疗信息 </a></h4>
                 </div>
                <div id="collapseOne2" class="panel-collapse collapse in">
                <div class="panel-body"> 
               <%
					//变量声明
					java.sql.Statement sqlStmt; //SQL语句对象
					java.sql.ResultSet sqlRst; //结果集对象
					java.lang.String strCon;//数据库连接字符串
					java.lang.String strSQL;//SQL语句

					//创建一个可以滚动的只读的SQL语句对象
					sqlStmt=sqlCon1.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_READ_ONLY);
					//准备SQL语句
					strSQL="show columns from clinic_assistant";
					//执行SQL语句并获取结果集
					sqlRst=sqlStmt.executeQuery(strSQL);
					//获取记录总数
					sqlRst.last();
				%>
					<form method="post" action="doctorClinicBasicAdd">
					 <div id="clinicbasiclast">
				    	<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 3%">身高</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="name" placeholder="">
						</div>
						</div>

						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 3%">体重</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="name" placeholder="">
						</div>
						</div>

						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 5%">腰围</p>
						<div class="col-md-8" style="padding-top: 4%">
							<input type="text" class="form-control" id="name" placeholder="">
						</div>
						</div>
						
						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 5%">臀围</p>
						<div class="col-md-8" style="padding-top: 4%">
							<input type="text" class="form-control" id="name" placeholder="">
						</div>
						</div>
                        
						<div class="col-md-4" id="clinicFat">
						<p class="col-md-4 your-para" style="padding-top: 5%">血脂</p>
						<div class="col-md-8" style="padding-top: 4%">
						<input type="text" class="form-control" id="identity" placeholder="">
						</div>
						</div>
						
						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 5%">血糖</p>
						<div class="col-md-8" style="padding-top: 4%">
						<input type="text" class="form-control" id="identity" placeholder="">
						</div>
						</div>
												
						<div class="col-md-4" >
						<p class="col-md-4 your-para" style="padding-top: 5%">电话</p>
						<div class="col-md-8" style="padding-top: 4%">
						<input type="text" class="form-control" id="identity" placeholder="">
						</div>
						</div>
						
						<div class="col-md-4" >
						<p class="col-md-4 your-para" style="padding-top: 5%">医生电话</p>
						<div class="col-md-8" style="padding-top: 4%">
						<input type="text" class="form-control" id="identity" placeholder="">
						</div>
						</div>
						

				    <%
				        sqlRst.absolute(18);
						while(!sqlRst.isAfterLast()){
					 %>
						<div class="col-md-4">
						   <p class="col-md-4 your-para" style="padding-top: 3%"><%=sqlRst.getString(1)%></p>
						   <div class="col-md-8">
						   <input type="text" class="form-control" placeholder="">
						   </div>
						</div>
           			<%
					 sqlRst.next();			
					 }
					%>

						</div>

						<div class="col-md-12 send" style="margin-left: 1.5%">
						<br />
							<input type="button" data-toggle="modal" data-target="#addclinicBasic" data-backdrop="static" value="新增">
							&nbsp&nbsp<input type="submit" value="保存" >
						</div>
					</form>
                </div>
              </div>
            </div>
                <div class="panel panel-default">
                <div class="panel-heading">
                 <h4 class="panel-title" style="font-size: 1.4em; "> <a data-toggle="collapse" class="panel-toggle" data-parent="#infoLong" href="#collapseTwo2" style="text-decoration: none;">2. 调查问卷</a> </h4>
                </div>
                <div id="collapseTwo2" class="panel-collapse collapse">
                     <div class="panel-body"> 民族、职业习惯等 
                        <div class="col-md-12 send" style="margin-left: 1.5%">
						<br />
							<input type="button" data-toggle="modal" data-target="#addInvest" data-backdrop="static" value="新增">
							&nbsp&nbsp<input type="submit" value="保存" >
						</div>
                    </div>                
                </div>
                </div>
            <div class="panel panel-default">
              <div class="panel-heading">
                <h4 class="panel-title" style="font-size: 1.4em; "> <a data-toggle="collapse" class="panel-toggle" data-parent="#infoLong" href="#collapseThree2" style="text-decoration: none;"> 3. 超声学检查结果 </a></h4>
              </div>
              <div id="collapseThree2" class="panel-collapse collapse">
                <div class="panel-body"> 
                <form>
						<div class="col-md-10">
						<p class="col-md-2 your-para" style="padding-top: 1%">妇科</p>
						<div class="col-md-8" >
						<textarea class="col-md-12" style="border: 1px solid #C1C1C1;"cols="60" rows="3" value=" "></textarea>
						<div class="col-md-12 report-file" style="margin-top: 2%; margin-bottom: 2%">
      					<span>上传文件</span><input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName').value=this.value.split('\\').pop()">
 						</div>
 						<input type="text" name="" id="textName" style="margin-top:2%; height: 30px;width:70%; border:1px solid #ffffff" readonly= "true " placeholder="请上传文件"/>
						</div>
						</div>
						<br /><br />

						<div class="col-md-10">
						<p class="col-md-2 your-para" style="padding-top: 1%">乳腺</p>
						<div class="col-md-8">
						<textarea class="col-md-12"  style="border: 1px solid #C1C1C1;" cols="60" rows="3" value=" "></textarea>
						<div class="col-md-12 report-file" style="margin-top: 2%; margin-bottom: 2%">
      					<span>上传文件</span><input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName').value=this.value.split('\\').pop()">
 						</div>
 						<input type="text" name="" id="textName" style="margin-top:2%; height: 30px;width:70%; border:1px solid #ffffff" readonly= "true " placeholder="请上传文件"/>
						</div>
						</div>
						<br /><br />

						<div class="col-md-10">
						<p class="col-md-2 your-para" style="padding-top: 1%">甲状腺</p>
						<div class="col-md-8">
						<textarea class="col-md-12" style="border: 1px solid #C1C1C1;" cols="60" rows="3" value=" "></textarea>
						<div class="col-md-12 report-file" style="margin-top: 2%; margin-bottom: 2%">
      					<span>上传文件</span><input tabindex="3" size="3" name="report" class="file-prew" type="file" onchange="document.getElementById('textName').value=this.value.split('\\').pop()">
 						</div>
 						<input type="text" name="" id="textName" style="margin-top:2%; height: 30px;width:70%; border:1px solid #ffffff" readonly= "true " placeholder="请上传文件"/>
						</div>
						</div>
						
						<div class="col-md-12 send" style="margin-left: 1.5%">
						<br />
							<input type="button" data-toggle="modal" data-target="#addCheck" data-backdrop="static" value="新增">
							&nbsp&nbsp<input type="submit" value="保存" >
						</div>
					</form>
                </div>
                </div>
              </div>
           
            <div class="panel panel-default">
              <div class="panel-heading">
                <h4 class="panel-title" style="font-size: 1.4em; "> <a data-toggle="collapse" class="panel-toggle" data-parent="#infoLong" href="#collapseFour2" style="text-decoration: none;"> 4. 表格 </a></h4>
              </div>
              <div id="collapseFour2" class="panel-collapse collapse">
                <div class="panel-body"> 
                表格
					<div class="col-md-12 send" style="margin-left: 1.5%">
						<br />
							<input type="button" data-toggle="modal" data-target="#addForm" data-backdrop="static" value="新增">
							&nbsp&nbsp<input type="submit" value="保存" >
						</div>
                </div>
                </div>
              </div>
               </div>
			  </div>
			 
			 
			 
			 
			 
			 
			 
<!--******************************************药品管理 *****************************************************************-->	 
			  <div role="tabpanel" class="tab-pane fade" id="medicine" aria-labelledby="medicine-tab">
				<div class="panel-group" id="infoMedicine">
           <div class="panel panel-default">
              	<div class="panel-heading">
                	<h4 class="panel-title" style="font-size: 1.4em; ">  <a data-toggle="collapse" class="panel-toggle" data-parent="#infoMedicine" href="#collapseFive" style="text-decoration: none;"> 药品管理 </a> </h4>
              	</div>
              <div id="collapseFive" class="panel-collapse collapse in">
                <div class="panel-body contact-grid"> 
                	<div class="col-md-12 " >
						<p class="col-md-2 your-para">药品信息</p>
						<div class="col-md-8">
							<!--
							<form>
								<select name="YYYY" onchange="YYYYDD(this.value)">
    							<option value="">药品名称</option>
    							<option value="">益母草颗粒</option>
    							<option value="">感冒胶囊</option>
    							<option value="">延更丹</option>
  							</select>
  							<select name="MM" onchange="MMDD(this.value)">
    							<option value="">药品用量</option>
    							<option value="">一次1粒</option>
    							<option value="">一次2粒</option>
    							<option value="">一次3粒</option>
  							</select>
 							<select name="DD">
 								<option value="">用药频率</option>
    							<option value="">一日一次</option>
    							<option value="">一日两次</option>
    							<option value="">一日三次</option>
  							</select>
						</form>
						-->
									</div>
								</div>
						<br /><br />
					   <div class="col-md-12 send" style="margin-left: 2%;">
							<input type="button" data-toggle="modal" data-target="#addMedicine" data-backdrop="static" value="新增">
							&nbsp&nbsp<input type="submit" value="保存" >
						</div>
                </div>
                </div>
              </div>
          
               </div>
			  </div>
<!--******************************************组别管理 *****************************************************************-->	
<!--******************************************组别管理 *****************************************************************-->				
			  <div role="tabpanel" class="tab-pane fade" id="group" aria-labelledby="medicine-tab">
				<div class="panel-group" id="infoMedicine">
           <div class="panel panel-default">
              	<div class="panel-heading">
                	<h4 class="panel-title" style="font-size: 1.4em; ">  <a data-toggle="collapse" class="panel-toggle" data-parent="#infoMedicine" href="#collapseFive" style="text-decoration: none;"> 组别管理 </a> </h4>
              	</div>
              <div id="collapseFive" class="panel-collapse collapse in">
                <div class="panel-body contact-grid"> 
                <form method="post" action="groupAdd">
                    <%
							//变量声明
							java.sql.ResultSet sqlRstG; //结果集对象
							java.lang.String strConG;//数据库连接字符串
							java.lang.String strSQLG;//SQL语句

							//准备SQL语句
							strSQLG="select *from patient_detail";
							//执行SQL语句并获取结果集
							sqlRstG=sqlStmt1.executeQuery(strSQLG);
							//获取记录总数
							sqlRstG.last();
							%>
                	<div class="col-md-12" id="newGroupName" >
					<!--  	<p class="col-md-2 your-para" style="padding:3px 0px">月经组</p>
						<p class="col-md-2 your-para" style="padding:3px 0px">更年组</p>
						<p class="col-md-2 your-para" style="padding:3px 0px">卵巢组</p>
                     -->
					<%
				        sqlRstG.absolute(1);
						while(!sqlRstG.isAfterLast()){
					 %>
                  <div style="float:left">  <p class="col-md-2 your-para" style="padding:3px 0px"><%=sqlRstG.getString(2)%></p></div>
           			<%
					 sqlRstG.next();			
					 }
					%>
					</div>
					<br /><br /><br /><br />
				    <div class="col-md-12 send" style="margin-left: 2%;">
						<input type="button" data-toggle="modal" data-target="#addGroup" data-backdrop="static" value="新增">
						&nbsp&nbsp<input type="submit" value="保存" >
					</div>
				</form>
                </div>
                </div>
              </div>
          
               </div>
			  </div>
			
			
			</div>
		   </div>

            </div>
          </div>
        </div>

	  </div>

  <!--footer-->
			<div class="footer text-center" style="padding-bottom: 0; text-align: center;">
				<div class="container">
					<div class="copy">
		              <p style="color: black">Copyright &copy; 2016. School of Electronics Engineering and Computer Science, Peking University.</p>
		            </div>
				</div>
			</div>

				<!--start-smoth-scrolling-->
						<script type="text/javascript">
									$(document).ready(function() {	
										$().UItoTop({ easingType: 'easeOutQuart' });
										
									});
								</script>
		<a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

		<div id="scanQRcode" class="modal fade" >
		<div class="modal-dialog" style="margin-top: 10%;width:400px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">E-Health</h4>
                </div>
                <div class="modal-body">
                	<p>我是一个二维码</p>
                	<p>扫描二维码，关注E-Health微信公众号。</p>
                </div>
                
                <div class="modal-footer">
                <!--
                    <button type="button" class="btn btn-success" onclick="deleteNSgroup()">确定</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    -->
                </div>

             </div>
        </div>
    </div>
<!-- ***************************                   首诊-新增基本信息                                                          ****************************** -->
<!-- ***************************                   首诊-新增基本信息                                                          ****************************** -->
    <div id="addBasic" class="modal fade" >
		<div class="modal-dialog" style="margin-top: 10%;width:400px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">新增诊疗信息</h4>
                </div>
                <div class="modal-body" style="margin-bottom: 8%">
                	<form>
						<div class="col-md-12">
						<p class="col-md-4 your-para" style="padding-top: 1%">新增名称</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="newfirstitem" placeholder="">
						</div>
						</div>
					</form>
                </div>
                
                <div class="modal-footer">
                    <button type="button" class="btn btn-success" data-dismiss="modal" style="background-color: #20CBBE; border-color: #20CBBE" onclick="addfirstBasicItem()">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>

             </div>
        </div>
    </div>
<!-- ***************************                   更年期一日门诊-新增基本信息                                                          ****************************** -->
    <div id="addclinicBasic" class="modal fade" >
		<div class="modal-dialog" style="margin-top: 10%;width:400px;">
            <div class="modal-content">
            <form >  <!--  -->
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">新增诊疗信息</h4>
                </div>
                <div class="modal-body" style="margin-bottom: 8%">
                	
						<div class="col-md-12">
						<p class="col-md-4 your-para" style="padding-top: 1%">新增名称</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="newclinicitem" name="newitem" value="">
						</div>
						</div>
					
                </div>                
                <div class="modal-footer">
                    <button type="button" class="btn btn-success" data-dismiss="modal" style="background-color: #20CBBE; border-color: #20CBBE" onclick="addclinicBasicItem()">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>
			</form>
             </div>
        </div>
    </div>

    <div id="addInvest" class="modal fade" >
		<div class="modal-dialog" style="margin-top: 10%;width:400px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">新增调查问卷项目</h4>
                </div>
                <div class="modal-body" style="margin-bottom: 8%">
                	<form>
						<div class="col-md-12">
						<p class="col-md-4 your-para" style="padding-top: 1%">新增名称</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="oldPass" placeholder="">
						</div>
						</div>
					</form>
                </div>
                
                <div class="modal-footer">
                    <button type="button" class="btn btn-success" style="background-color: #20CBBE; border-color: #20CBBE" onclick="addInvestItem()">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>

             </div>
        </div>
    </div>

    <div id="addCheck" class="modal fade" >
		<div class="modal-dialog" style="margin-top: 10%;width:400px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">新增超声学检查项目</h4>
                </div>
                <div class="modal-body" style="margin-bottom: 8%">
                	<form>
						<div class="col-md-12">
						<p class="col-md-4 your-para" style="padding-top: 1%">新增名称</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="oldPass" placeholder="">
						</div>
						</div>
					</form>
                </div>
                
                <div class="modal-footer">
                    <button type="button" class="btn btn-success" style="background-color: #20CBBE; border-color: #20CBBE" onclick="addCheckItem()">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>

             </div>
        </div>
    </div>

    <div id="addForm" class="modal fade" >
		<div class="modal-dialog" style="margin-top: 10%;width:400px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">新增表格项目</h4>
                </div>
                <div class="modal-body" style="margin-bottom: 8%">
                	<form>
						<div class="col-md-12">
						<p class="col-md-4 your-para" style="padding-top: 1%">新增名称</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="oldPass" placeholder="">
						</div>
						</div>
					</form>
                </div>
                
                <div class="modal-footer">
                    <button type="button" class="btn btn-success" style="background-color: #20CBBE; border-color: #20CBBE" onclick="addFormItem()">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>

             </div>
        </div>
    </div>

    <div id="addMedicine" class="modal fade" >
		<div class="modal-dialog" style="margin-top: 10%;width:400px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">新增药品</h4>
                </div>
                <div class="modal-body" style="height: 150px">
                	<form>
						<div class="col-md-12" style="padding-top: 1%">
						<p class="col-md-4 your-para" >药品名称</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="oldPass" placeholder="">
						</div>
						</div>
						<div class="col-md-12" style="padding-top: 2%">
						<p class="col-md-4 your-para">药品用量</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="oldPass" placeholder="">
						</div>
						</div>
						<div class="col-md-12" style="padding-top: 2%">
						<p class="col-md-4 your-para">用药频率</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="oldPass" placeholder="">
						</div>
						</div>
					</form>
                </div>
                
                <div class="modal-footer">
                    <button type="button" class="btn btn-success" style="background-color: #20CBBE; border-color: #20CBBE" onclick="addFormItem()">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>

             </div>
        </div>
    </div>
    
    <div id="addGroup" class="modal fade" >
		<div class="modal-dialog" style="margin-top: 10%;width:400px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">新增组别</h4>
                </div>
                <div class="modal-body" style="height: 60px">
                	<form>
						<div class="col-md-12" style="padding-top: 1%">
						<p class="col-md-4 your-para" >组别名称</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="groupName" placeholder="">
						</div>
						</div>
					</form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-success" data-dismiss="modal" style="background-color: #20CBBE; border-color: #20CBBE" onclick="addGroupItem()">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>
             </div>
        </div>
    </div>

</body>
</html>
<%
//关闭结果集
sqlRst1.close();
//关闭SQL语句对象
sqlStmt1.close();
//关闭数据库
sqlCon1.close();
%> 