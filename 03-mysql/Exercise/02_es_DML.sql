/* 1:
Inserisci i seguenti 3 prodotti nella tabella "Products":
ATTENZIONE eventuali errori nel testo sono voluti, dovrete più avanti eseguire degli update! 
1) PRD00001, Pasta integrale, Pasta di grano duro 100% ingrale 500Kg, 1.49, 100,
2) PRD00002, Olio extravergine, Olio extravergine d\oliva 750ml, 6.90, 50,
3) PRD00003, Biscotti al cacao, Biscotti secchi con gocce di cioccolato, 2.75, 80;
*/
-- istrizione SQL di seguito
DESC products;
INSERT INTO	products( code, name, description, price, quantity)
VALUES
('PRD00001', 'Pasta integrale', 'Pasta di grano duro 100% ingrale 500Kg', 1.49, 100 ),
('PRD00002', 'Olio extravergine', 'Olio extravergine d\oliva 750ml',  6.90, 50 ),
('PRD00003', 'Biscotti al cacao', 'Biscotti secchi con gocce di cioccolato', 2.75, 80 );
SELECT * FROM products;


/* 2:
Inserisci i seguenti 5 ordini nella tabella "Orders"
1) 2025-06-01, 25.38, shipped, Via Roma 12 Milano, 101,
2) 2025-06-02, 47.20, delivered, Corso Italia 45 Torino, 102,
3) 2025-06-03, 15.90, to ship, Via Verdi 8 Firenze, 103,
4) 2025-06-03, 83.70, shipped, Piazza Garibaldi 20 Napoli, 104,
5) 2025-06-04, 9.99, delivered, Via Mazzini 5 Bologna, 101;
*/
-- istrizione SQL di seguito
DESC orders;
INSERT INTO orders( `orderdate`, `total`, `shipping`, shipping_address, `customer id`)
VALUES
('2025-06-01', 25.38, 'SHIPPED', 'Via Roma 12 Milano', 101),
('2025-06-02', 47.20, 'DELIVERED', ' Corso Italia 45 Torino', 102),
('2025-06-03', 15.90, 'TOSHIP', ' Via Verdi 8 Firenze', 103),
('2025-06-03', 83.70, 'SHIPPED', 'Piazza Garibaldi 20 Napoli', 104),
('2025-06-04', 9.99, 'DELIVERED', 'Via Mazzini 5 Bologna', 101);
SELECT * FROM orders;


/* 3:
Inserisci i seguenti 5 clienti nella tabella "Customers"
1) Luca, Bianchi, 3201234567, luca.bianchi@email.it, Via Dante 10, Milano, MI, Lombardia, 20121, 2025-05-01,
2) Giulia, Rossi, 3479876543, giulia.rossi@email.it, Corso Venezia 22, Torino, TO, Piemonte, 10121, 2025-05-03,
3) Marco, Verdi, 3391122334, marco.verdi@email.it, Via Mazzini 18, Bologna, BO, Emilia-Romagna, 40121, 2025-05-05,
4) Elena, Neri, 3284455667, elena.neri@email.it, Piazza Duomo 1, Firenze, FI, Toscana, 50122, 2025-05-07,
5) Paolo, Ricci, 3339988776, paolo.ricci@email.it, Via Garibaldi 55, Napoli, NA, Campania, 80134, 2025-05-10;
*/
-- istrizione SQL di seguito
DESC customers;
INSERT INTO customers(`first name`, `last name`, `phone`, `email`, `address`, `city`, `province`, `region`, `postalcode`, `resgistration date` )
VALUES
('Luca', 'Bianchi', '3201234567', 'luca.bianchi@email.it', 'Via Dante 10', 'Milano', 'MI', 'Lombardia', '20121', '2025-05-01'),
('Giulia', 'Rossi', '3479876543', 'giulia.rossi@email.it', 'Corso Venezia 22', 'Torino', 'TO', 'Piemonte', '10121', '2025-05-03'),
('Marco', 'Verdi', '3391122334', 'marco.verdi@email.it', 'Via Mazzini 18', 'Bologna', 'BO', 'Emilia-Romagna', '40121', '2025-05-05'),
('Elena', 'Neri', '3284455667', 'elena.neri@email.it', 'Piazza Duomo 1', 'Firenze', 'FI', 'Toscana', '50122', '2025-05-07'),
('Paolo', 'Ricci', '3339988776', 'paolo.ricci@email.it', 'Via Garibaldi 55', 'Napoli', 'NA', 'Campania', '80134', '2025-05-10');
SELECT * FROM customers;


