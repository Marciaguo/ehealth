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
<title>修改资料</title>
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
<script src="../js/birthday.js"> </script>
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
			//生日
			$(function () {
				$.ms_DatePicker({
			            YearSelector: ".sel_year",
			            MonthSelector: ".sel_month",
			            DaySelector: ".sel_day"
			    });
				$.ms_DatePicker();
			}); 
			//监听所有要修改的input输入框，全都为必填项目
			function checksubmit()
			  {
			   //var doctime= $("input[name='worktime']:checkbox[checked=true]");
			   if(!document.getElementById("r1").checked && !document.getElementById("r2").checked && !document.getElementById("r3").checked  && !document.getElementById("r4").checked 
					&& !document.getElementById("r5").checked && !document.getElementById("r6").checked && !document.getElementById("r7").checked
					&& !document.getElementById("r8").checked && !document.getElementById("r9").checked && !document.getElementById("r10").checked
					&& !document.getElementById("r11").checked && !document.getElementById("r12").checked && !document.getElementById("r13").checked && !document.getElementById("r14").checked){
				    alert("请选择出诊时间");
			        return false;
			   }else if(!document.getElementById("rsex").checked && !document.getElementById("rsex2").checked){
				alert("请选择性别");
				return false;
		    	}
			   return true;
			  }
</script>

