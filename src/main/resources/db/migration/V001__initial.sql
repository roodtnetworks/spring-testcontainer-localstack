create table USERS (ID serial primary key, USER_ID uuid, NAME varchar(50) not null, unique(USER_ID));