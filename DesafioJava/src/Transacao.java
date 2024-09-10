public class Transacao {
    private Cliente cliente;
    private Empresa empresa;
    private double valor;
    private String tipo; // "saque" ou "deposito"

    public Transacao(Cliente cliente, Empresa empresa, double valor, String tipo) {
        this.cliente = cliente;
        this.empresa = empresa;
        this.valor = valor;
        this.tipo = tipo;
    }

    public boolean realizar() {
        if (tipo.equals("deposito")) {
            empresa.ajustarSaldo(valor);
            notificarCliente();
            enviarCallbackParaEmpresa();
            return true;
        } else if (tipo.equals("saque")) {
            if (empresa.getSaldo() >= valor) {
                empresa.ajustarSaldo(-valor);
                notificarCliente();
                enviarCallbackParaEmpresa();
                return true;
            } else {
                System.out.println("Saldo insuficiente.");
                return false;
            }
        }
        return false;
    }

    private void notificarCliente() {
        // Lógica para notificar o cliente (email, SMS, etc.)
        System.out.println("Notificação enviada para o cliente: " + cliente.getNome());
    }

    private void enviarCallbackParaEmpresa() {
        // Lógica para enviar o callback para a empresa usando webhook.site
        System.out.println("Callback enviado para a empresa: " + empresa.getNome());
    }
}
