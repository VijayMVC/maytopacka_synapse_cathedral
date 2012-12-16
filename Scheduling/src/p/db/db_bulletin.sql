drop database if exists db_bulletin;
create database db_bulletin;
use db_bulletin;

drop database if exists pb_bulletin;
create database pb_bulletin;



insert into db_bulletin.accounts(acct_name,acct_password,acct_type)
values
('admin','111','Administrator')
,('cashier','111','Cashier')
,('scheduler','111','Administrator')

;


drop table if exists db_bulletin.churches; 
create table db_bulletin.churches( 
id int auto_increment primary key
,name varchar(500) 
,address varchar(500) 
);

drop table if exists db_bulletin.priests;
create table db_bulletin.priests(
	id int auto_increment primary key
	,priest_number int
	,designation varchar(100)
	,lname varchar(100)
	,fname varchar(100)
	,mi varchar(10)
	,bday varchar(100)
	,status varchar(100)
	,term_started date
	,term_ended date
	,location varchar(100)
	,date_added date
        ,picture varchar(100)
);



insert into db_bulletin.priests(priest_number,lname,fname,mi,location)
values
(1,'lnam1','fname1','mi1','St. Catherine Parish')
,(2,'lnam2','fname2','mi2','Location 2');

drop table if exists db_bulletin.priest_attainments;
create table db_bulletin.priest_attainments(
	id int auto_increment primary key
	,priest_number int
	,attainment varchar(100)
	,date_started date
	,date_ended date
);



drop table if exists db_bulletin.choirs;
create table db_bulletin.choir(
	id int auto_increment primary key
	,choir_number int
	,name varchar(100)
);


insert into db_bulletin.choir(choir_number,name)
values
(1,'choir1')
,(2,'choir2');




drop table if exists db_bulletin.mass_time;
create table db_bulletin.mass_time(
	id int auto_increment primary key
	,time_interval varchar(100)
);

insert into db_bulletin.mass_time(time_interval)
values
('4:30 am - 6:00 am')
,('6:00 am - 7:30 am')
,('7:30 am - 9:00 am')
,('9:00 am - 11:30 am');




drop table if exists db_bulletin.baptism;
create table db_bulletin.baptism(
	id int auto_increment primary key
	,baptismal_number int
	,child_fname varchar(100)
	,child_lname varchar(100)
	,child_mi varchar(100)
	,father varchar(100)
	,mother varchar(100)
	,place_of_birth varchar(100)
	,date_of_birth date
	,date_of_baptism date
	,time_of_baptism varchar(100)
	,baptized_by varchar(100)
	,book_number int
	,page_number int
	,date_added datetime
	,date_modified datetime
	,is_approved varchar(100)
	,is_baptized varchar(100)
	,is_payed varchar(100)
);



drop table if exists db_bulletin.baptism_sponsors;
create table db_bulletin.baptism_sponsors(
	id int auto_increment primary key
	,baptismal_number int
	,sponsors varchar(100)
);





drop table if exists db_bulletin.mass_schedules;
create table db_bulletin.mass_schedules(
	id int auto_increment primary key
	,mass_sched_number int
	,mass_type varchar(100)
	,scheduled_time varchar(100)
	,scheduled_date date
	,priest_number int
	,priest varchar(100)
	,choir varchar(100)
);


insert into db_bulletin.mass_schedules(scheduled_time,scheduled_date,priest,choir)
values
('4:30 am - 6:00 am','2011-12-28','priest1','choir');








drop table if exists db_bulletin.mass_intention_thanks_giving;
create table db_bulletin.mass_intention_thanks_giving(
	id int auto_increment primary key
	,reference_number int
	,details varchar(200)
);




drop table if exists db_bulletin.mass_intention_petition_mass;
create table db_bulletin.mass_intention_petition_mass(
	id int auto_increment primary key
	,reference_number int
	,details varchar(100)
);



drop table if exists db_bulletin.mass_intention_common;
create table db_bulletin.mass_intention_common(
	id int auto_increment primary key
	,reference_number int
	,details varchar(100)
);




drop table if exists db_bulletin.mass_intention_requiem_mass;
create table db_bulletin.mass_intention_requiem_mass(
	id int auto_increment primary key
	,reference_number int
	,name varchar(100)
);

