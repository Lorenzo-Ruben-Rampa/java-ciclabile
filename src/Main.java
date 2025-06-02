public class Main {
    public static void main(String[] args) {
       CiclatoreInteri ciclatoreBase = new CiclatoreInteri(new int[]{15, 5, 10, 18, 1});
    
        while (ciclatoreBase.hasAncoraElementi()) {
            System.out.println(ciclatoreBase.getElementoSuccessivo());
        }

        //Bonus
        CiclatoreInteri ciclatoreBonus = new CiclatoreInteri();
        ciclatoreBonus.addElemento(12);
        ciclatoreBonus.addElemento(17);

        while(ciclatoreBonus.hasAncoraElementi()) {
            System.out.println("--------------");
            System.out.println("Aggiunto nuovo elemento: ");
            System.out.println(ciclatoreBonus.getElementoSuccessivo());
        }
    }
}
