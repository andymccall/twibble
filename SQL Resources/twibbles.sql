CREATE TABLE `twibbles` (
  `twibble_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `text` VARCHAR(280) NOT NULL DEFAULT '',
  `timestamp` DATETIME,
  `user_id` INT UNSIGNED NOT NULL,
   INDEX user_index (user_id),
   FOREIGN KEY (user_id)
     REFERENCES users(user_id)
     ON DELETE CASCADE,
  PRIMARY KEY (`twibble_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;