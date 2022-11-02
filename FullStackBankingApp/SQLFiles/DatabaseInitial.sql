create database banking_db;

use banking_db;
create table customer(
	customer_id int auto_increment,
	primary key (customer_id),
	address varchar(1000),
	first_name varchar(100),
	last_name varchar(100),
	dob date
);
create table accounts(
	account_id int auto_increment,
	primary key (account_id),
	account_name varchar(100),
	account_type varchar(100),
	balance decimal(13,2),
    customer_id int,
	foreign key (customer_id) references customer(customer_id)
);

create table transactions(
	transaction_id int auto_increment,
	primary key (transaction_id),
	transaction_type varchar(100),
	amount DECIMAL(13,2),
	date_of_transaction datetime,
    account_id int,
    foreign key (account_id) references accounts(account_id)
);