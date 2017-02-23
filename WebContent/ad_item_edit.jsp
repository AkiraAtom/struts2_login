<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>商品情報編集画面</title>

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
/*
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
}*/

#center{
	float: center;
	font-size:25px;
}
#bt1{
float:left;
margin-top:20px;
margin-right:10px;
}
#bt2{
float:right;
margin-top:20px;
margin-right:120px;
}
.btn_space{
	width: 80px;
}
.space_area{
	width: 10px;
	margin-left:10px;
}
.red{
	margin-left:10px;
	font:red;
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
#nav{
height:500px;
margin-left:200px;
margin-right:-200px;
}
#main{
float:left;
margin-left:400px;
margin-right:-400px;
margin-top:70px;
margin-bottom:-50px;
}
.font130{
	padding-left:10px;
}

#main #main_inner{
width:300px;
}
#main_content{
	width:600px;
}

#blank_area_top{
	height:80px;
}

#blank_area_bottom{
	clear:both;
	height:150px;
}
#header_subscribe{
	margin-right:-80px;
}

.font_midasi{
	font-size:18px; font-weight: bold; color: #FFFFFF;
}

.font_midasi2{
	font-size:14px; font-weight: bold; color: #FFFFFF;
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


<div id="products-wrapper" class="clearfix">

		<div id="center">
			<h1>商品ID :  <s:property value="#session.ad_edit_Key"/> の編集作業をします。</h1>
			<p><s:property value="msg"/></p>
		</div>



				<s:form action="itemedit">
				<table border="1" width="80%" style="table-layout: auto;" >

				<tr><th bgcolor="#CC0000" colspan="3"><span  class="font_midasi">選択した商品</span>
				<span class="btn_space"></span>
				</th></tr>

				<tr><th bgcolor="#CC0000" class="font_midasi2">項目</th><th bgcolor="#CC0000" class="font_midasi2">変更前</th><th bgcolor="#CC0000" class="font_midasi2">変更後</th></tr>
				<tr><td height="40" class="font130">商品ID</td><td class="font130"><s:property value="#session.ad_edit_Key"/></td><td class="font130"><s:property value="#session.ad_edit_Key"/></td></tr>

				<tr><td height="40" class="font130">商品名</td><td class="font130"><s:property value="#session.ad_item_Key"/></td><td><span class="space_area"><input type="text" name="inputitem" value="<s:property value="#session.ad_item_Key"/>"/><span class="red"><s:fielderror><s:param value="%{'inputitem'}" /></s:fielderror></span></span></td></tr>

				<tr><td height="40" class="font130">値段</td><td class="font130"><s:property value="#session.ad_price_Key"/></td><td><span class="space_area"><input type="text" name="inputprice" value="<s:property value="#session.ad_price_Key"/>"/></span><span class="red"><s:fielderror><s:param value="%{'inputprice'}" /></s:fielderror></span></td></tr>

				<tr><td height="40" class="font130">在庫</td><td class="font130"><s:property value="#session.ad_stock_Key"/></td><td><span class="space_area"><input type="text" name="inputstock" value="<s:property value="#session.ad_stock_Key"/>"/></span><span class="red"><s:fielderror><s:param value="%{'inputstock'}" /></s:fielderror></span></td></tr>

				<tr><td height="40" class="font130">画像パス</td><td class="font130"><s:property value="#session.ad_img_Key"/></td><td><span class="space_area"><input type="text" name="inputimg" value="<s:property value="#session.ad_img_Key"/>"/></span></td></tr>

				</table>

				<div id="bt2">
				<s:submit value="商品を変更" theme="simple" />
				<s:hidden name="inputid" value="%{#session.ad_edit_Key}"/>
				</div>
				</s:form>



			<!-- 	<table border="1" cellspacing="0" cellpadding="3">
					<tr>
						<th>商品ID</th>
						<th>商品名</th>
						<th>値段</th>
						<th>在庫</th>
						<th>画像パス</th>
					</tr>
				<tr>
					<td><s:property value="#session.ad_edit_Key"/></td>
					<td><s:property value="#session.ad_item_Key"/></td>
					<td><s:property value="#session.ad_price_Key"/></td>
					<td><s:property value="#session.ad_stock_Key"/></td>
					<td><s:property value="#session.ad_img_Key"/></td>
				</tr>
				</table>
				-->

			<div id="bt1">
			<s:form action="itemdel">
				<s:hidden name="inputid" value="%{#session.ad_edit_Key}"/>
				<s:submit value="商品を削除"/>
			</s:form>
			</div>



</div>
</div>
<!--/main --></div>

<!--/main --></div>



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
