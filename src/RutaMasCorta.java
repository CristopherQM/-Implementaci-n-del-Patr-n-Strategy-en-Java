public class RutaMasCorta implements RutaStrategy{
    @Override
    public String calcularRuta(String PuntoA, String PuntoB) {
        return "Calculando ruta más corta entre " + PuntoA + " y " + PuntoB;
    }
}
