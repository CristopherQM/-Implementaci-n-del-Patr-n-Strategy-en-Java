public class RutaEscenica implements RutaStrategy{
    @Override
    public String calcularRuta(String PuntoA, String PuntoB) {
        return "Calculando ruta escénica entre " + PuntoA + " y " + PuntoB;

    }
}
