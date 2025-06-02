public class CiclatoreInteri {
        private int[] elencoInteri;
        private int indiceAttuale = 0;

    // Costruttore 
        public CiclatoreInteri(int[] elenco) {
            // Inizializza l'elenco e l'indice corrente
            this.elencoInteri = elenco;
            if (this.elencoInteri.length > 0) {
                indiceAttuale = 0;
            }
        }

    //Metodi 
    // Prende l'elemento successivo nell'elenco
        public int getElementoSuccessivo() {
            int elemento = elencoInteri[indiceAttuale];
            this.indiceAttuale++;
            return elemento;
        }

    // Controllo se ci sono ancora elementi nell'elenco
        boolean hasAncoraElementi() {
            if (elencoInteri.length == 0) {
                return false;
            }
            return this.indiceAttuale < this.elencoInteri.length;

        }
    
    // BONUS
    // Costruttore che non prevede parametri
        public CiclatoreInteri () {
            this.elencoInteri = new int[0];
        }

    // Metodo per aggiungere un elemento all'elenco
        public void addElemento (int elementoDaAggiungere) {
            int[] nuovoElenco = new int[elencoInteri.length + 1];
            for (int i = 0; i < elencoInteri.length; i++) {
                nuovoElenco[i] = this.elencoInteri[i];
            }
            nuovoElenco[this.elencoInteri.length] = elementoDaAggiungere;
            this.elencoInteri = nuovoElenco;
        }
}
