DESC students;
ALTER TABLE students
MODIFY `nome` VARCHAR(40) NOT NULL,
MODIFY `cognome` VARCHAR(40) NOT NULL;

-- Instruction DML 
-- CRUD (create, read, update, delete)
-- Creazione dei record 
-- INSERT INTO ... VALUES 

INSERT INTO `students`(nome, cognome, data_nascita, genere, eta, email, indirizzo, citta, provincia, regione)
VALUES 
('Deepika', 'Dutta', '1993-07-08','F',33,'dd@gmail.com', 'via Roma 23', 'Torino', 'TO','Piemonte'),
('Maria', 'Rossi', '1995-11-08','F',30,'mr@gmail.com', 'via Garibaldi 32', 'Torino', 'TO','Piemonte');

INSERT INTO `students`(nome, cognome, email )
VALUES 
('Laura', 'Grassi', 'lgrassi@gmail.com');


SELECT * FROM STUDENTS;