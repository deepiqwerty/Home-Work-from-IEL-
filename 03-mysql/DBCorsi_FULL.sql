CREATE TABLE IF NOT EXISTS docenti (
  id int AUTO_INCREMENT,
  nome varchar(50) NOT NULL,
  cognome varchar(50) NOT NULL,
  email varchar(100) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY email (email)
);

CREATE TABLE IF NOT EXISTS studenti (
  id int AUTO_INCREMENT,
  nome varchar(50) NOT NULL,
  cognome varchar(50) NOT NULL,
  genere enum('m','f', 'nb'),
  indirizzo varchar(100),
  citta varchar(30),
  provincia char(2) DEFAULT 'To',
  regione varchar(30) DEFAULT 'Piemonte',
  email varchar(100) NOT NULL UNIQUE,
  data_nascita date,
  data_reg timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

-- CONSTRAINT – defines a rule in the table // fk_corsi_docenti – the name given to the constraint // 
-- FOREIGN KEY(docente_id) – identifies the foreign key column
-- REFERENCES docenti(id) – identifies the referenced table and column
-- ON DELETE RESTRICT – prevents deletion when related records exist
CREATE TABLE IF NOT EXISTS corsi (
  id int AUTO_INCREMENT,
  titolo varchar(100) NOT NULL,
  prezzo_catalogo decimal(6,2) NOT NULL,
  docente_id int,
  stato TINYINT DEFAULT 1 COMMENT '1 = Attivo, 0 = Non attivo',
  CONSTRAINT fk_corsi_docenti FOREIGN KEY(docente_id) REFERENCES docenti(id) 
  ON DELETE RESTRICT,
  PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS iscrizioni (
  studente_id int,
  corso_id int,
  prezzo_pagato decimal(6,2) NOT NULL,
  data_isc timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (studente_id, corso_id)
 );
 
INSERT INTO Docenti(nome, cognome, email) VALUES
('Paolo','Verdi','paolo.verdi@email.com'),
('Maria','Neri','maria.neri@email.com'),
('Paolo','Rossi','pr@icloud.com'),
('Marco','Bruni','mr@icloud.com'),
('Emilio','Re','aemiluis@gmail.com'),
('Dario','Vecchio','dvecchio@icloud.com'),
('Mauro','Brusa','mbrusa@gmail.com');

INSERT INTO Corsi(titolo, prezzo_catalogo, docente_id, stato) VALUES
('Introduzione alla programmazione',200.00,1,1),
('Basi di dati',150.00,2,1),
('java',250.00,1,1),
('CSS',150.00,5,1),
('HTML',120.00,5,1),
('Wordpress',100.00,6,1),
('PHP',220.00,1,1),
('React',250.00,7,1),
('Angular',250.00,NULL,1),
('Vue.js',250.00,NULL,0),
('PowerBI',250.00,NULL,0),
('Introduzione UI/UX', 180, 5, 1);

INSERT INTO Studenti(nome, cognome, genere, indirizzo, citta, provincia, regione, email, data_nascita, data_reg) VALUES
('Franco','Rossi','M','via Tripoli 10','Torino','TO','Piemonte','franco.rossi@gmail.com','1978-10-01','2026-02-07 09:25:15'),
('Mario','Verdi','M','via Vicenza 17','Asti','AT','Piemonte','mario.verdi@gmail.com','1981-10-01','2026-02-07 09:25:15'),
('Paolo','Bianchi','M','via Volvera 47','Asti','AT','Piemonte','paolo.bianchi@gmail.com','1983-10-01','2026-02-07 09:25:15'),
('Sara','Rossi','F','corso Vigevano 301','Cuneo','CN','Piemonte','sara.rossi@gmail.com','1983-10-01','2026-02-07 09:25:15'),
('Elisa','Verdi','F','corso Francia 18','Alessandria','AL','Piemonte','elisa.verdi@gmail.com','1987-10-01','2026-02-10 09:25:15'),
('Marco','Bianchi','M','via Siccardi 3','Novara','NO','Piemonte','marcob@gmail.com','1993-10-01','2026-02-10 09:25:15'),
('Franca','Verdi','F','via MIlano 33','Torino','TO','Piemonte','fv@icloud.com','1993-10-01','2026-02-10 09:25:15'),
('Mauro','Bruni','M','via Roma 72','Torino','TO','Piemonte','mb@icloud.com','1988-10-01','2026-03-07 09:25:15'),
('Osvaldo','Rossi','M','via Firenze 5','Torino','TO','Piemonte','or@icloud.com','1987-01-02','2026-03-07 09:25:15'),
('Oscar','Verdi','M','lungo Dora Siena 34','Torino','TO','Piemonte','ov@icloud.com','1990-02-03','2026-03-07 09:25:15'),
('Paola','Bianchi','F','Corso Regina 300','Torino','TO','Piemonte','paolab@icloud.com','1985-03-04','2026-03-07 09:25:15'),
('Franca','Verdi','F','Corso Mortara 231','Torino','TO','Piemonte','francaverdi@icloud.com','1989-11-05','2026-03-07 09:25:15'),
('Eleonora','Verdi','F','via Bardonecchia 121','Torino','TO','Piemonte','ele@icloud.com','1989-12-06','2026-03-11 09:25:15'),
('Enrico','Macello','M','via Grosseto 125','Asti','AT','Piemonte','emacello@gmail.com','1983-10-01','2026-03-11 09:25:15'),
('Fabio','Baggio','M','via Dogliani 7','Cuneo','CN','Piemonte','fbaggio@gmail.com','1983-10-01','2026-03-11 09:25:15'),
('Francesco','Gamba','M','via Torino 1','Alessandria','AL','Piemonte','gamba@gmail.com','1987-10-01','2026-03-11 09:25:15'),
('Marco','Demarchi','M','via Napoli 10','Novara','NO','Piemonte','marcodem@gmail.com','1993-10-01','2026-03-11 09:25:15'),
('Franca','Verdone','F','via Parma 9','Torino','TO','Piemonte','fverdone@gmail.com','1994-09-01','2026-03-12 09:25:15'),
('Marco','Zippo','M','via Palermo 19','Torino','TO','Piemonte','zippo@gmail.com','1995-11-01','2026-04-07 09:25:15'),
('Giorgio','Galvani','M','via Reggio 9','Cuneo','cn','Piemonte','ggalv@icloud.com','1996-02-01','2026-04-07 09:25:15'),
('Alex','Porro','M','via Verona 13','Asti','at','Piemonte','porroale@gmail.com','1989-10-01','2026-04-07 09:25:15'),
('Andrea','Giorgio','F','via Bava 9','Torino','TO','Piemonte','giorgia@icloud.com','1998-02-01','2026-04-07 09:25:15'),
('Paola','Valeri','F','via Balbo 65','Novara','NO','Piemonte','valerip@gamil.com','1992-10-09','2026-04-07 09:25:15'),
('Federico','Rossi','M','via Venezia 3','Alessandria','al','Piemonte','federoss@icloud.com','1994-08-08','2026-04-09 09:25:15'),
('Irene','Storti','F','corso vittorio 30','Torino','TO','Piemonte','stortii@gmail.com','1999-09-09','2026-04-09 09:25:15'),
('Samuele','Borsa','M','via Pio 9','Torino','TO','Piemonte','borsamu@gmail.com','1992-02-02','2026-04-09 09:25:15'),
('Luigi','Verdi','M','Via Garibaldi 2','Asti','AT','Piemonte','luigi.verdi@example.com','1999-06-03','2026-04-09 09:25:15'),
('Martina','Bianchi','F','Via Dante 3','Cuneo','CN','Piemonte','martina.bianchi@example.com','2001-01-23','2026-04-09 09:25:15'),
('Giulia','Neri','F','Via Mazzini 4','Alessandria','AL','Piemonte','giulia.neri@example.com','1996-07-15','2026-05-07 09:25:15'),
('Giovanni','Russo','M','Via Montegrappa 5','Novara','NO','Piemonte','giovanni.russo@example.com','1997-09-27','2026-05-07 09:25:15'),
('Luisa','Ferrari','F','Via Garibaldi 6','Vercelli','VC','Piemonte','luisa.ferrari@example.com','1998-04-10','2026-05-07 09:25:15'),
('Simone','Rossi','M','Via Roma 7','Torino','TO','Piemonte','simone.rossi@example.com','1992-11-02','2026-05-07 09:25:15'),
('Francesca','Verdi','F','Via Garibaldi 8','Asti','AT','Piemonte','francesca.verdi@example.com','1994-12-18','2026-05-07 09:25:15'),
('Alessandro','Bianchi','M','Via Dante 9','Cuneo','CN','Piemonte','alessandro.bianchi@example.com','1990-05-25','2026-05-10 09:25:15'),
('Sara','Neri','F','Via Mazzini 10','Alessandria','AL','Piemonte','sara.neri@example.com','1993-08-30','2026-05-10 09:25:15'),
('Fabio','Russo','M','Via Montegrappa 11','Novara','NO','Piemonte','fabio.russo@example.com','1989-03-12','2026-05-10 09:25:15'),
('Laura','Ferrari','F','Via Garibaldi 12','Vercelli','VC','Piemonte','laura.ferrari@example.com','1991-12-01','2026-05-10 09:25:15'),
('Antonio','Rossi','M','Via Roma 13','Torino','TO','Piemonte','antonio.rossi@example.com','1998-05-09','2026-05-10 09:25:15'),
('Mario','Rossi','M','Via Roma 1','Torino','TO','Piemonte','mario.rossi@esempio.com','1990-05-15','2026-06-12 09:25:15'),
('Giulia','Verdi','F','Via Garibaldi 2','Asti','AT','Piemonte','giulia.verdi@esempio.com','1995-06-12','2026-06-12 09:25:15'),
('Lorenzo','Bianchi','M','Corso Italia 3','Cuneo','CN','Piemonte','lorenzo.bianchi@esempio.com','1999-07-18','2026-06-12 09:25:15'),
('Alessia','Neri','F','Via Mazzini 4','Alessandria','AL','Piemonte','alessia.neri@esempio.com','1994-08-20','2026-06-12 09:25:15'),
('Paolo','Rizzo','M','Via Garibaldi 5','Novara','NO','Piemonte','paolo.rizzo@esempio.com','1998-09-27','2026-06-12 09:25:15'),
('Laura','Conti','F','Piazza Vittorio Emanuele II 6','Vercelli','VC','Piemonte','laura.conti@esempio.com','1992-10-08','2026-06-12 09:25:15'),
('Federico','Galli','M','Via Monte Napoleone 7','Milano','MI','Lombardia','federico.galli@esempio.com','1997-11-11','2026-06-12 09:25:15'),
('Martina','Ferrari','F','Via Manzoni 8','Monza','MB','Lombardia','martina.ferrari@esempio.com','1993-12-19','2026-06-15 09:25:15'),
('Simone','Marini','M','Via XX Settembre 9','Bergamo','BG','Lombardia','simone.marini@esempio.com','1991-01-24','2026-06-15 09:25:15'),
('Valentina','Riva','F','Corso Garibaldi 10','Pavia','PV','Lombardia','valentina.riva@esempio.com','1996-02-21','2026-06-15 09:25:15'),
('Andrea','Costa','M','Piazza del Popolo 11','Como','CO','Lombardia','andrea.costa@esempio.com','2000-03-30','2026-06-15 09:25:15'),
('Sara','Santoro','F','Via Sempione 12','Torino','TO','Piemonte','sara.santoro@esempio.com','1998-10-05','2026-06-15 09:25:15');

INSERT INTO Iscrizioni(studente_id, corso_id, prezzo_pagato, data_isc) VALUES
(1,1,200.00,'2026-01-19 23:00:00'),
(1,2,150.00,'2026-02-04 23:00:00'),
(2,1,200.00,'2026-03-09 23:00:00'),
(3,1,200.00,'2026-01-19 23:00:00'),
(4,1,200.00,'2026-02-04 23:00:00'),
(5,1,200.00,'2026-03-09 23:00:00'),
(6,1,200.00,'2026-01-19 23:00:00'),
(7,1,200.00,'2026-02-04 23:00:00'),
(8,1,200.00,'2026-03-09 23:00:00'),
(9,2,150.00,'2026-01-19 23:00:00'),
(10,2,150.00,'2026-02-04 23:00:00'),
(11,2,150.00,'2026-03-09 23:00:00'),
(12,2,150.00,'2026-01-19 23:00:00'),
(13,2,150.00,'2026-02-04 23:00:00'),
(14,2,150.00,'2026-03-09 23:00:00'),
(4,2,150.00,'2026-01-19 23:00:00'),
(5,2,150.00,'2026-02-04 23:00:00'),
(6,2,150.00,'2026-03-09 23:00:00'),
(1,3,250.00,'2026-01-19 23:00:00'),
(2,3,250.00,'2026-02-04 23:00:00'),
(3,3,250.00,'2026-03-09 23:00:00'),
(15,3,250.00,'2026-01-19 23:00:00'),
(16,3,250.00,'2026-02-04 23:00:00'),
(17,3,250.00,'2026-03-09 23:00:00'),
(18,3,250.00,'2026-01-19 23:00:00'),
(19,3,250.00,'2026-02-04 23:00:00'),
(20,3,250.00,'2026-03-09 23:00:00'),
(8,3,250.00,'2026-01-19 23:00:00'),
(21,4,150.00,'2026-02-04 23:00:00'),
(22,4,150.00,'2026-03-09 23:00:00'),
(23,4,150.00,'2026-01-19 23:00:00'),
(24,4,150.00,'2026-02-04 23:00:00'),
(25,4,150.00,'2026-03-09 23:00:00'),
(10,5,120.00,'2026-01-19 23:00:00'),
(11,5,120.00,'2026-02-04 23:00:00'),
(13,5,120.00,'2026-03-09 23:00:00'),
(14,5,120.00,'2026-01-19 23:00:00'),
(15,5,120.00,'2026-02-04 23:00:00'),
(26,5,120.00,'2026-03-09 23:00:00');