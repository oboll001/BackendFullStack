INSERT INTO `banking_db`.`customer`
(`customer_id`,`address`,`first_name`,`last_name`,`dob`)
VALUES
(1,"5412 Lakewood St","Clark","Kent",'1995-06-05');

INSERT INTO `banking_db`.`accounts`
(`account_id`,`account_name`,`account_type`,`balance`,`customer_id`)
VALUES
(1,"First Checkings","Checkings",342.56,1);

INSERT INTO `banking_db`.`transactions`
(`transaction_id`,`transaction_type`,`amount`,`date_of_transaction`,`account_id`)
VALUES
(1,"Deposit",45.00,'2022-03-02 12:34:40',1);
INSERT INTO `banking_db`.`customer`
(`customer_id`,`address`,`first_name`,`last_name`,`dob`)
VALUES
(2,"70191 5th Street, Apt #67","Peter","Parker",'2000-11-08');

INSERT INTO `banking_db`.`accounts`
(`account_id`,`account_name`,`account_type`,`balance`,`customer_id`)
VALUES
(2,"Payments","Checkings",3.01,2);

INSERT INTO `banking_db`.`transactions`
(`transaction_id`,`transaction_type`,`amount`,`date_of_transaction`,`account_id`)
VALUES
(2,"Deposit",45.00,'2022-03-06 12:21:50',2);
