<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    <%@ page import="java.sql.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>管理者登録画面</title>

<!--====================== meta ======================-->
<meta name="description" content="EC" />
<meta name="keywords" content="EC" />
<meta http-equiv="content-style-type" content="text/css" />
<meta http-equiv="content-script-type" content="text/javascript" />

<!--====================== common style ======================-->
<!-- stylesheet -->
<link rel="stylesheet" href="css/style.css" type="text/css" />

<!-- javascript -->
<style>
#regist{
float:center;
font-size: 18px;
margin-bottom:5em;
}
#nav{
margin-left:20px;


}
#main{
margin-left:200px;
margin-right:-200px;
margin-top:100px;
margin-bottom:-250px;
}

.errorMessage{
    font-size: 14px; color: #CC0000;font-weight: bold;
}

#menu{
width:150px;
height:300px;
padding-left:200px;
padding-right:-200px;
}
#mainnav{
float:left;
margin-left:200px;
margin-right:-200px;
}
#btn1{
float:right;
margin-top:20px;
margin-right:20px;
}

#nav{
height:500px;
margin-left:200px;
margin-right:-200px;

}
#main{
float:left;
margin-left:150px;
margin-right:-150px;
margin-top:50px;
margin-bottom:-50px;
}

#main #main_inner{
width:500px;
}
#main_content{
	width:800px;
}

#blank_area_top{
	height:95px;
}

#blank_area_bottom{
	clear:both;
	height:130px;
}

#header_subscribe{
	margin-right:-80px;
}

#footer .info-strip ul{
	width:400px;
}
.logout{
	float: right;
	margin-right: 50px;
}
</style>

</head>
	<body id="top">

<div id="wrapper">
<div id="contents">

<!--==================================================================
 	header
==================================================================-->
<div id="header">
  <div class="head-cont_01">
    <div class="inner">
      <s:form action="paging" name="E">
      <s:hidden name="change" value="logout"/>
      <p><a id="logo" href="#" onclick="document.E.submit()">INTERNOUS OCT STORE</a></p>
      </s:form>
      <div id="log-box2" class="cmn_cl">
        <div id="head-membership" class="cmn_cl">

         <div id="header_subscribe" >
             <script type="text/javascript">
               Rtoaster.hide();
             </script>
             <p class="msg"><s:property value="#session.ad_name_Key"/>さん　ログイン中</p></div>
          </div>

       </div>
     </div>
   </div>
<!--/header --></div>
<!--==================================================================
 	//header
==================================================================-->

<div id="blank_area_top"></div>

<!--==================================================================
 	mainnav(left_areaはここに記入)
==================================================================-->

<div id="mainnav">

<div id="menu">
		<p>
			<s:form action="paging" name="A">
			<s:hidden name="change" value="adtop"/>
			<a href="#" onclick="document.A.submit()">商品一覧画面</a>
			</s:form>
		</p>
		<p>
			<s:form action="paging" name="B">
			<s:hidden name="change" value="adorder"/>
			<a href="#" onclick="document.B.submit()">注文情報一覧画面</a>
			</s:form>
		</p>
				<p>
			<s:form action="paging" name="C">
			<s:hidden name="change" value="aditem"/>
			<a href="#" onclick="document.C.submit()">商品登録画面</a>
			</s:form>
		</p>
		<p>
			管理者登録画面
		</p>
</div>

</div>

<!--==================================================================
 	mainnav(right_areaはここに記入)
==================================================================-->

<div class="logout">

  <s:form action="paging">
  <s:hidden name="change" value="login"/>
  <s:submit value ="ログアウト"/>
  </s:form>

</div>
<!--==================================================================
 	main
==================================================================-->

<div id="main">

<div id="main_inner" class="FL">
<div id="products-wrapper" class="clearfix">


	<div id="regist">
		<h1><b>管理者登録画面</b></h1>
	<s:form action="RegisterAction" method="post" theme="simple">

		<table>
		<tr>
			<td>管理者名を入力してください。</td>
		</tr>
		<tr>
			<td class="font130"><input type="text" name="ad_NAME"/>
			<s:fielderror><s:param value="%{'ad_NAME'}" /></s:fielderror></td>
		</tr>


		<tr>
			<td>管理者IDを英数字8-16桁で入力してください。</td>
		</tr>
		<tr>
			<td class="font130"><input type="text" name="ad_ID"/>
				<s:fielderror><s:param value="%{'ad_ID'}" /></s:fielderror>
				<div class="errorMessage">
					<s:property value="IDPASS_check"/>
					<s:property value="duplication_ad_ID"/>
				</div>
			</td>
		</tr>


		<tr>
			<td>パスワードを英数字8-16桁で入力してください。</td>
		</tr>
		<tr>
			<td class="font130">
			<input type="text" name="ad_PASS"/>
				<s:fielderror>
					<s:param value="%{'ad_PASS'}" />
				</s:fielderror>
			</td>
		</tr>


		<tr>
			<td>再度パスワードを入力してください。</td>
		</tr>
		<tr>
			<td class="font130">
				<input type="text" name="ad_PASS2"/>
				<div class="errorMessage">
					<s:property value="passerror"/>
				</div>
			</td>
		</tr>

		</table>
		<br/>
		<div class="btn1"><input type="submit" value="登録" class="btn"/></div>
	</s:form>

	</div>

</div>

<!--/main --></div>

</div>

<!--
<div id="blank"></div>
-->

<!--==================================================================
 	footer
==================================================================-->
<div id="blank_area_bottom"></div>

<div id="footer">
<div class="info-strip">
<ul class="cmn_cl">
<li>Copyright 2014 INTERNOUS OCT STORE Store All Rights Reserved / </li>
</ul>
</div>
<!--/footer --></div>
<!--==================================================================
 	//footer
==================================================================-->

<!--/contents --></div>
<!--/wrapper --></div>

<!--/body -->
</body>
</html>