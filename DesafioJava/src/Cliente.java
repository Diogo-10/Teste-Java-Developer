import java.util.InputMismatchException;

public class Cliente {
    private String nome;
    private String cpf;  // O CPF deve ser validado

    public Cliente(String nome, String cpf) {
        if (!validaCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.nome = nome;
        this.cpf = cpf;
    }

    // Método para validar CPF
    private boolean validaCPF(String cpf) {
        if (cpf == null || cpf.length() != 11 || cpf.matches("^(\\d)\\1{10}$")) {
            return false;
        }

        int soma = 0;
        int digito1, digito2;

        // Calcula o primeiro dígito verificador
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        digito1 = 11 - (soma % 11);
        if (digito1 > 9) digito1 = 0;

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        digito2 = 11 - (soma % 11);
        if (digito2 > 9) digito2 = 0;

        return cpf.charAt(9) == (char) (digito1 + '0') && cpf.charAt(10) == (char) (digito2 + '0');
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
