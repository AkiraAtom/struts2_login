<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!--
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
-->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1" /> <!-- レイアウト互換 -->
<title>INTERNOUS OCT STORE HOME</title>

<!--====================== meta ======================-->
<meta name="description" content="EC" />
<meta name="keywords" content="EC" />
<meta http-equiv="content-style-type" content="text/css" />
<meta http-equiv="content-script-type" content="text/javascript" />

<!--====================== common style ======================-->
<!-- stylesheet -->
<link rel="stylesheet" href="css/style.css" type="text/css" />

<!-- javascript -->
<!--Rtoaster-->
<script type="text/javascript" src="//rt.rtoaster.jp/Rtoaster.js"></script>
<script type="text/javascript">
Rtoaster.init("RTA-c57d-20d498af0a72");
Rtoaster.track();
</script>


<style>
.info{
padding-top:150px;
}

#title_area{
	clear:both;
	height:60px;
	width:1800px;
	position:absolute;
	margin-top:10px;
	margin-left:200px;
	font-size:48px;
	color:black;
}

#confirm_area, #session_bt{
	display:none;
}

#button_design{
	background-color:#CC0000;
	border-style: none;
}

p.ellipsis {
  /*width: 130px;*/
  width: 110px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  -o-text-overflow: ellipsis;
}

</style>

<!-- bxSlider Javascript file -->
<script src="js/jquery.bxslider.min.js"></script>
<script type="text/javascript" src="js/jquery-1.3.2.js"></script>
<script type="text/javascript" src="js/jquery.maximage.js"></script>
<script src="js/jquery.ah-placeholder.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">


//画面最大化
function on(){
	window.moveTo(0,0);
	window.resizeBy(window.screen.availWidth , window.screen.availHeight);
}

</script>


</head>

<body id="top" onload="on();">

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
             <p class="msg">ようこそ！！</p></div>
          </div>

          <p class="head-bdr">&nbsp;</p>

          <div id="head-cart">
             <p class="cart cmn_cl"><a href="#" onclick="document.formName.submit()">カートの中身を確認</a></p>
          </div>
       </div>
     </div>
   </div>
<!--/header --></div>
<!--==================================================================
 	//header
==================================================================-->

<!--==================================================================
 	mainnav(left_areaはここに記入)
==================================================================-->

<div id="mainnav">
<div id="nav">
<!--==================================================================
 	navigation
==================================================================-->
<div id="navigation">
<div id="subnav" class="cml_cl">
<div class="search-box">

<s:form id="gsearch" name="gsearch" method="post" action="ItemSearch">
<input type="text" name="kwd" id="kwd" placeholder="アイテムをさがす" class="input-txt" />
<input type="submit" name="submit" id="kwdb" value="" class="submit" />
</s:form>

</div>
</div>
</div> <!--/navigation -->
<div id="cart_ck">




<form method="post" action="CartAction"></form>
<div id="cart_ck">


<form action="CartAction" method="post" name="formName">
<a href="#" onclick="document.formName.submit()"><font size="4">カートの中身を確認</font></a>
</form>

</div>





</div>

<div id="session_bt">
<form action="SessionClear" method="post">
<input type="submit" value="セッション削除" />
<input name="paging" value="0"/> <!-- paging初期値 -->
</form>
</div>

</div>
<!--/mainnav --></div>


<!--==================================================================
 	main
==================================================================-->

<div id="main">

<div id="main_inner" class="FL">


<div id="main_content" class="FL">


<div id="products-wrapper" class="clearfix">


<div id="grid" class="clearfix">


<!--  iterator設定(検索結果表示) -->

<div id="confirm_area">

<p>ここに結果表示</p>
<div id="search_flg">0</div>

<div class="comment">111</div>

<select name="num"><span class="select_box_num"><option value="1">1</option><option value="2">2</option></span></select>

<span class="select_box_num"></span>


</div> <!-- confirm_area -->

<div id="start_info">

<ul class="sorted">

