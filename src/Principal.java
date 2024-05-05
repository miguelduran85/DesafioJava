import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion = 0;

        Scanner teclado = new Scanner(System.in);
        Consulta consulta = new Consulta();
        String cabeza = """
                 ********************************************
                ***********Conversor de monedas*************
                ********************************************
                
                ** Escriba el numero de la opcion deseada **""";
        String menu = """
                1 - Dolares a Pesos Mexicanos
                2 - Dolares a Pesos Argentinos
                3 - libras esterlinas a Pesos Mexicanos
                4- Yen Japones a Pesos Mexicanos
                5- Euros Pesos Mexicanos
                6- Euros a Dolares
                9 - Salir
                """;


        try {

            while (opcion != 9) {
                System.out.println(cabeza);
                System.out.println(menu);
                opcion = teclado.nextInt();

                switch (opcion) {

                    case 1:

                        System.out.println("Dolares a Pesos Mexicanos");
                        System.out.println("Que valor deseas convertir");
                        var cantidad = teclado.nextFloat();
                        Monedas monedas = consulta.buscaDeMoneda("USD", "MXN", cantidad);
                        System.out.println("la catidad es $ %.2f".formatted(monedas.conversion_result()) + " PESOS MEXICANOS");

                        break;

                    case 2:

                        System.out.println("Dolares a Pesos Argentinos");
                        System.out.println("Que valor deseas convertir");
                        cantidad = teclado.nextFloat();
                        monedas = consulta.buscaDeMoneda("USD", "ARS", cantidad);
                        System.out.println("la catidad es $ %.2f".formatted(monedas.conversion_result()) + " PESOS ARGENTINOS");

                        break;

                    case 3:

                        System.out.println("Libra Esterlina a Pesos Mexicanos");
                        System.out.println("Que valor deseas convertir");
                        cantidad = teclado.nextFloat();
                        monedas = consulta.buscaDeMoneda("GBP", "MXN", cantidad);
                        System.out.println("la catidad es $ %.2f".formatted(monedas.conversion_result()) + " PESOS MEXICANOS");

                        break;

                    case 4:

                        System.out.println("Yen Japones a Pesos Mexicanos");
                        System.out.println("Que valor deseas convertir");
                        cantidad = teclado.nextFloat();
                        monedas = consulta.buscaDeMoneda("JPY", "MXN", cantidad);
                        System.out.println("la catidad es $ %.2f".formatted(monedas.conversion_result()) + " PESOS MEXICANOS");

                        break;

                    case 5:

                        System.out.println("Euros a Pesos Mexicanos");
                        System.out.println("Que valor deseas convertir");
                        cantidad = teclado.nextFloat();
                        monedas = consulta.buscaDeMoneda("EUR", "MXN", cantidad);
                        System.out.println("la catidad es $ %.2f".formatted(monedas.conversion_result()) + " PESOS MEXICANOS");

                        break;

                    case 6:

                        System.out.println("Euros a Dolares");
                        System.out.println("Que valor deseas convertir");
                        cantidad = teclado.nextFloat();
                        monedas = consulta.buscaDeMoneda("EUR", "USD", cantidad);
                        System.out.println("la catidad es $ %.2f".formatted(monedas.conversion_result()) + " DOLARES");

                        break;

                    case 9:

                        System.out.println("GRACIAS POR SU VISITA");
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida");

                }
            }

        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Coloca un numero valido");
        }


    }
}
