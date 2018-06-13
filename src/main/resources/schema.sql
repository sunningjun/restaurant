use restaurant;
drop table if exists product;
create table  product(
  id_ varchar(100),
  name_  varchar(100) ,
  price_ varchar(100),
  image_ varchar(100),
  category_ varchar(100),
  description_ varchar(100),
  primary key(id_,name_)
);
commit;

insert into product values (1,"牛肉汉堡","40","../../images/ham1.jpg","meat","牛肉汉堡");
insert into product values (2,"鸡肉汉堡","25","../../images/him2.jpg","meat","1");
insert into product values (3,"培根汉堡","45","../../images/him3.jpg","meat","2");
insert into product values (4,"烤串","90","../../images/meat1.jpg","meat","3");
insert into product values (5,"牛排","108","../../images/meat3.jpg","meat","4");

insert into product values (6,"龙虾","600","../../images/seafood/seafood1.jpg","seafood","5");
insert into product values (7,"蒜蓉粉丝蒸扇贝","188","../../images/seafood/seafood2.jpg","seafood","5");
insert into product values (8,"海鲜汤锅","1500","../../images/seafood/seafood3.jpg","seafood","6");
insert into product values (9,"海鲜蒸锅","2090","../../images/seafood/seafood4.jpg","seafood","5");

insert into product values (10,"蓝莓奶昔","25","../../images/milk/milk1.jpg","milk","5");
insert into product values (11,"草莓奶昔","25","../../images/milk/milk2.jpg","milk","5");
insert into product values (12,"雪顶咖啡","35","../../images/milk/milk3.jpg","milk","5");
insert into product values (13,"芒果西米露","45","../../images/milk/milk4.jpg","milk","5");


drop table if exists category;

create table  category(
  id_ int ,
  name_  varchar(100),
  ui_name_ varchar(100),
  primary key(id_,name_)
);

insert into category values(1,'meat','牛肉汉堡');
insert into category values(2,'seafood','海鲜');
insert into category values(3,'milk','奶昔');
commit;

drop table if exists collection;

create table  collection(
  id_ int	 not null	,
  product_id  int not null,
  primary key(id_,product_id)
);
drop table if exists shop;

create table  shop(
  id_ int	 not null	,
  name_ varchar(100),
  note_  varchar(500),
  address_ varchar(100),
  phone_ varchar(100),
  date_ varchar(100),
  time_ varchar(100),
  send_up_limit int,
  take_out_price_ int
);
insert into shop values(1,'堕落小龙虾','我们店超级棒，超级好吃','西安市雁塔区英发新苑','18710342244','周一至周末','9:00-11:00',10,5);







