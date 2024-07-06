public class RutaEvitandoPeajes implements RutaStrategy {
    @Override
    public String calcularRuta(String PuntoA, String PuntoB) {
        return "Calculando ruta evitando peajes entre " + PuntoA + " y " + PuntoB;
    }
}
