public class CalcularDistancia {

    private static final Double raio = 6371000.0;

    public String calculateDistance(Double latitude1, Double longitude1, Double latitude2, Double longitude2) {

        double distanciaLat = Math.toRadians(latitude2 - latitude1);
        double distanciaLon = Math.toRadians(longitude2 - longitude1);
        double a = Math.sin(distanciaLat / 2) * Math.sin(distanciaLat / 2) +
                Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2)) *
                        Math.sin(distanciaLon / 2) * Math.sin(distanciaLon / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        Double distancia = raio * c;

        return String.format("%.2f", distancia);
    }
}
