CREATE DATABASE IF NOT EXISTS ec;
USE ec

CREATE TABLE IF NOT EXISTS ADMIN_TABLE(
-- ÇÒID
admin_id varchar(16) not null primary key,
-- ÇÒpX[h
admin_pass varchar(16) not null,
-- ÇÒ¼
admin_name varchar(50) not null
);
-- ÇÒf[^Ìo^i10¶j
insert into ADMIN_TABLE(admin_id,admin_pass,admin_name) values ("12345678","commando","WCgbNX");

CREATE TABLE IF NOT EXISTS ITEM_TABLE(
-- ¤iID
item_id int not null primary key auto_increment,
-- ¤i¼
item_name varchar(255) not null,
-- ¿i
item_price int not null default "1",
-- ÝÉ
item_stock int not null default "0",
-- æpX
item_img varchar(255) not null default "img/noimage.jpg"
);

INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('àÚÕ', 2790, 27, 'img/liquor1.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img)  
VALUES ('ç', 2980, 12, 'img/liquor10.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img)  
VALUES ('vÛc', 3900, 4, 'img/liquor2.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img)  
VALUES ('ªCR', 2490, 39, 'img/liquor3.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('´', 2790, 13, 'img/liquor4.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('Ãs', 2590, 27, 'img/liquor5.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('eÌhû', 2980, 12, 'img/liquor6.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('ãì³', 1900, 24, 'img/liquor7.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('\lã', 4900, 19, 'img/liquor8.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('Ê', 2790, 13, 'img/liquor9.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img)
VALUES ('á~', 2790, 15, 'img/liquor11.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('õ', 2980, 52, 'img/liquor12.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('eP', 1900, 43, 'img/liquor13.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('oH÷', 490, 18, 'img/liquor14.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('§R', 2790, 33, 'img/liquor15.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('çã', 2790, 17, 'img/liquor16.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('ªbc', 2980, 19, 'img/liquor17.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('áß', 1900, 14, 'img/liquor18.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('[é', 490, 20, 'img/liquor19.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock, item_img) 
VALUES ('tÄHá', 2790, 31, 'img/liquor20.jpg');
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('k', 2790, 27);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('FÃI¢', 2980, 12);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('Hò', 1900, 4);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('¤Ì¼', 490, 89);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('¢¨', 2790, 13);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('©T', 2790, 27);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('í¤', 2980, 12);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('·½ò', 1900, 24);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('à¥³@', 490, 89);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('ùÂÃÝ', 2790, 13);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('zãßT', 2790, 17);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('ª@', 2980, 16);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('åCO', 1900, 21);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('ØC', 490, 39);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('ÎT', 2790, 15);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('´½', 2790, 27);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('¨Vº', 2980, 32);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('©úÔ', 1900, 14);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('­ÌØ', 490, 89);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('úiÎ', 2790, 13);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('ãÚyæ', 2790, 27);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('´', 2980, 12);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('¼Ôß', 1900, 4);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('Äáø', 490, 89);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('xM', 2790, 13);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('~Th', 2790, 27);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('ìR', 2980, 12);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('åa¾', 1900, 21);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('^æ¾', 490, 49);
INSERT INTO  ITEM_TABLE (item_name, item_price, item_stock) 
VALUES ('à', 2790, 13);

CREATE TABLE IF NOT EXISTS ORDER_TABLE(
-- ¶ID
order_id int not null primary key auto_increment,
-- ¤iID
item_id int not null,
-- ¶
order_count int not null default "0",
-- wüÒ
order_customer varchar(50) not null,
-- XÖÔ
order_post varchar(7) not null,
-- dbÔ
order_phone varchar(11) not null,
-- E[AhX
order_mail varchar(255) not null,
-- Í¯æ
order_destination varchar(255) not null,
-- wüú
order_day datetime not null default current_timestamp
);

-- ¶îñf[^Ìo^i10¶
INSERT INTO ORDER_TABLE(item_id,order_count,order_customer,order_post,order_phone,order_mail,order_destination) 
values (1,2,"J[rB","1234567","00012345678","commando@ne.jp","¤m§");
INSERT INTO ORDER_TABLE(item_id,order_count,order_customer,order_post,order_phone,order_mail,order_destination) 
values (2,4,"WN\","1234567","00012345678","commando@ne.jp","Ãª§");
INSERT INTO ORDER_TABLE(item_id,order_count,order_customer,order_post,order_phone,order_mail,order_destination) 
values (3,6,"T[","1234567","00012345678","commando@ne.jp","ò§");
INSERT INTO ORDER_TABLE(item_id,order_count,order_customer,order_post,order_phone,order_mail,order_destination) 
values (4,1,"GXP","1234567","00012345678","commando@ne.jp","Od§");
INSERT INTO ORDER_TABLE(item_id,order_count,order_customer,order_post,order_phone,order_mail,order_destination) 
values (5,8,"xlbg","1234567","00012345678","commando@ne.jp","ä§");
INSERT INTO ORDER_TABLE(item_id,order_count,order_customer,order_post,order_phone,order_mail,order_destination) 
values (6,30,"nX","1234567","00012345678","commando@ne.jp","xR§");
INSERT INTO ORDER_TABLE(item_id,order_count,order_customer,order_post,order_phone,order_mail,order_destination) 
values (7,12,"[\","1234567","00012345678","commando@ne.jp","V§");
INSERT INTO ORDER_TABLE(item_id,order_count,order_customer,order_post,order_phone,order_mail,order_destination) 
values (8,25,"tHX^X","1234567","00012345678","commando@ne.jp","Îì§");
INSERT INTO ORDER_TABLE(item_id,order_count,order_customer,order_post,order_phone,order_mail,order_destination) 
values (9,27,"NbN","1234567","00012345678","commando@ne.jp","·ì§");
INSERT INTO ORDER_TABLE(item_id,order_count,order_customer,order_post,order_phone,order_mail,order_destination) 
values (10,10,"VfB","1234567","00012345678","commando@ne.jp","R§"
);