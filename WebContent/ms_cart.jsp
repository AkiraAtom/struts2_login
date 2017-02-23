<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>カートの中身</title>

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
.name{
	margin-left:10px;
}

.price{
	text-align:right;
	margin-right:5px;
	}

.delete{
	text-align:center;
	}

.number{
	text-align:center;
	}

.btn{
	text-align:center;
	margin-right:60px;
	margin-top:10px;
	}

.total{
	text-align:left;
	margin-left:5px;
	}

#font{
font-weight:bold;
	font-size:18px;
}

#font2{
	font-weight:bold;
	font-size:18px;
	color:red;
}

.font_midasi{
	font-size:18px; font-weight: bold; color: #FFFFFF
	}

#footer .info-strip ul{
	width:400px;
}

#blank_area_top{
	height:50px;
}

#blank_area_bottom{
	clear:both;
	height:240px;
}

td{
	padding:3px;
}

</style>

<script>
function on(){
	$(".info-strip").css('display','none');
}
</script>

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
      <s:form action="MsItemInfoSearch" name="E">
      <p><a id="logo" href="#" onclick="document.E.submit()">INTERNOUS OCT STORE</a></p>
      </s:form>
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


<!--/mainnav --></div>


<!--==================================================================
 	main
==================================================================-->

<div id="main">

<div id="main_inner" class="FL">


<div id="main_content" class="FL">


<div id="products-wrapper" class="clearfix">

<c:if test="${max_num_flag == 1}">
<span id="font2">※カートに入れることのできる数量は100個までとなっております。</span>
</c:if>

<table border="0" width="90%" style="table-layout: auto;">
<tr>
<th bgcolor="#CC0000" class="font_midasi"><font color="#FFFFFF">カートの中身</font></th>
</tr>
</table>
<br/>

<c:if test="${empty name_key}" >
	<span id="font">カートに何も入っていません。</span>
</c:if>

<c:if test="${!empty name_key}" >
<table border="1" width="90%" style="table-layout: auto;">

<tr>
<th bgcolor="#CC0000"><font color="#FFFFFF">商品名</font></th>
<th bgcolor="#CC0000" width="60"><font color="#FFFFFF">数量</font></th>
<th bgcolor="#CC0000" width="100"><font color="#FFFFFF">単価</font></th>
<th bgcolor="#CC0000" width="100"><font color="#FFFFFF">小計</font></th>
<th bgcolor="#CC0000" width="30"><font color="#FFFFFF">削除</font></th>
</tr>

<s:iterator value="itemlist">
<tr>
<td><div class="name"><s:property value="item_name" /></div></td>
<td><div class="number"><s:property value="num" /></div></td>
<td><div class="price"><s:property value="item_price_yen" /></div></td>
<td><div class="price"><s:property value="sub_total_yen" /></div></td>
<td><div class="delete"><form method="post" action="CartDelete"><input type="hidden" name="item_id" value="<s:property value="item_id" />"/><input type="submit" name="id" value="削除"/></form></div></td>
</tr>
</s:iterator>

<tr>
<td></td><td align="center">総数量 : <s:property value="#session.cart_ttl_num"/></td>
<td colspan="2"><div class="price">商品合計金額 : <s:property value="total_yen" />円</div></td>
<td></td>
</tr>
</table>
</c:if>

<div class="btn">
<form method="post" action="MsItemInfoSearch"><input type="submit" name="id" value="←ショッピングを続ける" style="width: 130px;height: 25px"/></form>
</div>
<div class="btn">
<c:if test="${!empty name_key}" >
<input type="button" value="￥ レジへ進む" onclick="location.href='ms_customer.jsp'" style="width: 130px;height: 25px"/>
</c:if>
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
