/*
Ricordatevi che le modifiche alle tabelle si applicano con l'istruzione ALTER TABLE nome_tabella più le istruzioni:
-- MODIFY per modificare il tipo
-- ADD per aggiungere un campo
-- AFTER nome_campo per inserire in una specifica posizione i campi aggiunti
*/


/* 6:
Modifica la tabella "products" aggiungendo un nuovo campo chiamato "description" di tipo testo.
Inserite il nuovo campo dopo il campo "name"
*/
-- istrizione SQL di seguito
ALTER TABLE `products`
ADD COLUMN `description` VARCHAR(150)
AFTER `name`;
SELECT * FROM `products`;

/* 7:
Modifica la tabella "orders" aggiungendo un nuovo campo chiamato "shipping_address" stringa di lunghezza massima 100 caratteri.
Inserite il nuovo campo dopo il campo "shipping"
*/
-- istrizione SQL di seguito
ALTER TABLE `orders`
ADD `shipping_address` VARCHAR(100)
AFTER `shipping`;
SELECT * FROM `orders`;

/* 8:
Modifica la tabella "clienti":
modifica la lunghezza massima del campo "last_name" da 30 caratteri a 50, 
aggiungi un nuovo campo chiamato "phone" di tipo stringa di lunghezza massima 20 caratteri dopo il campo "last_name",
aggiungi il campo "postal_code" (stringa di 5 caratteri) dopo il campo "region".
Se riesci scrivi un unica query.
*/
-- istrizione SQL di seguito
ALTER TABLE `clients`
MODIFY COLUMN `last name` VARCHAR(50), 
ADD `phone` VARCHAR(20) AFTER `last name`,
ADD `postalcode` CHAR(5) AFTER region;
SELECT * FROM `customers`;

/* 9:
Modifica la tabella "Books":
modifica la lunghezza massima del campo "title" da 50 caratteri a 100, 
aggiungi il campo price_VAT (decimale(6,2)), obbligatorio dopo il campo "price".
Se riesci scrivi un unica query.
*/
-- istrizione SQL di seguito
ALTER TABLE `books`
MODIFY `title` VARCHAR(100),
ADD `priceVAT` DECIMAL(6,2) NOT NULL AFTER price;
SELECT * FROM `books`;
/* 10:
Rinomina la tabella "clienti": il nuovo nome è "customers".
*/
-- istrizione SQL di seguito
RENAME TABLE `clients` TO `customers`;