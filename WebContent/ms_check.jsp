<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ご注文内容</title>

<!--====================== meta ======================-->
<meta name="description" content="EC" />
<meta name="keywords" content="EC" />
<meta http-equiv="content-style-type" content="text/css" />
<meta http-equiv="content-script-type" content="text/javascript" />

<!--====================== common style ======================-->
<!-- stylesheet -->
<link rel="stylesheet" href="css/style.css" type="text/css" />

<style>

.btn1{
	text-align:center;
	margin-right: -80px;
	}

.btn2{
	text-align:center;
	}

.btn_space{
	width: 280px;
}

.font_midasi{
	font-size:18px; font-weight: bold; color: #FFFFFF;
	margin-right:480px;
	}

.ct_item{
	margin-left: 105px;
	font-size: 14px;
	}

.price_area{
	text-align:right;
	padding-right:10px;
}

.font130{
	padding-left:10px;
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
      <div id="log-box2" class="cmn_cl">
        <div id="head-membership" class="cmn_cl">

          <div id="header_subscribe" >
             <script type="text/javascript">
               Rtoaster.hide();
             </script>
             <p class="msg">ようこそ</p></div>
          </div>
       </div>
     </div>
   </div>
</div>
<!--==================================================================
 	//header
==================================================================-->


<!--==================================================================
 	mainnav(left_areaはここに記入)
==================================================================-->

<div id="mainnav">

</div>
<!--/mainnav -->


<!--==================================================================
 	main
==================================================================-->

<div id="main">
  <div id="main_inner" class="FL">
    <div id="main_content" class="FL">
      <div id="products-wrapper" class="clearfix">

      <s:form action="" method="post" theme="simple">
		<table border="0" width="80%" style="table-layout: auto;" align="center">

		<tr>
		<th bgcolor="#CC0000" class="font_midasi">ご注文内容</th>
		<th bgcolor="#CC0000" ><div class="btn1">
		<input type="submit" value="注文内容を変更する" style="width: 120px;height: 30px" onclick="form.action='CartAction'"/>
		</div></th>
		</tr>

		</table>

		<div class="ct_item">
		<br/>
		<s:property value="#session.name_key.size()" />件のアイテム
		<br/>
		</div>

		<table border="1" width="80%" style="table-layout: auto;" align="center">

		<tr>
		<th bgcolor="#CC0000"><font color="#FFFFFF">商品名</font></th>
		<th bgcolor="#CC0000" width="60"><font color="#FFFFFF">数量</font></th>
		<th bgcolor="#CC0000" width="100"><font color="#FFFFFF">単価</font></th>
		<th bgcolor="#CC0000" width="100"><font color="#FFFFFF">小計</font></th>
		</tr>

		<s:iterator value="#session.name_key">
		<tr>
		<td><div class="font130"><s:property value="item_name" /></div></td>
		<td><div class="number, font130"><s:property value="num" /></div></td>
		<td><div class="price, font130"><s:property value="item_price_yen" /></div></td>
		<td><div class="price, font130"><s:property value="sub_total_yen" /></div></td>
		</tr>
		</s:iterator>

		<tr>
		<td></td><td align="center">総数量 : <s:property value="#session.cart_ttl_num"/></td>
		<td colspan="2" class="price_area"><div class="price">商品合計金額 : <s:property value="#session.cart_ttl" />円</div></td>
		</tr>
		</table>

		<br/><br/>


		<table border="1" width="80%" style="table-layout: auto;" align="center">

		<tr><th bgcolor="#CC0000" colspan="2"><span  class="font_midasi">お客様情報の入力内容</span>
		<span class="btn_space"></span><input class="btn1" type="button" value="顧客情報を変更する" style="width: 120px;height: 30px" onclick="location.href='ms_customer.jsp'"/>
		</th>
		</tr>

		<tr><td height="40" class="font130">お名前</td><td class="font130"><s:property value="#session.customer_name_key"/></td></tr>

		<tr><td height="40" class="font130">メールアドレス</td><td class="font130"><s:property value="#session.mail_key"/></td></tr>

		<tr><td height="40" class="font130">電話番号</td><td class="font130"><s:property value="#session.tel_key"/></td></tr>

		<tr><td height="40" class="font130">郵便番号</td><td class="font130"><s:property value="#session.post_key"/></td></tr>

		<tr><td height="40" class="font130">都道府県</td><td class="font130"><s:property value="#session.ken_key"/></td></tr>

		<tr><td height="40" class="font130">ご住所</td><td class="font130"><s:property value="#session.address_key"/></td></tr>
		</table>
		<br/>


		<div class="btn2">
		<input type="submit" value="注文を確定する" style="width: 100px;height: 30px" onclick="form.action='Order'"/>
		</div>
	   </s:form>

      </div>
    </div>
  </div>
</div>

<!--/main -->

<!--==================================================================
 	footer
==================================================================-->
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