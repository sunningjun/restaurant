drop TABLE IF EXISTS PRODUCT;
CREATE TABLE  PRODUCT(
  ID_ INT PRIMARY KEY ,
  NAME_  VARCHAR(100) ,
  PRICE_ VARCHAR(100),
  IMAGE_ VARCHAR(100),
  CATEGORY_ VARCHAR(100),
  DESCRIPTION_ VARCHAR(100)
);
commit;

INSERT INTO PRODUCT VALUES (1,"牛肉汉堡","￥40","../../images/ham1.jpg","meat","牛肉汉堡");
INSERT INTO PRODUCT VALUES (2,"鸡肉汉堡","￥25","../../images/him2.jpg","meat","1");
INSERT INTO PRODUCT VALUES (3,"培根汉堡","￥45","../../images/him3.jpg","meat","2");
INSERT INTO PRODUCT VALUES (4,"烤串","￥90","../../images/meat1.jpg","meat","3");
INSERT INTO PRODUCT VALUES (5,"牛排","￥108","../../images/meat3.jpg","meat","4");

INSERT INTO PRODUCT VALUES (6,"龙虾","￥600","../../images/seafood/1.jpg","seafood","5");
INSERT INTO PRODUCT VALUES (7,"蒜蓉粉丝蒸扇贝","￥188","../../images/seafood/2.jpg","seafood","5");
INSERT INTO PRODUCT VALUES (8,"海鲜汤锅","￥1500","../../images/seafood/3.jpg","seafood","6");
INSERT INTO PRODUCT VALUES (9,"海鲜蒸锅","￥2090","../../images/seafood/4.jpg","seafood","5");

INSERT INTO PRODUCT VALUES (10,"蓝莓奶昔","￥25","../../images/milk/1.jpg","milk","5");
INSERT INTO PRODUCT VALUES (11,"草莓奶昔","￥25","../../images/milk/2.jpg","milk","5");
INSERT INTO PRODUCT VALUES (12,"雪顶咖啡","￥35","../../images/milk/3.jpg","milk","5");
INSERT INTO PRODUCT VALUES (13,"芒果西米露","￥45","../../images/milk/4.jpg","milk","5");

drop TABLE IF EXISTS CATEGORY;

CREATE TABLE  CATEGORY(
  ID_ INT PRIMARY KEY ,
  NAME_  VARCHAR(100),
  UI_NAME_ VARCHAR(100)
);

insert into CATEGORY values(1,'meat','牛肉汉堡');
insert into CATEGORY values(2,'seafood','海鲜');
insert into CATEGORY values(3,'milk','奶昔');
commit;