<div id="product0"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(0).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(0).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(0).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num0"><s:property value="itemlist.get(0).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box0"><span class="stock_num_select0"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num0").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num0").html() != "0"){
			$(".stock_num_select0").html(str);
		}

	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(0).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(0).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(0).getItem_id()'/>">

	<span class="cart_bt0_area"></span>
	<script>
			if($(".stock_num0").html() != "0"){
				$(".cart_bt0_area").html("<button class='cart_bt0'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product0 -->

<div id="product1"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(1).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(1).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(1).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num1"><s:property value="itemlist.get(1).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box1"><span class="stock_num_select1"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num1").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num1").html() != "0"){
			$(".stock_num_select1").html(str);
		}

	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(1).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(1).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(1).getItem_id()'/>">

	<span class="cart_bt1_area"></span>
	<script>
			if($(".stock_num1").html() != "0"){
				$(".cart_bt1_area").html("<button class='cart_bt1'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product1 -->

<div id="product2"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(2).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(2).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(2).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num2"><s:property value="itemlist.get(2).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box2"><span class="stock_num_select2"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num2").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num2").html() != "0"){
			$(".stock_num_select2").html(str);
		}

	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(2).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(2).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(2).getItem_id()'/>">

	<span class="cart_bt2_area"></span>
	<script>
			if($(".stock_num2").html() != "0"){
				$(".cart_bt2_area").html("<button class='cart_bt2'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product2 -->

<div id="product3"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(3).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(3).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(3).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num3"><s:property value="itemlist.get(3).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box3"><span class="stock_num_select3"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num3").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num3").html() != "0"){
			$(".stock_num_select3").html(str);
		}

	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(3).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(3).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(3).getItem_id()'/>">

	<span class="cart_bt3_area"></span>
	<script>
			if($(".stock_num3").html() != "0"){
				$(".cart_bt3_area").html("<button class='cart_bt3'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product3 -->

<div id="product4"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(4).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(4).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(4).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num4"><s:property value="itemlist.get(4).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box4"><span class="stock_num_select4"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num4").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num4").html() != "0"){
			$(".stock_num_select4").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(4).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(4).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(4).getItem_id()'/>">

	<span class="cart_bt4_area"></span>
	<script>
			if($(".stock_num4").html() != "0"){
				$(".cart_bt4_area").html("<button class='cart_bt4'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product0 -->

<div id="product5"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(5).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(5).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(5).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num5"><s:property value="itemlist.get(5).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box5"><span class="stock_num_select5"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num5").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num5").html() != "0"){
			$(".stock_num_select5").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(5).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(5).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(5).getItem_id()'/>">

	<span class="cart_bt5_area"></span>
	<script>
			if($(".stock_num5").html() != "0"){
				$(".cart_bt5_area").html("<button class='cart_bt5'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product5 -->

<div id="product6"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(6).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(6).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(6).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num6"><s:property value="itemlist.get(6).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box6"><span class="stock_num_select6"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num6").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num6").html() != "0"){
			$(".stock_num_select6").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(6).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(6).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(6).getItem_id()'/>">

	<span class="cart_bt6_area"></span>
	<script>
			if($(".stock_num6").html() != "0"){
				$(".cart_bt6_area").html("<button class='cart_bt6'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product6 -->

<div id="product7"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(7).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(7).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(7).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num7"><s:property value="itemlist.get(7).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box7"><span class="stock_num_select7"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num7").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num7").html() != "0"){
			$(".stock_num_select7").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(7).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(7).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(7).getItem_id()'/>">

	<span class="cart_bt7_area"></span>
	<script>
			if($(".stock_num7").html() != "0"){
				$(".cart_bt7_area").html("<button class='cart_bt7'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product7 -->

<div id="product8"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(8).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(8).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(8).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num8"><s:property value="itemlist.get(8).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box8"><span class="stock_num_select8"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num8").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num8").html() != "0"){
			$(".stock_num_select8").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(8).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(8).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(8).getItem_id()'/>">

	<span class="cart_bt8_area"></span>
	<script>
			if($(".stock_num8").html() != "0"){
				$(".cart_bt8_area").html("<button class='cart_bt8'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product8 -->

<div id="product9"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(9).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(9).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(9).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num9"><s:property value="itemlist.get(9).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box9"><span class="stock_num_select9"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num9").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num9").html() != "0"){
			$(".stock_num_select9").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(9).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(9).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(9).getItem_id()'/>">

	<span class="cart_bt9_area"></span>
	<script>
			if($(".stock_num9").html() != "0"){
				$(".cart_bt9_area").html("<button class='cart_bt9'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product9 -->

<div id="product10"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(10).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(10).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(10).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num10"><s:property value="itemlist.get(10).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box10"><span class="stock_num_select10"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num10").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num10").html() != "0"){
			$(".stock_num_select10").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(10).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(10).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(10).getItem_id()'/>">

	<span class="cart_bt10_area"></span>
	<script>
			if($(".stock_num10").html() != "0"){
				$(".cart_bt10_area").html("<button class='cart_bt10'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product10 -->

<div id="product11"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(11).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(11).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(11).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num11"><s:property value="itemlist.get(11).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box11"><span class="stock_num_select11"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num11").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num11").html() != "0"){
			$(".stock_num_select11").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(11).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(11).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(11).getItem_id()'/>">

	<span class="cart_bt11_area"></span>
	<script>
			if($(".stock_num11").html() != "0"){
				$(".cart_bt11_area").html("<button class='cart_bt11'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product11 -->

<div id="product12"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(12).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(12).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(12).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num12"><s:property value="itemlist.get(12).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box12"><span class="stock_num_select12"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num12").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num12").html() != "0"){
			$(".stock_num_select12").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(12).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(12).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(12).getItem_id()'/>">

	<span class="cart_bt12_area"></span>
	<script>
			if($(".stock_num12").html() != "0"){
				$(".cart_bt12_area").html("<button class='cart_bt12'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product12 -->

<div id="product13"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(13).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(13).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(13).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num13"><s:property value="itemlist.get(13).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box13"><span class="stock_num_select13"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num13").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num13").html() != "0"){
			$(".stock_num_select13").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(13).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(13).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(13).getItem_id()'/>">

	<span class="cart_bt13_area"></span>
	<script>
			if($(".stock_num13").html() != "0"){
				$(".cart_bt13_area").html("<button class='cart_bt13'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product13 -->

<div id="product14"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(14).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(14).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(14).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num14"><s:property value="itemlist.get(14).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box14"><span class="stock_num_select14"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num14").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num14").html() != "0"){
			$(".stock_num_select14").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(14).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(14).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(14).getItem_id()'/>">

	<span class="cart_bt14_area"></span>
	<script>
			if($(".stock_num14").html() != "0"){
				$(".cart_bt14_area").html("<button class='cart_bt14'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product14 -->

<div id="product15"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(15).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(15).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(15).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num15"><s:property value="itemlist.get(15).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box15"><span class="stock_num_select15"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num15").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num15").html() != "0"){
			$(".stock_num_select15").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(15).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(15).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(15).getItem_id()'/>">

	<span class="cart_bt15_area"></span>
	<script>
			if($(".stock_num15").html() != "0"){
				$(".cart_bt15_area").html("<button class='cart_bt15'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product15 -->

<div id="product16"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(16).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(16).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(16).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num16"><s:property value="itemlist.get(16).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box16"><span class="stock_num_select16"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num16").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num16").html() != "0"){
			$(".stock_num_select16").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(16).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(16).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(16).getItem_id()'/>">

	<span class="cart_bt16_area"></span>
	<script>
			if($(".stock_num16").html() != "0"){
				$(".cart_bt16_area").html("<button class='cart_bt16'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product16 -->

<div id="product17"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(17).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(17).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(17).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num17"><s:property value="itemlist.get(17).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box17"><span class="stock_num_select17"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num17").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num17").html() != "0"){
			$(".stock_num_select17").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(17).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(17).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(17).getItem_id()'/>">

	<span class="cart_bt17_area"></span>
	<script>
			if($(".stock_num17").html() != "0"){
				$(".cart_bt17_area").html("<button class='cart_bt17'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product17 -->

<div id="product18"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(18).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(18).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(18).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num18"><s:property value="itemlist.get(18).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box18"><span class="stock_num_select18"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num18").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num18").html() != "0"){
			$(".stock_num_select18").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(18).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(18).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(18).getItem_id()'/>">

	<span class="cart_bt18_area"></span>
	<script>
			if($(".stock_num18").html() != "0"){
				$(".cart_bt18_area").html("<button class='cart_bt18'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product18 -->

<div id="product19"> <!-- 配列だから0から -->
    <li class="product"><img src="<s:property value='itemlist.get(19).getItem_img()' />" width="160" height="160" alt="" />
	<div class="icon"><img src="img/osusume.jpg" /></div>

	<div class="info">
	<h3></h3>
	<h2><p class="ellipsis"><s:property value="itemlist.get(19).getItem_name()"/></p></h2>

	<div class="price"> <span>&yen;<s:property value="itemlist.get(19).getItem_price_yen()"/></span></div>
	<div class="stock"> <span>在庫：</span><span  class="stock_num19"><s:property value="itemlist.get(19).getItem_stock()"/></span><span>個</span></div>


	<form method="post" action="CartAction">


	<div class="select_box19"><span class="stock_num_select19"></span></div>

	<script> <!--selectbox作成-->

		var num = $(".stock_num19").html();
		var num_int = parseInt(num);

		if(num_int >= 30){ /* 最大数の設定 */
			num_int=30;
		}

		var str = "<select name='num'>";
		for(i=1; i<=num_int; i++){
			str += "<option value='" + i + "'>" + i + "</option>";
		}

		str += "</select>個";

		if($(".stock_num19").html() != "0"){
			$(".stock_num_select19").html(str);
		}


	</script>

	<input type="hidden" name="item_name" value="<s:property value='itemlist.get(19).getItem_name()'/>">
	<input type="hidden" name="item_price" value="<s:property value='itemlist.get(19).getItem_price()'/>">
	<input type="hidden" name="item_id" value="<s:property value='itemlist.get(19).getItem_id()'/>">

	<span class="cart_bt19_area"></span>
	<script>
			if($(".stock_num19").html() != "0"){
				$(".cart_bt19_area").html("<button class='cart_bt19'>カートに入れる</button>");
			}
	</script>
	</form>

	</div>
	</li>
</div> <!-- product19 -->


	<script> <!-- total_numの数(表示される商品数)によりproduct0～19の箱を消す-->
		var num4 = $(".total_num").html();
		if(num4 == "0"){
			$("#product0").css('display','none');
			$("#product1").css('display','none');
			$("#product2").css('display','none');
			$("#product3").css('display','none');
			$("#product4").css('display','none');
			$("#product5").css('display','none');
			$("#product6").css('display','none');
			$("#product7").css('display','none');
			$("#product8").css('display','none');
			$("#product9").css('display','none');
			$("#product10").css('display','none');
			$("#product11").css('display','none');
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "1"){
			$("#product1").css('display','none');
			$("#product2").css('display','none');
			$("#product3").css('display','none');
			$("#product4").css('display','none');
			$("#product5").css('display','none');
			$("#product6").css('display','none');
			$("#product7").css('display','none');
			$("#product8").css('display','none');
			$("#product9").css('display','none');
			$("#product10").css('display','none');
			$("#product11").css('display','none');
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "2"){
			$("#product2").css('display','none');
			$("#product3").css('display','none');
			$("#product4").css('display','none');
			$("#product5").css('display','none');
			$("#product6").css('display','none');
			$("#product7").css('display','none');
			$("#product8").css('display','none');
			$("#product9").css('display','none');
			$("#product10").css('display','none');
			$("#product11").css('display','none');
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "3"){
			$("#product3").css('display','none');
			$("#product4").css('display','none');
			$("#product5").css('display','none');
			$("#product6").css('display','none');
			$("#product7").css('display','none');
			$("#product8").css('display','none');
			$("#product9").css('display','none');
			$("#product10").css('display','none');
			$("#product11").css('display','none');
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "4"){
			$("#product4").css('display','none');
			$("#product5").css('display','none');
			$("#product6").css('display','none');
			$("#product7").css('display','none');
			$("#product8").css('display','none');
			$("#product9").css('display','none');
			$("#product10").css('display','none');
			$("#product11").css('display','none');
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "5"){
			$("#product5").css('display','none');
			$("#product6").css('display','none');
			$("#product7").css('display','none');
			$("#product8").css('display','none');
			$("#product9").css('display','none');
			$("#product10").css('display','none');
			$("#product11").css('display','none');
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "6"){
			$("#product6").css('display','none');
			$("#product7").css('display','none');
			$("#product8").css('display','none');
			$("#product9").css('display','none');
			$("#product10").css('display','none');
			$("#product11").css('display','none');
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "7"){
			$("#product7").css('display','none');
			$("#product8").css('display','none');
			$("#product9").css('display','none');
			$("#product10").css('display','none');
			$("#product11").css('display','none');
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "8"){
			$("#product8").css('display','none');
			$("#product9").css('display','none');
			$("#product10").css('display','none');
			$("#product11").css('display','none');
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "9"){
			$("#product9").css('display','none');
			$("#product10").css('display','none');
			$("#product11").css('display','none');
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "10"){
			$("#product10").css('display','none');
			$("#product11").css('display','none');
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "11"){
			$("#product11").css('display','none');
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "12"){
			$("#product12").css('display','none');
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "13"){
			$("#product13").css('display','none');
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "14"){
			$("#product14").css('display','none');
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "15"){
			$("#product15").css('display','none');
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "16"){
			$("#product16").css('display','none');
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "17"){
			$("#product17").css('display','none');
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "18"){
			$("#product18").css('display','none');
			$("#product19").css('display','none');
		}else if(num4 == "19"){
			$("#product19").css('display','none');
		}
	</script>


</ul>

</div><!-- /start_info -->

</div><!--/grid -->

<script>
//在庫数と選択数比較
$(".select_num").change(function(){
	alert("選択した個数が在庫数を超えています。もう一度選択してください。");
});
</script>

</div>
</div>
<!--/main --></div>

<!--/main --></div>

<!--
<div id="blank"></div>
-->

<!--==================================================================
 	footer
==================================================================-->
<div id="footer">
<div class="info-strip">
<div class="foot-info">
<ul class="cmn_cl">
<li>Copyright 2014 INTERNOUS OCT STORE Store All Rights Reserved / </li>
</ul>
<div id="admin_in">
<div id="admin_in_info">

<s:form action="paging">
<s:hidden name="change" value="login"/>
<s:submit value ="管理者ログイン"/>
</s:form>
</div>
</div><!-- /admin_in -->
</div>
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
