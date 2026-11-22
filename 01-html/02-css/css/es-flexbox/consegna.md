# Esercitazione Flexbox: Micio Caffè

Dovete costruire il layout della homepage di Micio Caffè, un cat café inventato. HTML e grafica sono già pronti: voi vi occupate solo di come si dispongono gli elementi, usando Flexbox.

La pagina dovrà assomigliare alle immagini di riferimento in `img/`:

- `img/riferimento-desktop.png` (1280px)
- `img/riferimento-tablet.png` (820px)
- `img/riferimento-mobile.png` (390px)

## File

| File | Cosa contiene | Si modifica? |
| --- | --- | --- |
| `index.html` | Tutto il contenuto, con le classi già assegnate | No |
| `css/base.css` | Colori, font, bordi, ombre, padding, dimensioni | No |
| `css/layout.css` | Il vostro layout | **Sì** |

## Regole

- Tutto il layout si fa con Flexbox.
- Per lo spazio tra gli elementi usate `gap`, non i margin.
- Non modificate l'HTML e `base.css`: se vi sembra di doverlo fare, probabilmente esiste una proprietà flex che risolve il problema.

## Le missioni

Le missioni 1-5 sono obbligatorie. La 6, la 7 e la 8 se avete tempo. Ogni missione ha un aiutino: apritelo solo dopo averci provato.

### 1. Header

- Logo a sinistra, menu in mezzo, bottone "Prenota un tavolo" a destra, tutti centrati in verticale.
- Le voci del menu stanno in riga, distanziate tra loro.
- Sotto i 760px l'header va in colonna, centrato, e le voci del menu vanno a capo se non ci stanno.

<details>
<summary>Aiutino</summary>

`justify-content: space-between` sul contenitore, `align-items: center` per l'asse verticale.

</details>

### 2. Hero

- Il contenuto dell'hero è centrato sia in orizzontale sia in verticale. Il blocco è già alto `70vh`.
- I due bottoni stanno affiancati, distanziati e centrati. Se la finestra è stretta, vanno a capo.

<details>
<summary>Aiutino</summary>

Mettete il contenitore in colonna: ora il main axis è verticale. Quale proprietà lavora sul main axis e quale sul cross axis?

</details>

### 3. Vantaggi

- I tre box stanno in riga e occupano tutta la larghezza disponibile.
- Restringendo la finestra vanno a capo da soli, **senza media query**.
- In ogni box l'icona è a sinistra e il testo a destra.
- Il cerchio dell'icona resta un cerchio anche quando il testo è lungo, e l'icona è centrata al suo interno.

<details>
<summary>Aiutino</summary>

`flex-wrap` sul contenitore e `flex: 1 1 ...` (con una base in px) sui box. Se il cerchio diventa un ovale, qualcuno lo sta restringendo: chi impedisce a un elemento di restringersi?

</details>

### 4. Filtri del menù

- I filtri stanno in riga, distanziati, e vanno a capo quando non c'è spazio.

### 5. Card del menù

- 3 card per riga su desktop, 2 su tablet, 1 su mobile, **senza media query**.
- Nome del piatto a sinistra e prezzo a destra, allineati sulla stessa linea del testo.
- Il badge ("Novità", "Tipico torinese") è largo quanto il suo testo, non quanto la card.
- I bottoni "Aggiungi all'ordine" sono tutti allineati in fondo alle card, anche se i testi hanno lunghezze diverse.

<details>
<summary>Aiutino</summary>

La card stessa può essere un contenitore flex in colonna. In una colonna gli item si allungano in larghezza: per il badge serve una proprietà che agisce su un solo elemento.

</details>

### 6. Chi siamo

- Su desktop: testo a sinistra e foto a destra, stessa larghezza, centrati in verticale. Attenzione: nell'HTML la foto viene **prima** del testo.
- Sotto gli 800px: tutto in colonna, con la foto sopra.
- I tre numeri stanno in riga e sono distribuiti uniformemente. Il numero sta sopra la sua etichetta.

<details>
<summary>Aiutino</summary>

Per cambiare l'ordine visivo senza toccare l'HTML c'è `order`. Per i numeri, ogni `.stat` può diventare a sua volta un contenitore flex.

</details>

### 7. Newsletter

- Testo a sinistra e form a destra. Se non c'è spazio, il form va sotto il testo.
- Il campo email si allarga per occupare tutto lo spazio libero, il bottone "Iscriviti" resta della sua misura e non si schiaccia mai.

### 8. Footer

- Le tre colonne stanno affiancate e vanno a capo quando non c'è spazio.
- Nella barra in fondo: copyright a sinistra, social a destra, in riga.

## Domanda bonus

Finita la pagina, duplicate una card nell'HTML (solo per questa prova, poi rimettetelo com'era): ora sono 7. Cosa succede all'ultima card su desktop? Perché? Ripensate a cosa fa `flex-grow`.

## Come verificare il lavoro

1. Confrontate la pagina con le immagini di riferimento.
2. Restringete lentamente la finestra da 1400px a 360px: non deve mai comparire la barra di scorrimento orizzontale.
3. Aprite i DevTools del browser: accanto agli elementi con `display: flex` compare l'etichetta **flex**. Cliccandola, il browser vi mostra il contenitore, gli item e gli spazi.
