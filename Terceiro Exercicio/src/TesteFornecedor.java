public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setNome("João Silva");
        fornecedor1.setEndereco("Rua das Flores, 123");
        fornecedor1.setTelefone("(11) 99999-9999");
        fornecedor1.setValorCredito(5000.0);
        fornecedor1.setValorDivida(1500.0);
        
        Fornecedor fornecedor2 = new Fornecedor("Maria Santos", "Av. Central, 456", "(11) 88888-8888", 8000.0, 2000.0);
        
        System.out.println("Fornecedor 1:");
        System.out.println("Nome: " + fornecedor1.getNome());
        System.out.println("Endereço: " + fornecedor1.getEndereco());
        System.out.println("Telefone: " + fornecedor1.getTelefone());
        System.out.println("Valor Crédito: R$ " + fornecedor1.getValorCredito());
        System.out.println("Valor Dívida: R$ " + fornecedor1.getValorDivida());
        System.out.println("Saldo: R$ " + fornecedor1.obterSaldo());
        
        System.out.println("\nFornecedor 2:");
        System.out.println("Nome: " + fornecedor2.getNome());
        System.out.println("Endereço: " + fornecedor2.getEndereco());
        System.out.println("Telefone: " + fornecedor2.getTelefone());
        System.out.println("Valor Crédito: R$ " + fornecedor2.getValorCredito());
        System.out.println("Valor Dívida: R$ " + fornecedor2.getValorDivida());
        System.out.println("Saldo: R$ " + fornecedor2.obterSaldo());
    }
}