drop table if exists db_bulletin.intention_rates;
create table db_bulletin.intention_rates(
    id int auto_increment primary key
    ,name varchar(100)
    ,rate double
);

insert into db_bulletin.intention_rates(name,rate)values
    ('Thanks Giving',100)
    ,('Common',100)
    ,('Petition Mass',100)
    ,('Requiem Mass',100);




drop table if exists db_bulletin.souls_of;
create table db_bulletin.souls_of(
	id int auto_increment primary key
	,reference_number int
	,name varchar(100)
);




drop table if exists db_bulletin.announcements;
create table db_bulletin.announcements(
	id int auto_increment primary key
	,announcement_number int
	,title varchar(100)
	,date_when date
	,date_time varchar(100)
	,date_from date
	,date_to date
	,message varchar(200)
	,name varchar(100)
	,is_approved varchar(100)
	,picture varchar(100)

);




drop table if exists db_bulletin.bishops;
create table db_bulletin.bishops(
	id int auto_increment primary key
	,bishop_number int
	,designation varchar(100)
	,lname varchar(100)
	,fname varchar(100)
	,mi varchar(100)
	,bday date
	,status varchar(100)
	,term_started varchar(100)
	,term_ended varchar(100)
	,location varchar(100)
	,date_added date
	,picture varchar(100)

);




drop table if exists db_bulletin.bishops_attainments;
create table db_bulletin.bishops_attainments(
	id int auto_increment primary key
	,bishop_number int
	,attainment varchar(100)
	,date_started date
	,date_ended date
);





drop table if exists db_bulletin.confirmation;
create table db_bulletin.confirmation(
	id int auto_increment primary key
	,confirmation_number int
	,confirmand_fname varchar(100)
	,confirmand_lname varchar(100)
	,confirmand_mi varchar(100)
	,father varchar(100)
	,mother varchar(100)
	,date_of_confirmation date
	,place_of_confirmation varchar(100)
	,date_added datetime
	,time varchar(100)
	,date_modified datetime
	,is_approved varchar(100)
	,is_confirmed varchar(100)
	,book_no int
	,page_no int
	,is_payed varchar(100)
    ,confirmed_by varchar(100)
    );




drop table if exists db_bulletin.confirmand_sponsors;
create table db_bulletin.confirmand_sponsors(
	id int auto_increment primary key
	,confirmation_number int
	,sponsor_name varchar(100)
);




drop table if exists db_bulletin.marriage_witnesses;
create table db_bulletin.marriage_witnesses(
	id int auto_increment primary key
	,marriage_number int
	,name varchar(100)
);




drop table if exists db_bulletin.events;
create table db_bulletin.events(
	id int auto_increment primary key
	,event_number int
	,title varchar(100)
	,date_when date
	,date_time varchar(100)
	,date_from date
	,date_to date
	,message varchar(200)
	,name varchar(100)
	,picture varchar(100)
	,is_approved varchar(100)
	,date_added date

);




drop table if exists db_bulletin.gallery;
create table db_bulletin.gallery(
   id int auto_increment primary key
   ,gallery_number int
   ,title varchar(100)
   ,description varchar(200)
   ,date_added date
);





drop table if exists db_bulletin.projects;
create table db_bulletin.projects(
	id int auto_increment primary key
	,project_number varchar(100)
	,project_title varchar(100)
	,project_description varchar(100)
	,date_started date
	,end_date date
	,date_added date	
	,picture varchar(100)
	,status varchar(100)
);





drop table if exists db_bulletin.donors;
create table db_bulletin.donors(
	id int auto_increment primary key
	,donor_number int
	,donor_name varchar(100)
	,project_name varchar(100)
	,picture varchar(100)
	,date_added date
);







drop table if exists db_bulletin.blogs;
create table db_bulletin.blogs(
	 id int auto_increment primary key
	,blog_number int
	,blog_entry varchar(200)
	,feedback varchar(200)
	,date_added date
	,date_replied date

);





drop table if exists db_bulletin.developers;
create table db_bulletin.developers(
	 id int auto_increment primary key
	,dev_number int
	,name varchar(100)
	,bday date
	,address varchar(100)
	,gender varchar(100)
	,contact_number varchar(100)
	,motto varchar(100)
	,date_added date
	,date_modified date

);




