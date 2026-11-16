DESC studenti;
-- DML // DATA MANIPULATION LANGUAGE 
-- INSERT INTO // Insert data into a table.
-- inserire i dati con le colonne indicate // Insert data using the specified columns.
INSERT INTO studenti(nome, cognome, genere,indirizzo, citta, provincia, regione, email, data_nascita)
VALUES('Mario','Rossi','M','Via Roma 25','Torino','TO','Piemonte','mr@gmail.com','2000-03-01');

SELECT * FROM studenti;
-- inserire più record // Insert multiple records.
INSERT INTO studenti(nome, cognome, genere,indirizzo, citta, provincia, regione, email, data_nascita)
VALUES
('Sara','Vedi','F','Via Torino 25','Milano','MI','Lombardia','sv@gmail.com','2008-08-25'),
('Franco','Bruni','M','Via Alberto 25','Cuneo','CN','Piemonte','fb@gmail.com','2005-08-25'),
('Manuela','Re','F','Via Catania 25','Bologna','BO','Emilia Romagna','mar@gmail.com','2004-08-25');

INSERT INTO studenti(cognome, nome, genere,indirizzo, citta, provincia, regione, email, data_nascita)
VALUES('Vecchio','Mauro','M','Via Roma 30','Torino','TO','Piemonte','vmr@gmail.com','2001-03-01');

-- INSERT senza indicare le colonne // INSERT without specifying the columns. // DEFAULT says My Sql: use the default value defined for this column // Preferabally it is good to specify columns. 
INSERT INTO studenti
VALUES(default,'Paola','Rossi','F','Via Garibaldi 3', 'Torino', 'TO','Piemonte','paolar@gmail.com','2001-01-01',default, default);


INSERT INTO studenti(cognome,email)
VALUES('Bianchi','bbb@icloud.com');

-- errori
INSERT INTO studenti(nome, cognome, genere,indirizzo, citta, provincia, regione, email, data_nascita)
VALUES('Manuela','Bruni','F','Via Roma 30','Torino','TO','Piemonte','bruni@gmail.com','2000-03-01');

-- 
INSERT INTO studenti(nome, cognome, genere,indirizzo, citta, provincia, regione, email, data_nascita)
VALUES('Enrico','Macello','M','Via Verdi 8','Torino','TO','Piemonte','macello@gmail.com','2001-03-01');


INSERT INTO studenti 
VALUES(default,null,'Rossi',null,null, null, default,default,'oscarr@gmail.com',null,default, default);

-- UPDATE // Modify existing Data
UPDATE studenti
SET nome = 'Francesco'
WHERE id = 7;

SELECT * FROM studenti;

UPDATE studenti
SET genere = 'M', indirizzo = 'Vi Vittoria 5', citta = 'Torino', data_nascita = '1998-01-01'
WHERE id = 7;

UPDATE studenti
SET genere = 'M'
WHERE genere = 'NB';

UPDATE studenti
SET created_at = '2026-11-03 00:00:00';

UPDATE studenti
SET nome = 'Francesco Francesco Francesco Francesco'
WHERE id = 7;

-- DELETE
-- eliminare un record specifico // DELETE a specific record
DELETE
FROM studenti
WHERE id = 11;
SELECT * FROM studenti;

-- eliminare più record // DELETE multiple records
DELETE
FROM studenti
WHERE genere = 'M';
-- 1)operazione è inefficente: il tempo impiegato dipende dal numero dei record // 1) The operation is inefficient: the time required depends on the number of records.

DELETE
FROM studenti;

-- 2)l'auto_increment rimane inalterato // the AUTO_INCREMENT remains unchanged // All three records are deleted, but the AUTO_INCREMENT counter does not automatically reset to 1.
-- Now you insert Mario:
-- If the next AUTO_INCREMENT value was 4, Mario will receive ID 4, not ID 1.
INSERT INTO studenti(nome, cognome, genere,indirizzo, citta, provincia, regione, email, data_nascita)
VALUES('Mario','Rossi','M','Via Roma 25','Torino','TO','Piemonte','mr@gmail.com','2000-03-01');
SELECT * FROM studenti;

-- Se l'intenzione è SVUOTARE la tabella // If the intention is to EMPTY the table
-- si usa un'istruzione DDL // a DDL statement is used
-- TRUNCATE // Result: the table becomes empty, but its structure remains. // If you insert a new student afterwards, the AUTO_INCREMENT value normally starts again at 1.
TRUNCATE studenti;

-- duplicare tabelle e i suoi contenuti // Duplicate tables and their contents
-- operazione DDL
CREATE TABLE studenti_bk2 LIKE studenti;
-- operazione DML
INSERT INTO studenti_bk
SELECT * FROM studenti;

INSERT INTO studenti_bk2(cognome, email)
SELECT cognome, email FROM studenti;

SELECT * FROM studenti_bk2;