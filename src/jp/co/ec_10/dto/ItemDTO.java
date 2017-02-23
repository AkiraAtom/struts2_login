package jp.co.ec_10.dto;

import java.text.NumberFormat;


public class ItemDTO {


private int item_id;
private String item_name;
private int item_price;
private int item_stock;
private String item_img;
private String item_price_yen;

public int getItem_id() {
	return item_id;
}
public String getItem_name() {
	return item_name;
}
public int getItem_price() {
	return item_price;
}
public int getItem_stock() {
	return item_stock;
}
public String getItem_img() {
	return item_img;
}
public void setItem_id(int item_id) {
	this.item_id = item_id;
}
public void setItem_name(String item_name) {
	this.item_name = item_name;
}
public void setItem_price(int item_price) {
	this.item_price = item_price;
}
public void setItem_stock(int item_stock) {
	this.item_stock = item_stock;
}
public void setItem_img(String item_img) {
	this.item_img = item_img;
}
public String getItem_price_yen() {
	 NumberFormat nfNum = NumberFormat.getNumberInstance();
	 item_price_yen=nfNum.format(item_price);
	return item_price_yen;
}
public void setItem_price_yen(String item_price_yen) {
	this.item_price_yen = item_price_yen;
}



}
