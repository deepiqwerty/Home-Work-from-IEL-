show databases;
-- Istruzioni SQL DCL
-- creo l'utente
CREATE USER app131@localhost IDENTIFIED BY "db131!";
-- creo il database per l'utente
CREATE DATABASE db131;
-- assegno i privilegi per lo specifico db
GRANT ALL ON db131.* TO app131@localhost;