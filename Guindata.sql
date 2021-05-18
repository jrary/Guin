SELECT * FROM guindata.user;
CREATE TABLE `guindata`.`user` (
  `id` INT NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `phone` INT(11) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `occupation` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));