</head>
<body>
	<!--start-header-->
			<div id="home" class="header two">
					<div class="top-header">
						<div class="container">
							<div class="logo">
							  <a href="doctorIndex.jsp"><h2>北京大学<span>第一医院</span></h2></a>
						    </div>
					     <div class="top-menu">
							<span class="menu"> </span>
								<ul class="cl-effect-16">
								<li><a href="doctorIndex.jsp" data-hover="主页">主页</a></li>
								<li><a href="doctorAbout.jsp" data-hover="关于">关于</a></li>
								<li><a href="doctorHelper.jsp" data-hover="门诊助手">门诊助手</a></li>
								<li><a href="doctorPatient.jsp" data-hover="我的病人">我的病人</a></li>
								<li><a href="doctorAppoint.jsp" data-hover="日程管理">日程管理</a></li>
								<li><a href="doctorSetting.jsp" data-hover="设置">设置</a></li>
								<li style="color: white">|</li>
								<li><span class="glyphicon glyphicon-qrcode"  data-toggle="modal" data-target="#scanQRcode" data-backdrop="static" style="cursor: pointer;color: white"></span></li>
								<li class="dropdown" style="text-align: left;">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span></a>
									<ul class="dropdown-menu" role="menu" id="doctor-contents">
										<li><a href="doctorProfile.jsp"><span class="glyphicon glyphicon-cog"></span> 修改资料</a></li>
										<li><a href="login.jsp"><span class="glyphicon glyphicon-log-out"></span> 退出</a></li>
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
	<div class="contact">
		<div class="container">
		    <h3 class="tittle" style="font-size: 1.9em">修改资料</h3>
				<div class="about-top">
					<div class="contact-grid about-top-right">
					<h4>修改密码</h4>
					<form method="post" action="changeProfile.jsp">
						<div class="col-md-12">
						<p class="col-md-2 your-para" style="padding-top: 1%">请输入用户名</p>
						<div class="col-md-4">
						<input type="text" class="form-control" id="userName" name="userName" placeholder="">
						</div>
						</div>
						<div class="col-md-12">
						<p class="col-md-2 your-para" style="padding-top: 1%">请输入原密码</p>
						<div class="col-md-4">
						<input type="text" class="form-control" id="oldPass" name="oldPass" placeholder="">
						</div>
						</div>

						<div class="col-md-12">
						<p class="col-md-2 your-para" style="padding-top: 1%">请输入新密码</p>
						<div class="col-md-4">
						<input type="text" class="form-control" id="newPass" name="newPass" placeholder="">
						</div>
						</div>
						<div class="col-md-12">
						<p class="col-md-2 your-para" style="padding-top: 1%">请再次输入新密码</p>
						<div class="col-md-4">
						<input type="text" class="form-control" id="newPassAgain" name="newPassAgain" placeholder="">
						</div>
						</div>
						&nbsp
						<h4>修改基本资料</h4>
						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 3%">姓名</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="name" name="name" placeholder="">
						</div>
						</div>

						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 3%">性别</p>
						<div class="col-md-8" style="padding-top: 3%">
						<input type="radio" name="radio" id="rsex" value="男" >
                        <label style="color: #888;">男</label>
                        &nbsp
						<input type="radio" name="radio" id="rsex2" value="女">
                        <label style="color: #888;">女</label>
						</div>
						</div>

						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 3%">年龄</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="age" name="age" placeholder="">
						</div>
						</div>

						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 3%">出生日期</p>
						<div class="col-md-8" style="margin-top:-20px;margin-left:120px;width:300px">
				        <select id="sel_year" name="sel_year"></select>年
				        <select id="sel_month" name="sel_month"></select>月
				        <select id="sel_day" name="sel_day"></select>日
						</div>
						</div>
						
						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 3%">身份证号</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="identity" name="identity" placeholder="">
						</div>
						</div>

						<div class="col-md-4">
						<p class="col-md-4 your-para" style="padding-top: 3%">医疗卡号</p>
						<div class="col-md-8">
						<input type="text" class="form-control" id="recordNumber" name="recordNumber"placeholder="">
						</div>
						</div>

						<div class="col-md-8">
						<p class="col-md-2 your-para" style="padding-top: 1%">出诊时间</p>
						<div class="col-md-10" style="padding-top: 1%">
						<div>
							<input type="checkbox" name="worktime" id="r1" value="10">
                      		<label style="color: #888;">周一上午</label>
                      		&nbsp
							<input type="checkbox" name="worktime" id="r2" value="11">
                      		<label style="color: #888;">周一下午</label>
                      	</div>
						<div style="padding-top: 1%">
							<input type="checkbox" name="worktime" id="r3" value="20">
                      		<label style="color: #888;">周二上午</label>
                      		&nbsp
							<input type="checkbox" name="worktime" id="r4" value="21">
                      		<label style="color: #888;">周二下午</label>
						</div>
						<div style="padding-top: 1%">
							<input type="checkbox" name="worktime" id="r5" value="30">
                      		<label style="color: #888;">周三上午</label>
                      		&nbsp
							<input type="checkbox" name="worktime" id="r6" value="31">
                      		<label style="color: #888;">周三下午</label>
						</div>
						<div style="padding-top: 1%">
							<input type="checkbox" name="worktime" id="r7" value="40">
                      		<label style="color: #888;">周四上午</label>
                      		&nbsp
							<input type="checkbox" name="worktime" id="r8" value="41">
                      		<label style="color: #888;">周四下午</label>
						</div>
						<div style="padding-top: 1%">
							<input type="checkbox" name="worktime" id="r9" value="50">
                      		<label style="color: #888;">周五上午</label>
                      		&nbsp
							<input type="checkbox" name="worktime" id="r10" value="51">
                      		<label style="color: #888;">周五下午</label>
						</div>
						<div style="padding-top: 1%">
							<input type="checkbox" name="worktime" id="r11" value="60">
                      		<label style="color: #888;">周六上午</label>
                      		&nbsp
							<input type="checkbox" name="worktime" id="r12" value="61">
                      		<label style="color: #888;">周六下午</label>
						</div>
						<div style="padding-top: 1%">
							<input type="checkbox" name="worktime" id="r13" value="70">
                      		<label style="color: #888;">周日上午</label>
                      		&nbsp
							<input type="checkbox" name="worktime" id="r14" value="71">
                      		<label style="color: #888;">周日下午</label>
						</div>
						</div>
						</div>
						<div class="col-md-12 send" style="margin-left: 1.5%">
							<input type="submit" value="保存" onclick="JavaScript:return checksubmit();"/>
						</div>
					</form>
					&nbsp

				<div class="clearfix"> </div>
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

</body>
</html> 