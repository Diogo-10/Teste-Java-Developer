public class Empresa {
    private String nome;
    private String cnpj;  // O CNPJ deve ser validado
    private double saldo;

    public Empresa(String nome, String cnpj, double saldoInicial) {
        if (!validaCNPJ(cnpj)) {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        this.nome = nome;
        this.cnpj = cnpj;
        this.saldo = saldoInicial;
    }

    // Método para validar CNPJ
    private boolean validaCNPJ(String cnpj) {
        if (cnpj == null || cnpj.length() != 14 || cnpj.matches("^(\\d)\\1{13}$")) {
            return false;
        }

        int soma = 0;
        int digito1, digito2;

        int[] pesos1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] pesos2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

        // Calcula o primeiro dígito verificador
        for (int i = 0; i < 12; i++) {
            soma += Character.getNumericValue(cnpj.charAt(i)) * pesos1[i];
        }
        digito1 = 11 - (soma % 11);
        if (digito1 > 9) digito1 = 0;

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 13; i++) {
            soma += Character.getNumericValue(cnpj.charAt(i)) * pesos2[i];
        }
        digito2 = 11 - (soma % 11);
        if (digito2 > 9) digito2 = 0;

        return cnpj.charAt(12) == (char) (digito1 + '0') && cnpj.charAt(13) == (char) (digito2 + '0');
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ajustarSaldo(double valor) {
        this.saldo += valor;
    }
}
