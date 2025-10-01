package POOExercises.exercise5;

public class Init {
    public static void main(String[] args) {
        Pagamento boleto = new Boleto();
        Pagamento cartaoDeCredito = new CartaoDeCredito();
        Cliente cliente = new Cliente("Ronald", boleto);

        cliente.pagar(100);

        Cliente cliente2 = new Cliente("José", cartaoDeCredito);
        cliente2.pagar(500);
    }
}
