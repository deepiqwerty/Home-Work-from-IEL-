/*
Ricordatevi che per creare una tabella si usa l'istruzione CREATE TABLE nome_tabella():
tra le parentesi dovete indicare l'elenco dei campi richiesti più il tipo di dato e eventuali attributi.
Ragionate sul tipo più adatto.
-- ATTENZIONE: Quando in una tabella si usa un campo "id" apposito per identificare in modo univoco un record
-- il valore di quel campo si deve incrementare in automatico
*/

/* 1:
Crea una tabella chiamata "Products" con i seguenti campi:
- code (stringa esatta di 8 caratteri, chiave primaria)
- name (stringa di lunghezza massima 30 caratteri), obbligatorio
- price (decimale(6,2)), obbligatorio
- quantity (intero)
nb: il valore assegnabile al campo quantity non supera il valore intero 100 (valutate quindi l'intero più adatto)
*/
-- istrizione SQL di seguito
CREATE TABLE products(
`code` CHAR (8) PRIMARY KEY,
`name` VARCHAR(30) NOT NULL,
`price` DECIMAL (6, 2) NOT NULL, 
`quantity` TINYINT UNSIGNED CHECK (quantity <=100)
);

/* 2:
Crea una tabella chiamata "orders" con i seguenti campi:
- id (intero, chiave primaria)
- order_date (data), obbligatorio
- total (decimale(10,2)), obbligatorio
- shipping (tre possibili valori: delivered, shipped, to ship), valore di DEFAULT "to ship"
- customer_id (intero)
*/
-- istrizione SQL di seguito
CREATE TABLE orders(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`orderdate` DATE NOT NULL,
`total` DECIMAL (10, 2),
`shipping` ENUM ('DELIVERED', 'SHIPPED', 'TOSHIP') DEFAULT  'toship',
`customer id` INT 
);

/* 3:
Crea una tabella chiamata "Clienti" con i seguenti campi:
- id (intero, chiave primaria)
- first_name (stringa di lunghezza massima 30 caratteri), obbligatorio
- last_name (stringa di lunghezza massima 30 caratteri), obbligatorio
- email (stringa di lunghezza massima 100 caratteri), obbligatorio e unico
- address (stringa di lunghezza massima 100 caratteri)
- city (stringa di lunghezza massima 50 caratteri)
- province (stringa di 2 caratteri)
- region (stringa di lunghezza massima 30 caratteri)
- registration_date (campo di tipo data: usate TIMESTAMP)
*/
-- istrizione SQL di seguito
CREATE TABLE clients(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`first name` VARCHAR(30) NOT NULL,
`last name` VARCHAR(30) NOT NULL,
`email` VARCHAR(100) NOT NULL UNIQUE,
`address` VARCHAR(100) NOT NULL,
`city` VARCHAR(50),
`province` CHAR(2),
`region` VARCHAR (30),
`resgistration date` TIMESTAMP
);

/* 4:
Crea le tabelle "America", "Asia", "Africa" (3 query)
Le tabelle hanno i seguenti attributi:
- id (intero, chiave primaria)
- state (stringa di lunghezza massima 50 caratteri), obbligatorio
- capital_id (intero con il valore massimo 255)
- population (numero intero: considera che lo stato più popoloso al mondo attualmente è l'india con 1.428.627.663 abitanti )
*/
-- istrizione SQL di seguito
CREATE TABLE  AMERICA(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`state` VARCHAR(50) NOT NULL,
`capital_id` TINYINT UNSIGNED,
`population` INT
);
CREATE TABLE  ASIA(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`state` VARCHAR(50) NOT NULL,
`capital_id` TINYINT UNSIGNED,
`population` INT
);
CREATE TABLE  AFRICA(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`state` VARCHAR(50) NOT NULL,
`capital_id` TINYINT UNSIGNED,
`population` INT
);

/* 5
Crea una tabella chiamata "Books" con i seguenti campi:
- ISBN (codice di 13 cifre, chiave primaria)
- title (stringa di lunghezza massima 50 caratteri), obbligatorio
- price (decimale(6,2)), obbligatorio
- pages (intero)
- editor_id (intero)
*/
-- istrizione SQL di seguito
CREATE TABLE books(
`isbn` CHAR(13) PRIMARY KEY,
`title` VARCHAR (50) NOT NULL,
`price` DECIMAL (6,2) NOT NULL,
`pages` INT,
`editor_id` INT
);