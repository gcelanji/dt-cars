CREATE DATABASE IF NOT EXISTS dt_cars;

USE dt_cars;

DROP TABLE IF EXISTS cars;

CREATE TABLE cars(
	id INT(8) NOT NULL AUTO_INCREMENT,
	make VARCHAR(64) DEFAULT NULL,
	model VARCHAR(64) DEFAULT NULL,
	release_year INT(16),
	mileage INT(16),
	transmission VARCHAR(64),
	engine_L FLOAT(4),
	category VARCHAR(64),
	fuel VARCHAR(64),
	doors INT(4),
	seats INT (4),
	PRIMARY KEY (id)
);


INSERT INTO cars VALUES 
	(1,'Audi','A2', 2002, 166020, 'Automatic', 1.4, 'Hatchback', 'Petrol', 5, 4),
	(2,'Mercedes-Benz','CLK', 2006, 99998, 'Automatic', 3.5, 'Coupe', 'Petrol', 2, 4),
	(3,'Mercedes-Benz','M Class', 2006, 132500, 'Automatic', 3.0, 'SUV', 'Petrol', 5, 5),
	(4,'Volkswagen','Passat', 2006, 120000, 'Manual', 1.9, 'Estate', 'Diesel', 5, 5),
	(5,'Toyota','Aygo', 2018, 27484,'Manual',1.0,'Hatchback','Petrol', 5, 4);
	
	
DROP TABLE IF EXISTS users;
CREATE TABLE users (
  username varchar(64) NOT NULL,
  password char(68) NOT NULL,
  enabled tinyint(1) NOT NULL,
  PRIMARY KEY (username)
);

INSERT INTO users VALUES 
('gcelanji','{bcrypt}$2b$10$wM7XLOuORU6wEcUhIIbPUO2e2QgJ2GP8AZUWNgeFacyBkAo2DfYh6',1),
('tom','{bcrypt}$2b$10$VY0plh3EQi4/vMDjhr2z4ul/SIbBMozSdr/BVRWHgXvcASApa1nG6',1),
('mary','{bcrypt}$2b$10$TaA.hRRXsoeobrMLgdZC8eoe8TfI7zdWk2qT8YeOmjhNFE8k5qRfW',1);


DROP TABLE IF EXISTS authorities;
CREATE TABLE authorities (
  username varchar(64) NOT NULL,
  authority varchar(64) NOT NULL,
  UNIQUE KEY `authorities_idx_1` (username,authority),
  CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (username) REFERENCES users(username)
);

INSERT INTO authorities VALUES 
('gcelanji','ROLE_ADMIN'),
('gcelanji', 'ROLE_USER'),
('tom','ROLE_USER'),
('mary','ROLE_USER');
