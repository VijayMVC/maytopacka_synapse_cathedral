

drop table if exists db_bulletin.parishioners_1;
create table db_bulletin.parishioners_1(
	 id int auto_increment primary key
        ,ref_id int
	,fname varchar(100)
        ,mi varchar(100)
        ,lname varchar(100)
        ,date_of_baptism date
        ,date_of_birth date
        ,place_of_birth varchar(200)
        ,address1 varchar(200)
        ,address2 varchar(200)
        ,city varchar(200)
        ,states varchar(200)
        ,zip_code varchar(100)
        ,father varchar(200)
        ,mother varchar(200)
        ,is_baptized int default 0
        ,is_comm int default 0
        ,is_confirm int default 0
        ,is_married int default 0
        ,is_2nd_married int default 0
        ,is_prof_faith int  default 0
        ,is_acceptance int  default 0
        ,is_death int default 0
        ,date_added datetime
        ,gender tinyint
        ,bapt_place varchar(200)
        ,b_date date
        ,b_book_no int
        ,b_page_no int
        ,b_index_no int

        ,c_date date
        ,c_book_no int
        ,c_page_no int
        ,c_index_no int

        ,m_date date
        ,m_book_no int
        ,m_page_no int
        ,m_index_no int

        ,f_date date
        ,f_book_no int
        ,f_page_no int
        ,f_index_no int
);

alter table parishioners_1 add b_date date after bapt_place;
alter table parishioners_1 add b_book_no int after b_date;
alter table parishioners_1 add b_page_no date after  b_book_no;
alter table parishioners_1 add b_index int after b_page_no;


drop table if exists db_bulletin.baptism2;
create table db_bulletin.baptism2(
     id int auto_increment primary key
    ,ref_no int
    ,fname varchar(100)
    ,mi varchar(100)
    ,lname varchar(100)
    ,date_of_birth date
    ,place_of_birth varchar(200)
    ,father varchar(200)
    ,mother varchar(200)
    ,godfather varchar(200)
    ,p_godfather varchar(200)
    ,godmother varchar(200)
    ,p_godmother varchar(200)
    ,presider varchar(200)
    
    ,bapt_date varchar(100)
    ,bapt_time varchar(100)
    ,bapt_church varchar(100)
    ,priest varchar(100)

    ,book_no int
    ,page_no int

    ,f_comm_date date
    ,f_comm_church varchar(200)
    ,f_conf_date date
    ,f_conf_church varchar(200)

    ,is_diaconate tinyint
    ,diconate_date date
    ,is_religious_prof tinyint
    ,religious_prof_date date

    ,remarks varchar(200)
    ,status int 
    ,years varchar(100)
    ,num int
);

drop table if exists db_bulletin.baptism2_sponsors;
create table db_bulletin.baptism2_sponsors(
    id int auto_increment primary key
    ,ref_no int
    ,sponsor varchar(200)
);


drop table if exists db_bulletin.baptism2_marr_trib;
create table db_bulletin.baptism2_marr_trib(
    id int auto_increment primary key
    ,ref_no int
    ,marriage_no int
    ,date_of_marriage date
    ,date_of_death_spouse date
    ,ord_no varchar(100)
    ,case_no varchar(100)
    ,tribunal_no varchar(100)
);

drop table if exists db_bulletin.communion;
create table db_bulletin.communion(
    id int auto_increment primary key
    ,ref_no int
    ,fname varchar(100)
    ,mi varchar(100)
    ,lname varchar(100)
    ,bday date

    ,place_of_birth varchar(200)
    ,bapt_date date
    ,bapt_place varchar(200)
    ,book_no int
    ,page_no int

    ,comm_date date
    ,comm_time varchar(100)
    ,priest varchar(200)
    ,presider varchar(200)
    ,remarks varchar(200)

    ,status int 
    ,date_added datetime
    ,father varchar(200)
    ,mother varchar(200)
);

drop table if exists db_bulletin.confirmation_1;
create table db_bulletin.confirmation_1(
    id int auto_increment primary key
    ,ref_no int
    ,fname varchar(100)
    ,mi varchar(100)
    ,lname varchar(100)
    ,bday date

    ,place_of_birth varchar(200)
    ,bapt_date date
    ,bapt_place varchar(200)
    ,book_no int
    ,page_no int

    ,conf_date date
    ,conf_time varchar(100)
    ,priest varchar(200)
    ,presider varchar(200)
    ,remarks varchar(200)

    ,status int 
    ,date_added datetime
    ,father varchar(200)
    ,mother varchar(200)
);
drop table if exists db_bulletin.confirmation_1_sponsors;
create table db_bulletin.confirmation_1_sponsors(
    id int auto_increment primary key
    ,ref_no int
    ,sponsor varchar(200)
);


