DROP TABLE IF EXISTS directory;
 
CREATE TABLE directory (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  fullName VARCHAR(50) NOT NULL,
  shortName VARCHAR(10) DEFAULT NULL
);