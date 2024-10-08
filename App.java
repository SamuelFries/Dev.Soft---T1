public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Carro("Esportivo",TipoCombustivel.GASOLINA,6,45);
        Carro ultilitario = new Carro("Ultilitario", TipoCombustivel.DIESEL,5,70);
        Carro suv = new Carro("SUV", TipoCombustivel.FLEX,8, 55);
        Carro SuvFlex = new SuvFlex("SuvFlex",TipoCombustivel.GASOLINA, 0, 0);
        Carro Econo = new Econo("Econo", TipoCombustivel.GASOLINA, 20, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(basico);
        System.out.println(suv);
        System.out.println(ultilitario);
        System.out.println(esportivo);
        System.out.println(SuvFlex);
        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);
        System.out.println(Econo);
    }
}
