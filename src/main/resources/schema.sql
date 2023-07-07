create table CUSTOMER(
                         id int primary key AUTO_INCREMENT,
                         name varchar(255),
                         surname varchar(255),
                         age int,
                         phone_number varchar(11);
)

create table ORDER(
                      id int primary key AUTO_INCREMENT,
                      date date,
                      customer_id int,
                      product_name varchar(255),
                      amount int,
                      foreign key (customer_id) references CASTOMERS(id);
)