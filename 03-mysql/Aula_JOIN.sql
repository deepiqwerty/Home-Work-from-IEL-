-- Your professor wants to display the book prices with a 10% increase 
-- Calculating fields "on the fly" //  It means calculating something when you execute a query, without permanently adding or changing anything in your database.
desc books;
ALTER TABLE books DROP COLUMN priceVAT;
SELECT price, price * 1.10
FROM books;

-- Colonne generate // Generated Columns
-- VIRTUALE, il valore viene calcolato al volo ogni volta // VIRTUAL: the value is calculated on the fly every time
-- GENERATED ALWAYS tells MySQL to generate the value automatically
-- AS introduces the calculation
-- VIRTUAL means the calculated value is not physically stored in the table
ALTER TABLE books
ADD price_VAT decimal(6,2) GENERATED ALWAYS AS (price * 1.10) VIRTUAL
AFTER price;

SELECT title, price, price_VAT
FROM books
ORDER BY title;

INSERT INTO books(ISBN, title, price, pages, editor_id)
VALUES('1245678984511','Il barone rampante', 18.00,124,3);


-- STORED, il valore viene memorizzato nella tabella // STORED: the value is stored in the table
ALTER TABLE books drop price_VAT;
ALTER TABLE books
ADD price_VAT decimal(6,2) GENERATED ALWAYS AS (price * 1.10) STORED
AFTER price;

desc books;

SELECT title, price, price_VAT
FROM books
ORDER BY title;

show create table books;

USE corsi;
show tables;

-- INTERROGANO più tabelle // Querying multiple tables.
-- LEGACY // Old or existing version - JOIN 
-- catalogo corsi più docente che insegna il corso // Course catalogue plus the teacher who teaches the course.
SELECT titolo, prezzo_catalogo, docente_id
FROM corsi
ORDER BY titolo;

-- Merging,  Course catalogue plus the teacher who teaches the course.
SELECT titolo, prezzo_catalogo, docenti.nome, docenti.cognome, docenti.email
FROM corsi, docenti
WHERE docenti.id = corsi.docente_id
ORDER BY titolo;

-- Combining Courses with Teacher Information
SELECT corsi.titolo, corsi.prezzo_catalogo,  corsi.docente_id, docenti.id, docenti.nome, docenti.cognome, docenti.email
FROM corsi, docenti
WHERE docenti.id = corsi.docente_id
ORDER BY corsi.titolo;

-- Finding Female Students Enrolled in a Specific Course
SELECT studenti.nome, studenti.cognome, corsi.titolo
FROM studenti, corsi, iscrizioni
WHERE studenti.id = iscrizioni.studente_id
AND corsi.id = iscrizioni.corso_id
AND corsi.titolo = 'Basi di dati'
AND genere = 'F'
ORDER BY corsi.titolo, studenti.cognome, studenti.nome;

-- Combining Four Tables
SELECT studenti.nome, studenti.cognome, corsi.titolo, docenti.email
FROM studenti, corsi, iscrizioni, docenti
WHERE studenti.id = iscrizioni.studente_id
AND corsi.id = iscrizioni.corso_id
AND docenti.id = corsi.docente_id
ORDER BY corsi.titolo, studenti.cognome, studenti.nome;

-- ALIAS
-- alias per le tabelle e per le colonne // Aliases for tables and columns
SELECT
	s.nome AS `Nome studente`,
    s.cognome AS `Cognome studente`,
    c.titolo AS `Titolo corso`,
    d.cognome AS `Cognome docente`,
    d.nome AS `Nome docente`
FROM studenti AS s, corsi AS c, iscrizioni AS i, docenti AS d
WHERE s.id = i.studente_id
AND c.id = i.corso_id
AND d.id = c.docente_id
ORDER BY c.titolo, s.cognome, s.nome;

-- Sintassi INNER JOIN
-- elenco dei corsi e docenti assegnati
SELECT c.titolo, c.prezzo_catalogo, d.nome, d.cognome
FROM docenti d
INNER JOIN corsi c
ON d.id = c.docente_id
ORDER BY titolo;
-- elenco dei corsi e docenti assegnati e docenti senza corsi(esclusi)
SELECT c.titolo, c.prezzo_catalogo, d.nome, d.cognome
FROM docenti d
LEFT JOIN corsi c
ON d.id = c.docente_id
ORDER BY titolo;
-- elenco dei corsi e docenti assegnati e corsi senza docenti(esclusi)
SELECT c.titolo, c.prezzo_catalogo, d.nome, d.cognome
FROM docenti d
RIGHT JOIN corsi c
ON d.id = c.docente_id
ORDER BY titolo;
-- elenco dei corsi e docenti assegnati e corsi senza docenti(esclusi)
-- usando sempre LEFT JOIN (BEST PRACTICE)
SELECT c.titolo, c.prezzo_catalogo, d.nome, d.cognome
FROM corsi c
LEFT JOIN docenti d
ON d.id = c.docente_id
ORDER BY titolo;

-- Elenco degli studenti iscritti e corso a cui sono iscritti
SELECT s.nome, s.cognome, c.titolo
FROM studenti s
INNER JOIN iscrizioni i
ON s.id = i.studente_id
INNER JOIN corsi c
ON c.id = i.corso_id
ORDER BY c.titolo, s.cognome, s.nome;

-- Elenco che include anche gli studenti non iscritti
SELECT s.nome, s.cognome, c.titolo
FROM studenti s
INNER JOIN iscrizioni i
ON s.id = i.studente_id
RIGHT JOIN corsi c
ON c.id = i.corso_id
ORDER BY c.titolo, s.cognome, s.nome;

-- Solo i docenti che non hanno corsi assegnati
SELECT d.nome, d.cognome
FROM docenti d
LEFT JOIN corsi c
ON d.id = c.docente_id
WHERE c.id IS NULL;

-- Solo i corsi che non hanno docenti assegnati
SELECT c.titolo
FROM corsi c
LEFT JOIN docenti d
ON d.id = c.docente_id
WHERE d.id IS NULL;


-- solo gli studenti non iscritti
SELECT s.nome, s.cognome, s.email
FROM studenti s
LEFT JOIN iscrizioni i
ON s.id = i.studente_id
LEFT JOIN corsi c
ON c.id = i.corso_id
WHERE c.id IS NULL
ORDER BY c.titolo, s.cognome, s.nome;

-- solo i corsi senza  iscritti
SELECT c.titolo
FROM corsi c
LEFT JOIN iscrizioni i
ON c.id = i.corso_id
LEFT JOIN studenti s
ON s.id = i.studente_id
WHERE s.id IS NULL
ORDER BY c.titolo;