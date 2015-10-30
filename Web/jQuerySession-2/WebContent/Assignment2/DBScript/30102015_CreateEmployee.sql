CREATE DATABASE employee;

Use Employee;
CREATE  TABLE `employee`.`EmployeeTable1` (

  `name` VARCHAR(50) NOT NULL ,

  `email` VARCHAR(45) NOT NULL ,

  `dob` VARCHAR(45) NOT NULL ,

  `address` VARCHAR(45) NOT NULL ,

  `salary` VARCHAR(45) NOT NULL ,

  PRIMARY KEY (`email`) ,

  UNIQUE INDEX `email_UNIQUE` (`email` ASC) );
  
insert into Employeetable values('Anjita','a@gmail.com','16Jan','ajmer',20000);
insert into Employeetable values('Chetna','c@gmail.com','8March','jaipur',20200);
insert into Employeetable values('Manish','m@gmail.com','2Jan','Jhunjhunu',25000);
