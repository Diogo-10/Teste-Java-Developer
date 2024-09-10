public class Main {
    public static void main(String[] args) {
        // Criando um cliente e uma empresa
        Cliente cliente = new Cliente("João Silva", "67346634420");  // Use um CPF válido(SOMENTE PARA TESTE)
        Empresa empresa = new Empresa("Empresa X", "43121155000199", 1000.0);  // Use um CNPJ válido (SOMENTE PARA TESTE)

        // Realizando uma transação de depósito
        Transacao deposito = new Transacao(cliente, empresa, 500.0, "deposito");
        deposito.realizar();

        // Realizando uma transação de saque
        Transacao saque = new Transacao(cliente, empresa, 200.0, "saque");
        saque.realizar();
    }
}
