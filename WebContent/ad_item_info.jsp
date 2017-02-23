<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>商品一覧画面</title>

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
#logout{
	float:left;
	height:50px;
	width:100px;
	margin-top:10px;
	position:absolute;
	margin-left:1450px;
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
margin-right:-200px;}
.tx_center{
text-align:center;
}
#login{
float:center;
font-size: 18px;
margin-bottom:5em;
}
#bt1{
float:right;
margin-top:20px;
margin-right:10px;
}
#bt2{
float:right;
margin-top:20px;
}
#bt3{
float:left;
margin-top:20px;
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
margin-top:35px;
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
	height:135px;
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
			<p>商品一覧画面</p>
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
			<s:form action="paging" name="C">
			<s:hidden name="change" value="aditem"/>
			<a href="#" onclick="document.C.submit()">商品登録画面</a>
			</s:form>
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
<p><s:property value="msg"/></p>
<p>全商品 : <s:property value="list_count"/> 件</p>

		<s:form action="adsearch">
			<s:textfield name="kwd" label="キーワード入力"/>
			<s:submit value="検索"/>
		</s:form>


		<s:form action="paging">

				<table border="1" width="100%" style="table-layout: auto;" align="center">

				<tr>
				<th bgcolor="#CC0000" width="15"></th>
				<th bgcolor="#CC0000" width="60"><font color="#FFFFFF">商品ID</font></th>
				<th bgcolor="#CC0000" width="250"><font color="#FFFFFF">商品名</font></th>
				<th bgcolor="#CC0000" width="120"><font color="#FFFFFF">値段</font></th>
				<th bgcolor="#CC0000" width="100"><font color="#FFFFFF">在庫</font></th>
				</tr>

					<s:iterator value="itemlist" status="item">
				<tr>
					<td height="30" class="font130"><input type="radio" name="itemselect" value="<s:property value="item_id"/>"/></td>
					<td height="30" class="font130"><s:property value="item_id"/></td>
					<td height="30" class="font130"><s:property value="item_name"/></td>
					<td height="30" class="font130"><s:property value="item_price"/></td>
					<td height="30" class="font130"><s:property value="item_stock"/></td>
				</tr>
				</s:iterator>
			</table>
			<s:hidden name = "change" value = "adedit"/>
			<div id="bt3"><s:submit value = "削除・変更する"/></div>
		</s:form>

		<div id="bt2">
		<s:form action = "page">
			<s:hidden name = "page" value = "next"/>
			<input type="hidden" name="paging" value="<s:property value="paging2"/>"/>
			<input type="hidden" name="list_count" value="<s:property value="list_count"/>"/>
			<s:hidden name = "select" value="item"/>
			<s:submit value="次ページ"/>
		</s:form></div>
		<div id="bt1"><s:form action = "page">
			<s:hidden name = "page" value="back"/>
			<input type="hidden" name="paging" value="<s:property value="paging2"/>"/>
			<input type="hidden" name="list_count" value="<s:property value="list_count"/>"/>
			<s:hidden name = "select" value="item"/>
			<s:submit value="前ページ"/>
		</s:form></div>


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