drop table if exists db_bulletin.marriage_1;
create table db_bulletin.marriage_1(
    id int auto_increment primary key
    
    ,g_ref_no int
    ,g_fname varchar(100)
    ,g_mi varchar(100)
    ,g_lname varchar(100)
    ,g_bday date
    ,g_place_of_birth varchar(200)
    ,g_bapt_date date
    ,g_bapt_place varchar(200)
    ,g_disp_cult tinyint
    ,g_disp_canonical tinyint
    ,g_former_marr tinyint
    ,g_father varchar(200)
    ,g_mother varchar(200)

    ,b_ref_no int
    ,b_fname varchar(100)
    ,b_mi varchar(100)
    ,b_lname varchar(100)
    ,b_bday date
    ,b_place_of_birth varchar(200)
    ,b_bapt_date date
    ,b_bapt_place varchar(200)
    ,b_disp_cult tinyint
    ,b_disp_canonical tinyint
    ,b_former_marr tinyint
    ,b_father varchar(200)
    ,b_mother varchar(200)

    ,book_no int
    ,page_no int

    ,marr_date date
    ,marr_time varchar(100)
    ,priest varchar(200)
    ,presider varchar(200)
    ,remarks varchar(200)

    ,status int 
    ,date_added datetime
   
);

drop table if exists db_bulletin.marriage_1_sponsors;
create table db_bulletin.marriage_1_sponsors(
    id int auto_increment primary key
    ,g_ref_no int
    ,b_ref_no int
    ,sponsor varchar(200)
);


drop table if exists db_bulletin.funeral_1;
create table db_bulletin.funeral_1(
    id int auto_increment primary key
    ,ref_no int
    ,fname varchar(100)
    ,mi varchar(100)
    ,lname varchar(100)
    ,bday date
    ,place_of_birth varchar(200)
    ,bapt_date date
    ,bapt_place varchar(200)
    ,father varchar(200)
    ,mother varchar(200)

    ,funeral_date date
    ,funeral_time varchar(100)
    ,priest varchar(200)
    ,wife_husband varchar(100)
    ,w_ref_no int
    ,sac_of_annointing varchar(100)
    
    ,presider varchar(200)
    ,remarks varchar(200)

    ,book_no int
    ,page_no int
    ,status int 
    ,date_added datetime
   
    ,date_died date
    ,place_buried varchar(200)
    ,cause_of_death varchar(200)
   
);


drop table if exists db_bulletin.acceptance;
create table db_bulletin.acceptance(
    id int auto_increment primary key
    ,ref_no int
    ,fname varchar(100)
    ,mi varchar(100)
    ,lname varchar(100)
    ,bday date

    ,place_of_birth varchar(200)
    ,bapt_date date
    ,bapt_place varchar(200)
    ,book_no int
    ,page_no int

    ,acceptance_date date
    ,acceptance_time varchar(100)
    ,priest varchar(200)
    ,presider varchar(200)
    ,remarks varchar(200)

    ,status int 
    ,date_added datetime
    ,father varchar(200)
    ,mother varchar(200)

    ,is_acc tinyint
    ,acc_date date
    ,is_elected tinyint
    ,elected_date date
    ,is_scrunity1 tinyint
    ,scrunity1_date date
    ,is_present tinyint
    ,present_date date
    ,is_scrunity2 tinyint
    ,scrunity2_date date
    ,is_scrunity3 tinyint
    ,scrunity3_date date
    ,is_present_l tinyint
    ,present_l_date date
    ,is_recit tinyint
    ,recit_date date
    ,is_ephepheta tinyint
    ,ephepheta_date date
);

drop table if exists db_bulletin.acceptance_sponsors;
create table db_bulletin.acceptance_sponsors(
    id int auto_increment primary key
    ,ref_no int
    ,sponsor varchar(200)
);

drop table if exists db_bulletin.book_archives;
create table db_bulletin.book_archives(
    id int auto_increment primary key
    ,years varchar(100)
    ,book_no varchar(100)
    ,sac varchar(100)
);
drop table if exists db_bulletin.mass_templates;
create table db_bulletin.mass_templates(
    id int auto_increment primary key
    ,template varchar(100)
    ,types varchar(100)
);

