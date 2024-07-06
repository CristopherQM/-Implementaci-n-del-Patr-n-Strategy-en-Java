public class RutaMasEconomica implements RutaStrategy {
    @Override
    public String calcularRuta(String PuntoA, String PuntoB) {
        return "Calculando ruta más económica entre " + PuntoA + " y " + PuntoB;
    }
}
