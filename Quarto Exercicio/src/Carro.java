public class Carro extends Veiculo {
    private int quantidadePortas;
    
    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }
    
    public int getQuantidadePortas() {
        return quantidadePortas;
    }
    
    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Quantidade de portas: " + quantidadePortas);
    }
}