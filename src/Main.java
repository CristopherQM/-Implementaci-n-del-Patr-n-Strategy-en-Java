public class Main {
    public static void main(String[] args) {
NavegadorGPS gps= new NavegadorGPS(new RutaMasRapida());
gps.calcularRuta("Punto A", "Punto B");

//ESto es para cambiar a otra estratefia
gps.setRutaStrategy(new RutaMasCorta());
gps.calcularRuta("Punto A", "Punto B");

        // Cambiar a otra estrategia (Ruta más económica)
        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Punto A", "Punto B");

        // Cambiar a otra estrategia (Ruta escénica)
        gps.setRutaStrategy(new RutaEscenica());
        gps.calcularRuta("Punto A", "Punto B");

        // Cambiar a otra estrategia (Ruta evitando peajes)
        gps.setRutaStrategy(new RutaEvitandoPeajes());
        gps.calcularRuta("Punto A", "Punto B");



    }
}