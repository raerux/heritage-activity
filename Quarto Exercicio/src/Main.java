public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = {
                new Carro("Toyota", "Corolla", 4),
                new Carro("Honda", "Civic", 4),
                new Moto("Yamaha", "MT-07", 689),
                new Moto("Honda", "CB600", 600)
        };

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInfo();
            System.out.println("---");
        }
    }
}