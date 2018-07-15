CREATE TABLE address(
  address_id int(11) NOT NULL AUTO_INCREMENT,
  address1 varchar(255) DEFAULT NULL,
  address2 varchar(255) DEFAULT NULL,
  postcode varchar(255) DEFAULT NULL,
  createdby varchar(255) DEFAULT NULL,
  createddate date DEFAULT NULL,
  updateddate date DEFAULT NULL,
  updatedby varchar(255) DEFAULT NULL,
  PRIMARY KEY (address_id)
);