drop table if exists db_bulletin.developers_expertise;
create table db_bulletin.developers_expertise(
	id int auto_increment primary key
	,dev_num int
	,expertise varchar(100)

);




drop table if exists db_bulletin.checks;
create table db_bulletin.checks(
	id int auto_increment primary key
	,or_number int 
	,payor varchar(100)
	,amount double
	,date_added date
	,account_number varchar(100)
	,check_number varchar(100)
	,bank varchar(100)
);






drop table if exists db_bulletin.fees;
create table db_bulletin.fees(
	 id int auto_increment primary key
	,description varchar(100)
	,amount double
	,payment_type varchar(100)
	,date_added date
	,date_modified date

);




drop table if exists db_bulletin.logs;
create table db_bulletin.logs(
	id int auto_increment primary key
	,description varchar(100)
	,date_added date
	,account_name varchar(100)
);




drop table if exists db_bulletin.word_of_the_day;
create table db_bulletin.word_of_the_day(
	id int auto_increment primary key
	,word varchar(200)
	,verse varchar(100)
	,date_added date
	,date_modified date
);
insert into db_bulletin.word_of_the_day(word,verse,date_added)values
('The Lord is good to All,and His tender mercies are over all His works','Psalm 145:09','2012-03-16');





drop table if exists db_bulletin.burial_mass;
create table db_bulletin.burial_mass(
	id int auto_increment primary key
	,burial_mass_number int
	,f_name varchar(100)
        ,l_name varchar(100)
        ,mi varchar(100)
	,contact_number varchar(100)
	,address varchar(100)
        ,cause_of_death varchar(100)
	,date_buried date
	,buried_at varchar(100)
	,scheduled_time varchar(100)
	,scheduled_date date
	,priest varchar(100)
	,is_approved varchar(100)
	,is_confirm varchar(100)
	,is_payed varchar(100)
	,series_of varchar(100)
	,date_added datetime
        ,date_modified datetime
	,book_no int
	,page_no int
);






drop table if exists db_bulletin.burial_mass_time;
create table db_bulletin.burial_mass_time(
	id int auto_increment primary key
	,time_interval varchar(100)
);

insert into db_bulletin.burial_mass_time(time_interval)
values
('4:30 am - 6:00 am')
,('6:00 am - 7:30 am')
,('7:30 am - 9:00 am')
,('9:00 am - 11:30 am');







insert into db_bulletin.fees(name,rate,fee_type)
values
('Carpet',500.00,'Baptism')
,('Venue',1000.00,'Baptism');

drop table if exists db_bulletin.designations;
create table db_bulletin.designations(
  id int auto_increment primary key
  ,name varchar(100)

);

insert into db_bulletin.designations(name)
values
('Father')
,('Monseneur');


drop table if exists db_bulletin.organizations;
create table db_bulletin.organizations(
  id int auto_increment primary key
  ,org_number int
  ,name varchar(100)
  ,details varchar(100)
  ,logo varchar(100)
  ,date_added date

);

drop table if exists db_bulletin.pending_matrimony;
create table db_bulletin.pending_matrimony(
	id int auto_increment primary key
	,reference_number varchar(100)
	,parishioner varchar(100)
	,contact_number varchar(100)
	,groom_name varchar(100)
	,bride_name varchar(100)
	,date_of_marriage date
	,priest varchar(100)
	,asst_priest varchar(100)
	,date_added varchar(100)
	,time varchar(100)
);

drop table if exists db_bulletin.pending_baptism;
create table db_bulletin.pending_baptism(
	id int auto_increment primary key
	,reference_number int
	,parishioner varchar(100)
	,contact_number varchar(100)
	,child_name varchar(100)
	,priest varchar(100)
	,date_of_baptism date
	,time varchar(100)
	,date_added date
);
drop table if exists db_bulletin.pending_confirmation;
create table db_bulletin.pending_confirmation(
	id int auto_increment primary key
	,reference_number int
	,parishioner varchar(100)
	,contact_number varchar(100)
	,confirmand_name varchar(100)
	,priest varchar(100)
	,date_of_baptism date
	,time varchar(100)
	,date_added date
);
drop table if exists db_bulletin.pending_funeral;
create table db_bulletin.pending_funeral(
	id int auto_increment primary key
	,reference_number int
	,parishioner varchar(100)
	,contact_number varchar(100)
	,deceased varchar(100)
	,priest varchar(100)
	,date_of_baptism date
	,time varchar(100)
	,date_added date
);
drop table if exists db_bulletin.marriage_requirements;
create table db_bulletin.marriage_requirements(
	id int auto_increment primary key
	,reference_number int
	,name varchar(100)
	,status varchar(100)
);