/* 4:
Inserisci i seguenti record

Tabella: "America":
1) Brasile', 1, 216000000, 
2) Messico', 2, 129000000, 
3) Canada', 3, 39000000;   

Tabella: "Africa":
1) Nigeria', 4, 223000000, 
2) Egitto', 5, 111000000,  
3) Sudafrica', 6, 61000000;

Tabella: "Asia":
1) Cina', 7, 1410000000,   
2) India', 8, 1400000000,  
3) Giappone', 9, 125000000;

*/
-- istrizione SQL di seguito
DESC america;
INSERT INTO america( `state`, `capital_id`, `population`)
VALUES
('Brasile', 1, 216000000), 
('Messico', 2, 129000000), 
('Canada', 3, 39000000);  
SELECT * FROM america;

DESC africa;
INSERT INTO africa ( `state`, `capital_id`, `population`)
VALUES
 ('Nigeria', 4, 223000000), 
 ('Egitto', 5, 111000000),  
 ('Sudafrica', 6, 61000000);
 SELECT * FROM africa;
 
 DESC asia;
INSERT INTO asia( `state`, `capital_id`, `population`)
VALUES
('Cina', 7, 1410000000),   
('India', 8, 1400000000),  
('Giappone', 9, 125000000);
 SELECT * FROM asia;
 
 
/* 5:
Inserisci i seguenti 7 libri nella tabella "Books"
1) 9788801234567, La coscienza di Zeno, 15.00, 18.30, 250, 1,
2) 9788804567890, Il nome della rosa, 20.00, 24.40, 512, 2,
3) 9788867890123, I promessi sposi, 18.50, 22.57, 600, 1,
4) 9788876543210, Se questo è un uomo, 14.00, 17.08, 180, 3;
*/
-- istrizione SQL di seguito
DESC books;
INSERT INTO books(`isbn`,`title`, `price`, `priceVAT`, `pages`, `editor_id`)
VALUES
(9788801234567, 'La coscienza di Zeno', 15.00, 18.30, 250, 1),
(9788804567890, 'Il nome della rosa', 20.00, 24.40, 512, 2),
(9788867890123, 'I promessi sposi', 18.50, 22.57, 600, 1),
(9788876543210, 'Se questo è un uomo', 14.00, 17.08, 180, 3);
SELECT * FROM books;

/* 6:
Aggiorna la tabella "Products"
con la descrizione corretta per il prodotto con code = PRD00001
descrizione corretta: 
Pasta di grano duro 100% integrale, 500g
*/
-- istrizione SQL di seguito
DESC products;
UPDATE products
SET description = 'Pasta di grano duro 100% integrale, 500g'
WHERE code = 'PRD00001';
SELECT * FROM products;


/* 7:
Aggiorna la tabella "Books" e imposta i seguenti valori
editor_id: 2
dove l'editor_id' è = 3
*/
-- istrizione SQL di seguito
DESC books;
UPDATE books
SET `editor_id` = 2
WHERE `editor_id` = 3;
SELECT * FROM books;


/* 8:
Aggiorna la tabella "Customers" e imposta i seguenti valori
city: Milano
province: MI
regione: Lombardia
postal_code: 20121
dove la regione è "Campania"
*/
-- istrizione SQL di seguito
DESC customers;
UPDATE customers
SET city= 'Milano', province= 'MI', region = 'Lombardia', postalcode = '20121'
WHERE region = 'Campania';
SELECT * FROM customers;


/* 9:
Cancella dalla tabella "Books" il record il cui codeice ISBN = 9788801234567
*/
-- istrizione SQL di seguito
DESC books;
DELETE
FROM books
WHERE ISBN = '9788801234567';
SELECT * FROM books;


/* 10:
Cancella dalla tabella customers i record la cui provincia è = 'MI'
*/
-- istrizione SQL di seguito
DESC customers;
DELETE
FROM customers
WHERE province= 'MI';
SELECT * FROM customers;

