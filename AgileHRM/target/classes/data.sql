insert into Organization(id,address,email,fax,name,website) values ('org001','Khartoum','agile@agilego.net','312312432','AgileGo','www.agile.go.com');

insert into Department values ('CEO','CEO Office',null,'org001',null);
insert into Department values ('ICT','Information and Communication Technology',null,'org001','CEO');
insert into Department values ('FIN','Finance Department',null,'org001','CEO');


insert into Employee(id,title,department_id,first_name,second_name,third_name,last_name,birth_date,join_date,grade,mobile,address) values   ('A0003','Dev','FIN','Abbas', 'Abbas',  'Abdalla', 'Abdalawahab','1978','2020','15','2423534534','Bahri');
insert into Employee(id,title,department_id,first_name,second_name,third_name,last_name,birth_date,join_date,grade,mobile,address) values    ('A0001','Accountant','FIN','Zaher', 'Abbas',  'Abdalla', 'Abdalawahab','1978','2020','15','2423534534','KHT');
insert into Employee(id,title,department_id,first_name,second_name,third_name,last_name,birth_date,join_date,grade,mobile,address)  values    ('A0002','Dev','ICT','Mohammed', 'Abbas',  'Abdalla', 'Abdalawahab','1978','2020','15','2423534534','Omdorman');


insert into Employee(id,title,department_id,first_name,second_name,third_name,last_name,birth_date,join_date,grade,mobile,address)  values    ('A0004','Chef Excutive Officer','CEO','Mohammed', 'Abdall',  'Ahmed', 'Abdalawahab','1966','2007','20','43434343','Khartoum');

update Organization set ceo_id='A0004';
update Department set manager_id='A0004' where id='CEO';

