public class Econo extends Carro {

    private static final int consumoG = 20;

    public Econo (String modelo, TipoCombustivel tipoCombustivel, int consumoMotor, int capacidadeTanque){    
        super("Econo", TipoCombustivel.GASOLINA, 20, 55);
        
    }

    @Override
    public boolean viaja(int distancia) {
        boolean result = super.viaja(distancia);
        if (result) {
            int kmRodados = motor.getQuilometragem();
            int novoConsumo = 20 - (kmRodados / 5000);
            if (novoConsumo < 10) {
                novoConsumo = 10;
            }
            motor = new Motor(TipoCombustivel.GASOLINA, novoConsumo);
        }
        return result;
    }
}