drop table if exists db_bulletin.parishioners;
create table db_bulletin.parishioners(
	id int auto_increment primary key
	,name varchar(100)
);



insert into db_bulletin.parishioners(name)values('Michael Perea');


drop table if exists db_bulletin.reference_number;
create table db_bulletin.reference_number(
	id int auto_increment primary key  auto_increment
	,name varchar(100)
	,ranged int
);

insert into db_bulletin.reference_number(name,ranged)
values
('matrimony',0)
,('confirmation',0)
,('baptism',0)
,('funeral',0)
;




drop table if exists db_bulletin.receipts;
create table db_bulletin.receipts(
	id int auto_increment primary key
	,or_number varchar(100)
        ,reference_number varchar(100)
	,amount_paid double
	,payor varchar(100)
	,or_type varchar(100)
	,date_added datetime
	,payment_type varchar(100)	
        ,terminal_id varchar(100)
        ,user_id int
        ,user_name varchar(100)     
        ,status int
        ,remarks varchar(100)
);
drop table if exists db_bulletin.f_receipts;
create table db_bulletin.f_receipts(
	id int auto_increment primary key
	,or_number varchar(100)
        ,reference_number varchar(100)
	,amount_paid double
	,payor varchar(100)
	,or_type varchar(100)
	,date_added datetime
	,payment_type varchar(100)	
        ,terminal_id varchar(100)
        ,user_id int
        ,user_name varchar(100)     
        ,status int
        ,remarks varchar(100)
);


drop table if exists db_bulletin.marriage;
create table db_bulletin.marriage(
	id int auto_increment primary key
	,marriage_number int
	,series_of varchar(100)
	,groom_fname varchar(100)
	,groom_lname varchar(100)
	,groom_mname varchar(100)
	,groom_father varchar(100)
	,groom_mother varchar(100)
	,groom_address varchar(100)
	,groom_contact varchar(100)
	
	,bride_fname varchar(100)
	,bride_lname varchar(100)
	,bride_mname varchar(100)
	,bride_father varchar(100)
	,bride_mother varchar(100)
	,bride_address varchar(100)
	,bride_contact varchar(100)
	
	,date_of_marriage datetime
	,time_of_marriage varchar(100)
	,solemnized_by varchar(100)

	,book_number int
	,page_number int
	,date_added datetime
	,date_modified date
        ,is_approved varchar(100)
        ,is_payed varchar(100)
        ,is_married varchar(100)
        ,wedding_type varchar(100)

);

drop table if exists db_bulletin.mass_intention;
create table db_bulletin.mass_intention(
	id int auto_increment primary key
	,reference_number varchar(100)
	,mass_intention_date datetime
	,mass_intention_time varchar(100)
	,parishioner_name varchar(100)
	,contact_number varchar(100)
	,mass_type varchar(100)
	,is_payed varchar(100)
        ,message varchar(300)
        ,priest varchar(200)
        ,date_added datetime
        ,terminal_id int
        ,user_id int
        ,user_name varchar(100)
        ,status int
        ,remarks varchar(100)
        
);

drop table if exists db_bulletin.officials;
create table db_bulletin.officials(
    id int auto_increment primary key
    ,name varchar(200)
    ,designation varchar(100)
    ,date_added datetime
    ,contact varchar(100)
    ,is_manager int
);



drop table if exists db_bulletin.users;
create table db_bulletin.users (
  id int primary key auto_increment
 ,user_code varchar(20)
 ,user_name varchar(100)
 ,password varchar(200)
 ,user_level int
 ,remarks varchar(100)
 ,created timestamp default current_timestamp
 ,modified datetime 
);

