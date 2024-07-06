public class NavegadorGPS {
    private RutaStrategy strategy;

   public  NavegadorGPS(RutaStrategy strategy){
       this.strategy = strategy;
   }

   public void setStrategy(RutaStrategy strategy){
       this.strategy =strategy;
   }

   public void calcularRuta(String PuntoA, String PuntoB){
       System.out.println(strategy.calcularRuta(PuntoA, PuntoB));
   }

    public void setRutaStrategy(RutaStrategy strategy) {
        this.strategy = strategy;
    }
}
