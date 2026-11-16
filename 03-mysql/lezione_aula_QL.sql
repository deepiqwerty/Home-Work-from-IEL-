-- Lettura dei dati // Reading data
SELECT * FROM studenti;

-- ORDER BY
-- ASC ascendente di default, usate DESC per invertire l'ordine // ASC ascending by default, use DESC to reverse the order
-- Important: If you don't specify ASC or DESC, MySQL uses ASC by default
SELECT
	cognome,
    nome,
    email
FROM Studenti
ORDER BY cognome;

-- Ordinare per più colonne // Sorting by multiple columns
SELECT
	cognome,
    nome,
    email,
    data_nascita
FROM Studenti
ORDER BY cognome, nome DESC, data_nascita;

-- LIMIT
-- 2 parametri: posizione partenza, quantità di record //starting position, number of records
SELECT
	cognome,
    nome,
    email
FROM Studenti
ORDER BY cognome
-- LIMIT 0, 10; -- prima pagina // We can pin pages result 
-- LIMIT 10, 10; -- seconda pagina
-- LIMIT 20, 10; -- terza pagina
-- LIMIT 30, 10; -- quarta pagina
LIMIT 40, 10; -- quinta pagina

-- Filtrare i record //Filtering records
-- WHERE usa degli operatori // WHERE uses operators
-- operatori di confronto: =, != <>, >=, <=   // Comparison operators: =, !=, <>, >=, <=
-- (= Equal to), (!= Not equal to), (<> Not equal to) (>= Greater than or equal to) (<= Less than or equal to)
SELECT
	cognome,
    nome,
    email
FROM Studenti
WHERE genere = 'F'
ORDER BY cognome;

SELECT * 
FROM studenti
WHERE citta <> 'Torino'
ORDER BY provincia, cognome, nome;

SELECT * 
FROM studenti
WHERE data_nascita >= '2000-01-01'
ORDER BY cognome, nome;

SELECT * 
FROM studenti
WHERE data_nascita < '2000-01-01'
ORDER BY data_nascita, cognome, nome;

-- Operatori logici //Logical operators
-- AND, OR, NOT
SELECT *
FROM studenti
WHERE genere = 'F' AND citta = 'Torino'
ORDER BY cognome, nome;

SELECT *
FROM studenti
WHERE genere = 'F' OR citta = 'Torino'
ORDER BY cognome, nome;

SELECT * 
FROM studenti
WHERE NOT citta = 'Torino'
ORDER BY provincia, cognome, nome;

SELECT *
FROM studenti
WHERE data_nascita >= '2000-01-01'
AND data_nascita <= '2000-12-31'
ORDER BY data_nascita;

SELECT *
FROM studenti
WHERE cognome = 'Verdi'
OR (cognome = 'Rossi' AND provincia = 'TO')
ORDER BY cognome;

SELECT *
FROM studenti
WHERE (cognome = 'Rossi' AND provincia = 'TO')
OR (cognome = 'Verdi' AND provincia = 'AT')
ORDER BY cognome;

-- // This example introduces an important SQL rule: operator precedence.
-- // When you combine AND and OR without parentheses, SQL evaluates AND before OR.
SELECT *
FROM studenti
WHERE cognome = 'Rossi' OR cognome = 'Verdi'
AND provincia = 'TO'
ORDER BY cognome;

-- Operatori di confronto avanzato // Advanced comparison operators
-- IN, NOT IN, BETWEEN, NOT BETWEEN, IS NULL, IS NOT NULL
-- LIKE, NOT LIKE

SELECT * 
FROM studenti
WHERE provincia = 'TO'
OR provincia = 'CN'
OR provincia = 'VB'
OR provincia = 'VC'
OR provincia = 'NO'
OR provincia = 'AT'
OR provincia = 'AL'
OR provincia = 'BI'
ORDER BY provincia;

SELECT *
FROM studenti
WHERE provincia IN('TO','CN','VB','VC','NO','AT','AL','BI')
ORDER BY provincia;

SELECT *
FROM studenti
WHERE provincia NOT IN('TO','CN','VB','VC','NO','AT','AL','BI')
-- OR provincia IS NULL
ORDER BY provincia;

SELECT * from studenti;

UPDATE studenti
SET provincia = NULL
WHERE provincia = 'AT';

SELECT *
FROM studenti
WHERE data_nascita BETWEEN '1990-01-01' AND '1999-12-31'
ORDER BY data_nascita;

