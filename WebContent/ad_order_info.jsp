<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=shift_jis" />

		<title>注文情報一覧画面</title>

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
#menu{
width:150px;
height:300px;
padding-left:100px;
padding-right:-100px;
}
#mainnav{
float:left;
margin-left:200px;
margin-right:-200px;
}
.tx_center{
text-align:center;
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
#left{
float:left;
margin: 0 auto;
margin-bottom:5em;
}

#right{
float:right;
margin: 0 auto;
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
margin-top:80px;
margin-bottom:-50px;
}
.font130{
	padding-left:10px;
}

#main #main_inner{
width:300px;
}
#main_content{
	margin-right:-350px;
	width:1200px;
}

#blank_area_top{
	height:50px;
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

.space_area{
	padding-right:10px;
}

.ellipsis250 {
  width: 220px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  -o-text-overflow: ellipsis;
}

.ellipsis220 {
  width: 190px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  -o-text-overflow: ellipsis;
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
			<p>注文情報一覧画面</p>
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


<div id="products-wrapper" class="clearfix">
	<div id="left">
	<h3>注文情報一覧</h3>

		<p>全注文確定数 : <s:property value="list_count"/> 件</p>

		<s:form action="">
		<!--  	<table border="1" cellspacing="0" cellpadding="5">
				<tr>
					<th>注文ID</th>
					<th>商品名</th>
					<th>単価</th>
					<th>購入数</th>
					<th>合計</th>
					<th>購入者</th>
					<th>郵便番号</th>
					<th>電話番号</th>
					<th>メールアドレス</th>
					<th>届け先</th>
					<th>購入日</th>
				</tr>
			-->

			<table border="1" width="100%" style="table-layout: auto;" align="center">

				<tr>
				<th bgcolor="#CC0000" width="70"><font color="#FFFFFF">注文ID</font></th>
				<th bgcolor="#CC0000" width="200"><font color="#FFFFFF">商品名</font></th>
				<th bgcolor="#CC0000" width="60"><font color="#FFFFFF">単価</font></th>
				<th bgcolor="#CC0000" width="80"><font color="#FFFFFF">購入数</font></th>
				<th bgcolor="#CC0000" width="100"><font color="#FFFFFF">小計</font></th>
				<th bgcolor="#CC0000" width="200"><font color="#FFFFFF">購入者</font></th>
				<th bgcolor="#CC0000" width="90"><font color="#FFFFFF">電話番号</font></th>
				<th bgcolor="#CC0000" width="200"><font color="#FFFFFF">メールアドレス</font></th>
				<th bgcolor="#CC0000" width="70"><font color="#FFFFFF">郵便番号</font></th>
				<th bgcolor="#CC0000" width="250"><font color="#FFFFFF">届け先</font></th>
				<th bgcolor="#CC0000" width="220"><font color="#FFFFFF">購入日</font></th>
				</tr>

				<s:iterator value="itemlist" status="order">
				<tr>
					<td width="70"><span class="space_area"></span><s:property value="order_id"/></td>
					<td width="200"><div class="ellipsis200"><span class="space_area"></span><s:property value="item_name"/></div></td>
					<td width="60"><span class="space_area"></span>\ <s:property value="item_price"/></td>
					<td width="80"><span class="space_area"></span><s:property value="order_count"/></td>
					<td width="100"><span class="space_area"></span>\ <s:property value="item_price * order_count"/></td>
					<td width="200"><div class="ellipsis200"><span class="space_area"></span><s:property value="order_customer"/></div></td>
					<td width="90"><span class="space_area"></span><s:property value="order_phone"/></td>
					<td width="200"><div class="ellipsis200"><span class="space_area"></span><s:property value="order_mail"/></div></td>
					<td width="70"><span class="space_area"></span><s:property value="order_post"/></td>
					<td width="250"><div class="ellipsis250"><span class="space_area"></span><s:property value="order_destination"/></div></td>
					<td width="220"><span class="space_area"></span><s:property value="order_day"/></td>
				</tr>
				</s:iterator>
			</table>
		</s:form>
		</div>

		<div id="bt2">
		<s:form action = "page">
			<s:hidden name = "page" value = "next"/>
			<input type="hidden" name="paging" value="<s:property value="paging2"/>"/>
			<input type="hidden" name="list_count" value="<s:property value="list_count"/>"/>
			<s:hidden name = "select" value="order"/>
			<s:submit value="次ページ"/>
		</s:form></div>

		<div id="bt1">
		<s:form action = "page">
			<s:hidden name = "page" value="back"/>
			<input type="hidden" name="paging" value="<s:property value="paging2"/>"/>
			<input type="hidden" name="list_count" value="<s:property value="list_count"/>"/>
			<s:hidden name = "select" value="order"/>
			<s:submit value="前ページ"/>
		</s:form></div>
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