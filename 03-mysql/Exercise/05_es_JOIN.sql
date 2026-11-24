-- USARE SINTASSI JOIN
-- corsi, docenti
/* 1
Seleziona cognome, nome, email dei docenti
e titolo corso che insegnano
e ordina per cognome e nome
*/
SELECT d.cognome, d.nome, d.email, c.titolo
FROM docenti d
INNER JOIN corsi c
ON d.id = c.docente_id
ORDER BY d.cognome, d.nome;


/* 2
Seleziona il titolo del corso con prezzo inferiore a 200€ (non incluso)
e cognome, nome, email dei docenti che insegnano in quel corso,
ordina per prezzo in modo discendente
*/
SELECT c.titolo, d.cognome, d.nome, d.email
FROM corsi c
INNER JOIN docenti d
ON c.docente_id = d.id
WHERE c.prezzo_catalogo < 200
ORDER BY c.prezzo_catalogo DESC;


/* 3
Seleziona cognome, nome, email del docente
che insegna nel corso HTML
*/
SELECT d.cognome, d.nome, d.email
FROM docenti d
INNER JOIN corsi c
ON d.id = c.docente_id
WHERE c.titolo = 'HTML';


/* 4
Seleziona cognome, nome, email dei docenti, titolo corso che insegnano
e MOSTRA ANCHE I DOCENTI CHE NON HANNO CORSI ASSEGNATI (outer join)
ordina per titolo, cognome e nome
*/
SELECT d.cognome, d.nome, d.email, c.titolo
FROM docenti d
LEFT JOIN corsi c
ON d.id = c.docente_id
ORDER BY c.titolo, d.cognome, d.nome;


/* 5
Seleziona cognome, nome, email dei docenti, titolo corso che insegnano
e MOSTRA ANCHE I CORSI CHE NON HANNO DOCENTI ASSEGNATI (outer join)
ordina per titolo, cognome e nome
*/
SELECT d.cognome, d.nome, d.email, c.titolo
FROM corsi c
LEFT JOIN docenti d
ON c.docente_id = d.id
ORDER BY c.titolo, d.cognome, d.nome;


/* 6
Seleziona cognome, nome, email
SOLO DEI DOCENTI CHE NON HANNO CORSI ASSEGNATI (outer join)
ordina per cognome e nome
*/
SELECT d.cognome, d.nome, d.email
FROM docenti d
LEFT JOIN corsi c
ON d.id = c.docente_id
WHERE c.id IS NULL
ORDER BY d.cognome, d.nome;


/* 7
Seleziona titolo SOLO DEI CORSI 
CHE NON HANNO DOCENTI ASSEGNATI (outer join)
ordina per titolo
*/
SELECT c.titolo
FROM corsi c
LEFT JOIN docenti d
ON c.docente_id = d.id
WHERE d.id IS NULL
ORDER BY c.titolo;


-- studenti, corsi, iscrizioni
/* 8
Seleziona cognome, nome, email, degli studenti 
e titolo del corso a cui sono iscritti
e ordina per titolo, cognome e nome
*/
SELECT s.cognome, s.nome, s.email, c.titolo
FROM studenti s
INNER JOIN iscrizioni i
ON s.id = i.studente_id
INNER JOIN corsi c
ON i.corso_id = c.id
ORDER BY c.titolo, s.cognome, s.nome;


/* 9
Seleziona cognome, nome, email, degli studenti
iscritti al corso di Java
e ordina per cognome e nome
*/
SELECT s.cognome, s.nome, s.email
FROM studenti s
INNER JOIN iscrizioni i
ON s.id = i.studente_id
INNER JOIN corsi c
ON i.corso_id = c.id
WHERE c.titolo = 'Java'
ORDER BY s.cognome, s.nome;


/* 10a
Seleziona cognome, nome, email, degli studenti 
iscritti a corsi per i quali hanno pagato più di 200€(compresi)
e ordina per cognome e nome
*/
SELECT s.cognome, s.nome, s.email
FROM studenti s
INNER JOIN iscrizioni i
    ON s.id = i.studente_id
WHERE i.prezzo_pagato >= 200
ORDER BY s.cognome, s.nome;


-- 10b Aggiungi il titolo corso
SELECT s.cognome, s.nome, s.email, c.titolo
FROM studenti s
INNER JOIN iscrizioni i
ON s.id = i.studente_id
INNER JOIN corsi c
ON i.corso_id = c.id
WHERE i.prezzo_pagato >= 200
ORDER BY s.cognome, s.nome;


/* 11
Seleziona cognome, nome, email, degli studenti 
e titolo del corso a cui sono iscritti
e MOSTRA ANCHE GLI STUDENTI CHE NON SONO ISCRITTI A CORSI (outer join)
e ordina per titolo, cognome e nome
*/
SELECT s.cognome, s.nome, s.email, c.titolo
FROM studenti s
LEFT JOIN iscrizioni i
ON s.id = i.studente_id
LEFT JOIN corsi c
ON i.corso_id = c.id
ORDER BY c.titolo, s.cognome, s.nome;


/* 12
Seleziona cognome, nome, email, degli studenti 
e titolo del corso a cui sono iscritti
e MOSTRA ANCHE I CORSI CHE NON HANNO ISCRITTI(outer join)
e ordina per titolo, cognome e nome
*/
SELECT s.cognome, s.nome, s.email, c.titolo
FROM corsi c
LEFT JOIN iscrizioni i
ON c.id = i.corso_id
LEFT JOIN studenti s
ON i.studente_id = s.id
ORDER BY c.titolo, s.cognome, s.nome;


/* 13
Seleziona cognome, nome, email
SOLO DEGLI STUDENTI CHE NON SONO ISCRITTI A CORSI (outer join)
e ordina per cognome e nome
*/
SELECT s.cognome, s.nome, s.email
FROM studenti s
LEFT JOIN iscrizioni i
ON s.id = i.studente_id
WHERE i.studente_id IS NULL
ORDER BY s.cognome, s.nome;


/* 14
Seleziona titolo del corso
SOLO PER I CORSI CHE NON HANNO ISCRITTI(outer join)
e ordina per titolo
*/
SELECT c.titolo
FROM corsi c
LEFT JOIN iscrizioni i
ON c.id = i.corso_id
WHERE i.corso_id IS NULL
ORDER BY c.titolo;

