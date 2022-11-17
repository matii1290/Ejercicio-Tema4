public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio Numero 1 (If)");
        int numeroif = 0;

        if (numeroif < 0) {
            System.out.println("NumeroIf es Negativo");
        } else if (numeroif == 0) {
            System.out.println("NumeroIf es 0");
        } else {
            System.out.println("NumeroIf es Positivo");
        }


        System.out.println("Ejercicio Numero 2 (While)");

        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile = numeroWhile + 1 ;
            System.out.println(numeroWhile);
        }

        System.out.println("Ejercicio Numero 3 (Do While)");

        int numeroDoWhile = 1;

        do {
            numeroDoWhile = numeroDoWhile +1;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 2);

        System.out.println("Ejercicio Numero 4 (for) ");


        for (int numeroFor = 0; numeroFor <= 3;numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }

        System.out.println("Ejercicio Numero 5 (Switch)");

        var estacion = "Messi";

        switch (estacion) {
            case "Primavera":
                System.out.println("La estación es Primavera");
                break;
            case "Invierno":
                System.out.println("La estación es Invierno");
                break;
            case "Verano":
                System.out.println("La estación es Verano");
                break;
            case "Otoño":
                System.out.println("La estación es Otoño");
                break;
            default:
                System.out.println("No Pertenece a una estación del año.");
                break;


        }

    }
}
