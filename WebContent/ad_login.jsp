<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>管理者ログイン画面</title>

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
#login{
font-size: 18px;
margin-bottom:5em;
}
#bt1{
float:left;
height:30px;
}
#bt2{
float:left;
height:30px;
}
#nav{
width:200px;
margin-left:200px;
margin-right:-200px;
}
#main{
float:left;
margin-left:470px;
margin-right:-470px;
margin-top:170px;
margin-bottom:-50px;
}
#main #main_inner{
	width:400px;
}
#main_content{
	width:400px;
	float:left;
}
#blank_area_top{
	height:50px;
}


#blank_area_bottom{
	clear:both;
	height:180px;
}

td{
	padding:3px;
}

#footer .info-strip ul{
	width:400px;

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
         </div>
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

<div id="nav">
		<p>
			<s:form action="paging" name="A">
		    <s:hidden name="change" value="logout"/>
	      	<p><a href="#" onclick="document.A.submit()">マイショップ商品一覧画面</a></p>
			</s:form>
		</p>

</div>

<!--/mainnav --></div>


<!--==================================================================
 	main
==================================================================-->

<div id="main">

<div id="main_inner" class="FL">

	<div id="main_content" class="FL">

		<div id="login">
		<s:property value="msg"/>
		<h1><b>管理者ログイン画面</b></h1>
			<s:form action="loginaction">
				<s:textfield name="input_id" label="管理者ID"/>
				<s:password name="input_pass" label="パスワード"/>
				<div id="bt1"><s:submit value="ログイン"/></div>
				<div id="bt2"><s:reset value="クリア"/></div>
			</s:form>
		</div>
	</div>
</div>

<div id="products-wrapper" class="clearfix">


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