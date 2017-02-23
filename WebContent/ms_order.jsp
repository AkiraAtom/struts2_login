<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ご注文確定</title>

<!--====================== meta ======================-->
<meta name="description" content="EC" />
<meta name="keywords" content="EC" />
<meta http-equiv="content-style-type" content="text/css" />
<meta http-equiv="content-script-type" content="text/javascript" />

<!--====================== common style ======================-->
<!-- stylesheet -->
<link rel="stylesheet" href="css/style.css" type="text/css" />
<style>

.msg{
	padding: 20px;
	text-align: center;
	font-size: 16px;
	}

.font_midasi{
	font-size:18px;
	font-weight: bold;
	color: #FFFFFF
	}

.btn{
	text-align:center;
	}

#blank_area_top{
	height:175px;
}


#blank_area_bottom{
	clear:both;
	height:130px;
}


#footer .info-strip ul{
	width:400px;
}
</style>
<!-- javascript -->

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
<!--/header --></div>
<!--==================================================================
 	//header
==================================================================-->

<div id="blank_area_top"></div>

<!--==================================================================
 	mainnav(left_areaはここに記入)
==================================================================-->

<div id="mainnav">

</div>

<!--==================================================================
 	main
==================================================================-->

<div id="main">
  <div id="main_inner" class="FL">
    <div id="main_content" class="FL">
      <div id="products-wrapper" class="clearfix">

		<c:if test="${flg == 0}">
			<table border="1" cellspacing="0" width="90%" style="table-layout: auto;" align="center">

			<tr><th bgcolor="#CC0000" class="font_midasi">ご注文の確定</th></tr>

			<tr><td class="msg">ご注文ありがとうございます。<br/>ご注文の内容をお客様宛てに自動送信致しました。 </td></tr>
			</table>

	        <div class="btn">

				<br/><br/>
				<form method="post" action="MsItemInfoSearch">
				<input type="submit" name="id" value="←ショッピングを続ける" style="width: 130px;height: 25px"/>
				</form><br/><br/>
				</div>
		</c:if>

        <c:if test="${flg == 1}">
	        <table border="1" cellspacing="0" width="90%" style="table-layout: auto;" align="center">

			<tr><th bgcolor="#CC0000" class="font_midasi">ご注文の確定</th></tr>

			<tr><td class="msg">ご注文ありがとうございます。<br/>ご注文の内容をお客様宛てに自動送信致しました。
			<br/>注文内容の中で全て、もしくは一部の商品の在庫数を超えているものがあります。<br/>そちらの商品が入荷次第,別途お送りさせていただきます。</td></tr>
			</table>

	        <div class="btn">

				<br/><br/>
				<form method="post" action="MsItemInfoSearch">
				<input type="submit" name="id" value="←ショッピングを続ける" style="width: 130px;height: 25px"/>
				</form><br/><br/>
				</div>
        </c:if>

        <c:if test="${flg == 2}">
	        <table border="1" cellspacing="0" width="90%" style="table-layout: auto;" align="center">

			<tr><th bgcolor="#CC0000" class="font_midasi">ご注文の確定</th></tr>

			<tr><td class="msg">ブラウザの戻るボタンを使用した為ページでエラーが発生しました。<br/>恐れ入りますがもう一度TOPページよりやり直して下さい。</td></tr>
			</table>

	        <div class="btn">

				<br/><br/>
				<form method="post" action="MsItemInfoSearch">
				<input type="submit" name="id" value="←ショッピングを続ける" style="width: 130px;height: 25px"/>
				</form><br/><br/>
				</div>
        </c:if>
      </div>
    </div>
  </div>
</div>

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
</div>
<!--/body -->
</body>
</html>