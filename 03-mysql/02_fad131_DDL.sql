-- tipi di dato
-- stringhe
-- numeri
-- date
-- JSON
-- Creazione di tabelle
CREATE TABLE `students`(
	`id` INT AUTO_INCREMENT primary key,
	`nome` VARCHAR(30) NOT NULL,
    `cognome` VARCHAR(40) NOT NULL,
    `data_nascita` date DEFAULT NULL,
    `eta` tinyint UNSIGNED,
    `genere` ENUM('F', 'M','NB'),
    `email` VARCHAR(50) NOT NULL UNIQUE,
    `indirizzo` VARCHAR(100),
    `citta` VARCHAR(50),
    `provincia` CHAR(2) DEFAULT 'TO',
    `regione` VARCHAR(30) /* */ DEFAULT 'Piemonte',
    `descrizione` TEXT
    -- PRIMARY KEY(`id`)
);

-- commento in linea
/*
commento su più linee
*/
-- mostrare le tabelle
SHOW TABLES;
-- descrivere la struttura delle tabelle create
DESC studenti;

-- istruzioni per modificare la struttura della tabella
-- ALTER TABLE
-- modificare il data type
ALTER TABLE studenti
MODIFY COLUMN nome VARCHAR(40),
MODIFY COLUMN cognome VARCHAR(50);

-- aggiungere un campo, in una specifica posizione
ALTER TABLE studenti
ADD COLUMN genere ENUM('F','M','NB')
AFTER data_nascita;

-- modificare la  posizione di un campo esistente
ALTER TABLE studenti
MODIFY genere ENUM('F','M','NB')
AFTER cognome;

-- modificare il nome di un campo
ALTER TABLE `studenti`
RENAME COLUMN `descrizione` TO `note`;

-- modificare contemporaneamente il nome e il data type
ALTER TABLE `studenti`
CHANGE COLUMN `note` `descrizione` VARCHAR(255);

-- elimonare una colonna
ALTER TABLE `studenti`
DROP `descrizione`;

-- Rinominare la tabella
ALTER TABLE `studenti`
RENAME TO `students`;

DESC students;
SHOW tables;

-- eliminare una tabella
DROP TABLE studenti;

-- Aggiungere la chiave primaria
ALTER TABLE `studenti`
ADD PRIMARY KEY(`nome`,`cognome`);
desc studenti;

-- eleinazione della chiave primaria
ALTER TABLE `studenti`
DROP PRIMARY KEY;

-- aggiungere chiave primaria artificiale se manca, in prima posizione
ALTER TABLE `studenti`
ADD `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY
FIRST;