SELECT * FROM studenti;
/*
EXERCISE: Queries on the Studenti table
*/

/*
1 Select the cognome, nome, indirizzo, citta, provincia, regione, email, and data_nascita
from the Studenti table where the citta is equal to 'Torino'
and sort by cognome.
*/
-- SQL instruction below
SELECT 
	 cognome, 	
	 nome,
	 indirizzo,
	 citta,
	 provincia, 
	 regione, 
	 email,
	 data_nascita
FROM studenti
WHERE citta = 'Torino'
ORDER BY cognome;


/*
2 Select the cognome, nome, indirizzo, citta, provincia, email, and data_nascita
from the Studenti table
sort them by data_nascita (from oldest to newest)
and show only the first 5 records.
*/
-- SQL instruction below
SELECT
	 cognome,
	 nome, 
	 indirizzo, 
	 citta, 
	 provincia, 
	 email,
	 data_nascita
FROM studenti
ORDER BY data_nascita ASC
LIMIT 0, 5;   


/*
3 Select the cognome, nome, email, data_nascita, citta, and provincia
from the Studenti table where the regione is 'Piemonte'
and sort by cognome and data_nascita.
*/
-- SQL instruction below
SELECT
	cognome,
    nome,
    email,
    data_nascita,
    citta, 
    provincia
FROM studenti
WHERE regione = 'Piemonte'
ORDER BY cognome, data_nascita;


/*
4 Select the cognome, nome, citta, provincia, regione, and email from the Studenti table
where the provincia is NOT 'TO'
and sort by provincia, citta, and cognome.
*/
-- SQL instruction below
SELECT
	cognome,
    nome, 
    citta, 
    provincia, 
    regione, 
    email
FROM studenti
WHERE provincia <> 'TO'
ORDER BY provincia, citta, cognome;


/*
5 Select the cognome, nome, genere, email, and data_nascita from the Studenti table
where the data_nascita is before '1995-01-01' (excluded)
and sort by data_nascita from oldest to newest.
*/
-- SQL instruction below
SELECT 
	cognome, 
	nome, 
	genere, 
	email,  
    data_nascita
FROM studenti
WHERE data_nascita < '1995-01-01'
ORDER BY data_nascita;

/*
6 Select the cognome, nome, email, citta, and data_nascita from the Studenti table
where the genere is female and the citta is 'Torino'
and sort by citta and cognome.
*/
-- SQL instruction below
SELECT
	 cognome,
	 nome, 
	 email,
	 citta, 
	 data_nascita
FROM studenti
WHERE genere = 'F' AND citta =  'Torino'
ORDER BY citta, cognome;
	

/*
7 Select the cognome, nome, email, citta, provincia, and data_nascita from the Studenti table
where the provincia is either Alessandria or Asti
and sort by provincia and cognome.
*/
-- SQL instruction below
SELECT 
	 cognome,
	 nome, 
	 email, citta, 
	 provincia, 
	 data_nascita
FROM studenti
WHERE provincia = 'AL' OR provincia = 'AT'
ORDER BY provincia, cognome;


/*
8 Select the cognome, nome, email, data_nascita, and citta from the Studenti table
where the citta is Alessandria or Asti or Biella or Cuneo or Novara or Verbania or Vercelli
and sort by: citta, cognome, and nome.
-- use the IN operator
*/
-- SQL instruction below
SELECT 
	cognome, 
	nome, 
	email, 
	data_nascita,
	citta 
FROM studenti
WHERE citta IN ('Alessandria', 'Asti', 'Biella', 'Cuneo', 'Novara',  'Verbania',  'Vercelli')
ORDER BY citta, cognome, nome;


/*
9 Select the cognome, nome, email, and data_nascita from the Studenti table
where the data_nascita is between 1990-01-01 and 1999-12-31 and the genere is 'femmina'
and sort by: data_nascita from newest to oldest, cognome, and nome.
*/
-- SQL instruction below
SELECT 
      cognome, 
      nome,
      email,
      data_nascita
FROM studenti
WHERE data_nascita BETWEEN '1990-01-01' AND '1999-12-31'
AND genere = 'F'
ORDER BY data_nascita DESC, cognome, nome;


/*
10 Select the cognome, nome, email, and data_nascita from the Studenti table
where the data_nascita is NOT between 1980-01-01 and 1989-12-31 and the genere is 'maschio'
and sort by: data_nascita from newest to oldest, cognome, and nome.
*/
-- SQL instruction below
SELECT 
	cognome, 
	nome, email, 
	data_nascita
FROM studenti
WHERE data_nascita NOT BETWEEN '1980-01-01' AND  '1989-12-31'
AND genere ='M'
ORDER BY data_nascita DESC, cognome, nome;


/*
11 Select the cognome, nome, email, and data_nascita from the Studenti table
where the cognome starts with 'M'
and sort by: cognome and nome.
-- use LIKE
*/
-- SQL instruction below
SELECT 
	cognome, 
	nome, email,
	data_nascita
FROM studenti
WHERE cognome LIKE 'M%'
ORDER BY cognome, nome;

/*
12 Select the cognome, nome, email, and data_nascita from the Studenti table
where the cognome STARTS with 'Ve' or 'Ro'
and sort by: cognome and nome.
-- use REGEXP
*/
-- SQL instruction below
SELECT 
	cognome, 
	nome, 
	email, 
	data_nascita
FROM studenti
WHERE cognome REGEXP '^(Ve|Ro)'
ORDER BY cognome, nome;

