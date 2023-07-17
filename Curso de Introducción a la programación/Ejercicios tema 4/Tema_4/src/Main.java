public class Main {
    public static void main(String[] args) {
        // if
        int numeroIf = 5;
        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es 0.");
        }

        // Bucle While
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Número bucle: " + numeroWhile);
        }

        // Bucle Do-While
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("Número bucle Do-While: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        // Bucle For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Número bucle For: " + numeroFor);
        }

        // Switch
        String estacion = "verano";
        switch (estacion) {
            case "invierno" -> System.out.println("Es invierno.");
            case "primavera" -> System.out.println("Es primavera.");
            case "verano" -> System.out.println("Es verano.");
            case "otoño" -> System.out.println("Es otoño.");
            default -> System.out.println("No es una estación válida.");
        }
    }
}
