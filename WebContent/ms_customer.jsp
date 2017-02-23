<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>お客様情報入力</title>

<!--====================== meta ======================-->
<meta name="description" content="EC" />
<meta name="keywords" content="EC" />
<meta http-equiv="content-style-type" content="text/css" />
<meta http-equiv="content-script-type" content="text/javascript" />

<!--====================== common style ======================-->
<!-- stylesheet -->
<link rel="stylesheet" href="css/style.css" type="text/css" />

<style>

.btn{
	text-align:center;
	}

.font_midasi{
	font-size:18px; font-weight: bold; color: #FFFFFF
	}

.font130{
	font-size:14px; font-weight: bold;
	padding-left:10px;
	}

.errorMessage{
    font-size: 14px; color: #CC0000;font-weight: bold;
	}

.space_area{
	padding-left:10px;
}

#blank_area_top{
	height:70px;
}


#blank_area_bottom{
	clear:both;
	height:75px;
}

#footer .info-strip ul{
	width:400px;
}
</style>

<script type="text/javascript">
$(".ken_select").html("str");
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

		<div id="ken_session_num"></div>
		<div class="ken_select"></div>

		<script>
			var str = $("#ken_session_num").text();
			$(".ken_select").text("str");
			if(str == "1"){
				$(".ken_select").html("error");
			}else{
				$(".ken_select").html("success");
			};
		</script>

		<s:form action="" method="post" theme="simple">

		<input type="hidden" name="mailerror" value="<s:property value="mailerror"/>"/>

		<table border="l" width="80%" style="table-layout: auto;" align="center">

			<tr><th bgcolor="#CC0000" colspan="2" class="font_midasi">お客様情報の入力</th></tr>

			<tr><td height="40" class="font130">お名前</td><td class="font130">        <input type="text" name="customer_name" value="<s:property value="#session.customer_name_key"/>"/>  例) 田中 太郎  <s:fielderror><s:param value="%{'customer_name'}" /></s:fielderror></td></tr>

			<tr><td height="40" class="font130">メールアドレス</td><td class="font130"><input type="text" name="mail" value="<s:property value="#session.mail_key"/>"/>  例）abc@codomo.ne.jp  <s:fielderror><s:param value="%{'mail'}" /></s:fielderror></td></tr>

			<tr><td height="60" class="font130">メールアドレス(確認)</td><td class="font130"><input type="text" name="mail_check" value="<s:property value="#session.mail_check_key"/>"/><br/> (確認のためもう一度ご記入下さい)<br/><div class="errorMessage"><s:property value="mailerror"/></div></td></tr>

			<tr><td height="40" class="font130">電話番号</td><td class="font130"><input type="text" name="tel" maxlength="11"  value="<s:property value="#session.tel_key"/>"/>  例) 0312345678  <s:fielderror><s:param value="%{'tel'}" /></s:fielderror></td></tr>

			<tr><td height="40" class="font130">郵便番号</td><td class="font130"><input type="text" name="post" maxlength="7" value="<s:property value="#session.post_key"/>"/>  例) 1230001  <s:fielderror><s:param value="%{'post'}" /></s:fielderror></td></tr>

			<tr><td height="40" class="font130">都道府県</td>

			<td>
			<span class="space_area"></span>
			<select name="ken" >
			<option value="<s:property value="#session.ken_key"/>" selected="selected"><s:property value="#session.ken_key"/></option>
			<option value="北海道">北海道</option>
			<option value="青森県">青森県</option>
			<option value="秋田県">秋田県</option>
			<option value="岩手県">岩手県</option>
			<option value="宮城県">宮城県</option>
			<option value="山形県">山形県</option>
			<option value="福島県">福島県</option>
			<option value="栃木県">栃木県</option>
			<option value="新潟県">新潟県</option>
			<option value="群馬県">群馬県</option>
			<option value="埼玉県">埼玉県</option>
			<option value="茨城県">茨城県</option>
			<option value="千葉県">千葉県</option>
			<option value="東京都">東京都</option>
			<option value="神奈川県">神奈川県</option>
			<option value="山梨県">山梨県</option>
			<option value="長野県">長野県</option>
			<option value="岐阜県">岐阜県</option>
			<option value="富山県">富山県</option>
			<option value="石川県">石川県</option>
			<option value="静岡県">静岡県</option>
			<option value="愛知県">愛知県</option>
			<option value="三重県">三重県</option>
			<option value="奈良県">奈良県</option>
			<option value="和歌山県">和歌山県</option>
			<option value="福井県">福井県</option>
			<option value="滋賀県">滋賀県</option>
			<option value="京都府">京都府</option>
			<option value="大阪府">大阪府</option>
			<option value="兵庫県">兵庫県</option>
			<option value="岡山県">岡山県</option>
			<option value="鳥取県">鳥取県</option>
			<option value="島根県">島根県</option>
			<option value="広島県">広島県</option>
			<option value="山口県">山口県</option>
			<option value="香川県">香川県</option>
			<option value="徳島県">徳島県</option>
			<option value="愛媛県">愛媛県</option>
			<option value="高知県">高知県</option>
			<option value="福岡県">福岡県</option>
			<option value="佐賀県">佐賀県</option>
			<option value="大分県">大分県</option>
			<option value="熊本県">熊本県</option>
			<option value="宮崎県">宮崎県</option>
			<option value="長崎県">長崎県</option>
			<option value="鹿児島県">鹿児島県</option>
			<option value="沖縄県">沖縄県</option>

			</select><s:fielderror><s:param value="%{'ken'}" /></s:fielderror></td></tr>

			<tr><td height="40" class="font130">ご住所</td><td class="font130"><input type="text" name="address" maxlength="255" value="<s:property value="#session.address_key"/>"/>  例) 文京区後楽1-1-1  <s:fielderror><s:param value="%{'address'}" /></s:fielderror></td></tr>
			</table>

			  <div class="btn"><br/><br/>

				<input type="submit" value="カートの確認をする" style="width: 100px;height: 30px" onclick="form.action='CartAction'"/>

				<input type="submit" value="ご注文内容の確認"  style="width: 100px;height: 30px" onclick="form.action='OrderCheck'"/>
				<br/><br/>
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
