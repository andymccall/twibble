CREATE TABLE `twibbles` (
  `twibbleId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `text` VARCHAR(280) NOT NULL DEFAULT '',
  `userId` INT UNSIGNED NOT NULL,
   INDEX user_index (userId),
   FOREIGN KEY (userId)
     REFERENCES users(userId)
     ON DELETE CASCADE,
  PRIMARY KEY (`twibbleId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;