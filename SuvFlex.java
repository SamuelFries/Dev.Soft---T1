public class SuvFlex extends Carro {
    
    
    private static final int consumoG = 8;
    private static final int consumoA = 6;
    

    public SuvFlex(String modelo, TipoCombustivel tipoCombustivel, int consumoMotor, int capacidadeTanque) {
        super("SuvFlex", TipoCombustivel.FLEX, consumoG, 65);

    }

    @Override
    public int abastece(TipoCombustivel tipoCombustivel, int quantidade) {
        
        if (tipoCombustivel == TipoCombustivel.GASOLINA) {
            motor.setConsumo(consumoG);
        } else if (tipoCombustivel == TipoCombustivel.ALCOOL) {
            motor.setConsumo(consumoA);
        }
        return super.abastece(tipoCombustivel, quantidade);
    }

}