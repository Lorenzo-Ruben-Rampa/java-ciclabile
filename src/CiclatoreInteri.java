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
}
