import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalcularDistancia calcularDistancia = new CalcularDistancia();
        Scanner s = new Scanner(System.in);

        System.out.println("DIGITE A LATITUDE 1 NO FORMATO 'XX.XXXXX'");
        String latitude1 = s.nextLine();
        Double lat1 = Double.parseDouble(latitude1);

        System.out.println("DIGITE A LONGITUDE 1 NO FORMATO 'XX.XXXXX'");
        String longitude1 = s.nextLine();
        Double long1 = Double.parseDouble(longitude1);

        System.out.println("DIGITE A LATITUDE 2 NO FORMATO 'XX.XXXXX'");
        String latitude2 = s.nextLine();
        Double lat2 = Double.parseDouble(latitude2);

        System.out.println("DIGITE A LONGITUDE 2 NO FORMATO 'XX.XXXXX'");
        String longitude2 = s.nextLine();
        Double long2 = Double.parseDouble(longitude2);

        System.out.println("A distância entre os 2 locais é: " + calcularDistancia.calculateDistance(lat1, long1, lat2, long2) + " metros");
    }

}