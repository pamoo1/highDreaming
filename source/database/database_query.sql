CREATE TABLE `music` (
  `title` varchar(256) NOT NULL,
  `filepath` varchar(256) NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `maker` varchar(45) NOT NULL,
  `category` varchar(100) NOT NULL,
  `filesize` int NOT NULL,
  `thumbnail` varchar(256) DEFAULT NULL,
  `ranking` varchar(256) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=183 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `highdreaming1`.`music`
(`title`,
`filepath`,
`id`,
`maker`,
`category`,
`filesize`,
`thumbnail`,
`ranking`)
VALUES
('DNA',
'/mp3/kpop',
116,
'BTS',
'KPOP',
1024,
'/thumbnail',
'11');

INSERT INTO `highdreaming1`.`music`
(`title`,
`filepath`,
`id`,
`maker`,
`category`,
`filesize`,
`thumbnail`,
`ranking`)
VALUES
('Dpd',
'/mp3/kpop',
149,
'eq',
'KPOP',
1024,
'/thumbnail',
'80');

INSERT INTO `highdreaming1`.`music`
(`title`,
`filepath`,
`id`,
`maker`,
`category`,
`filesize`,
`thumbnail`,
`ranking`)
VALUES
('