SELECT *
FROM studenti
WHERE data_nascita NOT BETWEEN '1990-01-01' AND '1999-12-31'
ORDER BY data_nascita;

SELECT * FROM
studenti
WHERE data_nascita <= '1990-01-01' OR data_nascita >= '1999-12-31'
ORDER BY data_nascita;

-- IS NULL, IS NOT NULL
SELECT *
FROM studenti
WHERE provincia IS NULL;

UPDATE studenti
SET provincia = 'AT'
WHERE citta = 'Asti';


SELECT *
FROM studenti
WHERE provincia IS NULL;

-- LIKE, NOT LIKE
-- %, _
SELECT * FROM studenti
WHERE cognome LIKE 'V%'
ORDER BY cognome;

SELECT * FROM studenti
WHERE cognome LIKE '%e'
ORDER BY cognome;

SELECT * FROM studenti
WHERE nome LIKE '%o'
ORDER BY cognome, nome;

SELECT cognome, nome FROM studenti
WHERE nome LIKE '%ar%'
ORDER BY cognome, nome;

SELECT cognome, nome FROM studenti
WHERE nome LIKE '% %'
ORDER BY cognome, nome;

select * from studenti;

SELECT * FROM studenti
WHERE email LIKE '%gmail.com';

SELECT * FROM studenti
WHERE nome LIKE 'm_r%';

SELECT * FROM studenti
WHERE nome LIKE '____o';

SELECT *
FROM studenti
WHERE indirizzo LIKE 'Via %';

-- REGEXP(REGEXP_LIKE,RLIKE) // Regular expressions (alternative ways to perform pattern matching in MySQL).
SELECT *
FROM studenti
WHERE cognome LIKE 'V%' OR cognome LIKE 'R%';
-- // ^Beginning of text, for eg - 	'^A' starts with A
-- $End of text , for eg -'a$' ends with a
-- []Any one character from the group , for eg - '^[ABC]' starts with A, B or C
-- ()	Groups expressions together,for eg - '(AB)' matches AB
-- | for eg - 	'^A\|^B' starts with A or B
SELECT *
FROM studenti
WHERE cognome REGEXP '^V';
SELECT *
FROM studenti
WHERE nome REGEXP 'a$';
SELECT *
FROM studenti
WHERE nome REGEXP 'mar|ara|ola';

SELECT *
FROM studenti
WHERE nome REGEXP '^(mar|ara)|ola$';

SELECT *
FROM studenti
WHERE nome REGEXP '[mcp]a'; -- o 'ma' o 'ca' o 'pa'

SELECT *
FROM studenti
WHERE nome REGEXP '^[mcp]a';
SELECT *
FROM studenti
WHERE nome REGEXP '[mcp]a$';

SELECT *
FROM studenti
WHERE cognome REGEXP '^[abcdefghilm]'
ORDER BY cognome;

SELECT *
FROM studenti
WHERE cognome REGEXP '^[nopqrstuvz]'
ORDER BY cognome;

SELECT *
FROM studenti
WHERE cognome REGEXP '^[a-m]'
ORDER BY cognome;

-- operatori matematici
-- +, -, *, /, %

SELECT 6 * 8;
alter table books drop price_VAT;
SELECT * from books;
insert into books(isbn, title, price,pages,editor_id)
VALUES('9634512784571','Marcovaldo',25.50,142,5);

SELECT title, price, price * 1.10
FROM books;

ALTER TABLE books ADD COLUMN price_VAT DECIMAL(6,2)
AFTER price;

insert into books(isbn, title, price,price_VAT,pages,editor_id)
VALUES('9634512784578','Divina Commedia',50.00,price * 1.10,100,5);

select * from orders;
INSERT INTO orders( `order_date`, `total`, `shipping`, `shipping_address`, `customer_id`)
VALUES
('2025-06-01', 25.38, 'SHIPPED', 'Via Roma 12 Milano', 101),
('2025-06-02', 47.20, 'DELIVERED', ' Corso Italia 45 Torino', 102),
('2025-06-03', 15.90, 'TO SHIP', ' Via Verdi 8 Firenze', 103),
('2025-06-03', 83.70, 'SHIPPED', 'Piazza Garibaldi 20 Napoli', 104),
('2025-06-04', 9.99, 'DELIVERED', 'Via Mazzini 5 Bologna', 101);


SELECT order_date, shipping, total, total * .90
FROM orders;
