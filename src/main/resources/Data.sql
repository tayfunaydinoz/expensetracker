insert into users(id,name,surname,email) values (1,'tayfun','aydinoz','tayfun.aydinoz')
insert into users(id,name,surname,email) values (2,'esra','cengiz','esra.nur.cengiz')

insert into catagory(id,name) values (1,'car')
insert into catagory(id,name) values (2,'clothes')

insert into expense(id,description,expensedate,catagory_id,user_id) values (1,'Alfa romeo','2020-08-11T17:00:00.000Z',1,1)
insert into expense(id,description,expensedate,catagory_id,user_id) values (2,'BMW','2020-08-11T19:00:00.000Z',1,2)