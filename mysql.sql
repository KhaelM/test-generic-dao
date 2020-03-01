DROP TABLE `ActeurDansFilm`;
DROP TABLE FILM;
DROP TABLE REALISATEUR;

CREATE TABLE REALISATEUR(
	id integer auto_increment PRIMARY KEY,
	nom varchar(30)
);

CREATE TABLE FILM (
	id integer auto_increment PRIMARY KEY,
	nom varchar(30),
	id_realisateur integer
);

CREATE TABLE `ActeurDansFilm` (
	id integer auto_increment PRIMARY KEY,
	id_film integer,
	nom varchar(30),
	date_naissance date NOT NULL,
	date_mort date,
	CONSTRAINT acteur_fk FOREIGN KEY(id_film) REFERENCES FILM(id)
);

INSERT INTO REALISATEUR(nom) values('Akira Toriyama');
INSERT INTO REALISATEUR(nom) values('Masashi Kishimoto');
INSERT INTO REALISATEUR(nom) values('Eiichiro Oda');

-- Akira Toriyama's Film
INSERT INTO FILM(nom,id_realisateur) values ('Dr Slump',1);
INSERT INTO FILM(nom,id_realisateur) values ('L\'Apprenti Mangaka',1);
INSERT INTO FILM(nom,id_realisateur) values ('Dragon Ball',1);

-- Masashi Kishimoto's Film
INSERT INTO FILM(nom,id_realisateur) values ('Karakuri',2);
INSERT INTO FILM(nom,id_realisateur) values ('Naruto',2);
INSERT INTO FILM(nom,id_realisateur) values ('Bench',2);
INSERT INTO FILM(nom,id_realisateur) values ('Mario',2);

-- Eichiro Oda's Film
INSERT INTO FILM(nom,id_realisateur) values ('One Piece', 3);
INSERT INTO FILM(nom,id_realisateur) values ('Wanted', 3);
INSERT INTO FILM(nom,id_realisateur) values ('Un présent divin', 3 );
INSERT INTO FILM(nom,id_realisateur) values ('Le démon solitaire', 3 );
INSERT INTO FILM(nom,id_realisateur) values ('Monsters', 3 );
INSERT INTO FILM(nom,id_realisateur) values ('Romance Dawn', 3 );
INSERT INTO FILM(nom,id_realisateur) values ('Cross Epoch', 3 );
INSERT INTO FILM(nom,id_realisateur) values ('Jisshoku! Akuma no Mi!!', 3 );

INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (1,'Evelyne Grandjean','1950-01-01','2018-02-02');
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (1,'Francis Lax','1951-02-02','2018-03-03');
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (1,'Jean-Louis Rugarli','1952-03-03','2017-04-04');
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (1,'Bernard Soufflet','1953-04-04','2018-01-01');
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (1,'Maryse Meryl','1954-05-05','2016-05-02');
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (1,'Ophélie Brissot','1955-06-10','2000-10-10');
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (1,'Serge Bourrier','1956-06-10','2008-01-01');
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (1,'Laurence Crouzet','1957-06-10', null);

INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (3,'Masako Nozawa','1958-01-01','2015-02-02');
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (3,'Stephanie Nadolny','1959-02-02','2017-01-02');
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (3,'Tiffany Vollmer','1960-01-01','2019-01-02');
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (3,'Laurie Steele','1961-01-01','2017-01-01');
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (3,'Christopher Sabat','1962-02-02', null);
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (3,'Sean Schemmel', '1963-01-10', null);

INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (5,'JUNKO TAKEUCHI', '1964-04-04', null); 
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (5,'NORIAKI SUGIYAMA', '1965-05-05', null); 
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (5,'CHIE NAKAMURA', '1966-06-06', '2002-01-05'); 
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (5,'KAZUHIKO INOUE', '1967-07-07', null); 

INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (2,'Jennifer Anniston', '1968-08-08', null); 
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (2,'La Fouine', '1969-09-09', null); 

INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (3,'Paul Walker', '1970-01-01', '2017-01-01'); 
INSERT INTO `ActeurDansFilm`(id_film,nom,date_naissance,date_mort) values (3,'Silver Stalone', '1971-01-01', null); 