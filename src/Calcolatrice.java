import java.util.Scanner; //Importing scanner

public class Calcolatrice {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in); //Initializing scanner

        int v1 = 0, v2 = 0, scelta = 0, risultato = 0, scelta2 = 0;

        boolean continuare = true;

        System.out.println("Benvenuto su CALCOLATRICE");

        while(continuare){

            System.out.print("Inserire il primo numero: ");
            v1 = s.nextInt();

            System.out.print("INserire il secondo numero: ");
            v2 = s.nextInt();

            System.out.println("Scegli opzione: ");

            System.out.println("(1) Somma");
            System.out.println("(2) Sottrazione");
            System.out.println("(3) Divisione");
            System.out.println("(4) Moltiplicazione");
            System.out.println("(5) Pari / Dispari");

            scelta = s.nextInt();

            switch(scelta){

                case 1:
                    risultato = v1 + v2;
                    break;
                case 2:
                    risultato = v1 - v2;
                    break;
                case 3:
                    risultato = v1 / v2;
                    break;
                case 4:
                    risultato = v1 * v2;
                    break;
                case 5:
                    if(v1 % 2 == 0){
                        System.out.println("v1 Pari");
                    } else{
                        System.out.println("v1 Dispari");
                    }

                    if(v2 % 2 == 0){
                        System.out.println("v2 Pari");
                    } else{
                        System.out.println("v2 Dispari");
                    }

                    break;
            }

            if(scelta < 5){
                System.out.println("Risultato: " + risultato);
            }

            System.out.println("Vuoi continuare? (1) SI (2) NO");

            scelta2 = s.nextInt();

            if(scelta2 == 2){
                continuare = false;
            } else {
                continuare = true;
            }
        }
    }
}

