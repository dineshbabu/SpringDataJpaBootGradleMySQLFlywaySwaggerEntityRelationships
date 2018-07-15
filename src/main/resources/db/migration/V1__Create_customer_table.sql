CREATE TABLE customer(
  customer_id int(11) NOT NULL AUTO_INCREMENT,
  firstname varchar(255) DEFAULT NULL,
  lastname varchar(255) DEFAULT NULL,
  createdby varchar(255) DEFAULT NULL,
  createddate date DEFAULT NULL,
  updateddate date DEFAULT NULL,
  updatedby varchar(255) DEFAULT NULL,
  PRIMARY KEY (customer_id)
);