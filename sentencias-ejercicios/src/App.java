public class App {
    public static void main(String[] args) throws Exception {
        /* numerolf(-5); */
        /* numeroWhile(1); */
        /* numeroDoWhile(3); */
        /* numeroFor(); */
        /* estaciones("Invierno"); */
    };

    // Ejercicio 1
    static int numerolf(int num) {
        if (num == 0) {
            System.out.println("El número es 0");
            return num;
        } else if (num > 0) {
            System.out.println("El número es positivo");
            return num;
        } else {
            System.out.println("El número es negativo");
            return num;
        }
    };

    // Ejercicio 2
    static int numeroWhile(int num) {
        while (num < 3) {
            System.out.println(num);
            num++;
        }
        return num;
    }

    // Ejercicio 3
    static int numeroDoWhile(int num) {

        do {
            num++;
            System.out.println(num);
        } while (num < 3);

        return num;
    }

    // Ejercicio 4
    static void numeroFor() {
        for (int num = 0; num <= 3; num++) {
            System.out.println(num);
        }
    }

    // Ejercicio 5
    static void estaciones(String estacion) {
        switch (estacion) {
            case "Otoño":
                System.out.println("La estación es otoño");
                break;
            case "Invierno":
                System.out.println("La estación es invierno");
                break;
            case "Primavera":
                System.out.println("La estación es Primavera");
                break;
            case "Verano":
                System.out.println("La estación es Verano");
                break;
            default:
                System.out.println("Ingrese correctamente una estación del año");
        }
    }
}