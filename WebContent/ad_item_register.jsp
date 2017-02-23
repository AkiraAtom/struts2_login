<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>商品登録画面</title>

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
#left{
	float:left;
	width:350px;
	height:200px;
	margin-top:15px;
	margin-bottom:200px;
	padding-left:50px;
}
#right{
	float:left;
	width:350px;
	height:150px;
	margin-left:100px;
	margin-top:15px;
	padding-left:50px;
}
#center {
	float: center;
	font-size:25px;

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
#bt1{
float:left;
margin-top:20px;
margin-right:10px;
}
#bt2{
float:right;
margin-top:20px;
}
#nav{
height:500px;
margin-left:200px;
margin-right:-200px;

}
#main{
float:left;
margin-left:450px;
margin-right:-450px;
margin-top:100px;
margin-bottom:-50px;
}
tr.#itemreg{
	font:24px;
	margin-bottom:10px;
	height:35px;
}
td{
	padding:3px;
}
#itemreg{
	height:200px;
}

#main #main_inner{
width:300px;
}
#main_content{
	width:600px;
}

#blank_area_top{
	height:95px;
}

#blank_area_bottom{
	clear:both;
	height:200px;
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
		<table>
	<tr>
		<td>
			<s:form action="paging" name="A">
			<s:hidden name="change" value="adtop"/>
			<a href="#" onclick="document.A.submit()">商品一覧画面</a>
			</s:form>
		</td>
	</tr>
	<tr>
		<td>
			<s:form action="paging" name="B">
			<s:hidden name="change" value="adorder"/>
			<a href="#" onclick="document.B.submit()">注文情報一覧画面</a>
			</s:form>
		</td>
	</tr>
	<tr>
		<td>
			<p>商品登録画面</p>
		</td>
	</tr>
	<tr>
		<td>
			<s:form action="paging" name="D">
			<s:hidden name="change" value="admin"/>
			<a href="#" onclick="document.D.submit()">管理者登録画面</a>
			</s:form>
		</td>
	</tr>
</table>

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


<div id="main_content" class="FL">

	<div id="center">
		<h1>新しい商品を登録してください。</h1>
		<p><s:property value="msg"/></p>
	</div>
	<s:form action="itemreg">
		<div class="font13"><s:textfield name ="inputitem" label ="商品名" class="font130" cssStyle="font-size:20px; width:250px;" /></div>
		<div class="font13"><s:textfield name ="inputprice" label ="値　段" class="font130" cssStyle="font-size:20px; width:250px;" /></div>
		<div class="font13"><s:textfield name ="inputstock" label ="在　庫" class="font130" cssStyle="font-size:20px; width:250px;" /></div>
		<div class="font13"><s:textfield name ="inputimg" label ="画像パス" class="font130" cssStyle="font-size:20px; width:250px;" /></div>
		<div id="bt1"><s:submit value ="登録する"/></div>
		<div id="bt2"><s:reset value ="クリア"/></div>
	</s:form>

</div>
<!--/main --></div>

<!--/main --></div>

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