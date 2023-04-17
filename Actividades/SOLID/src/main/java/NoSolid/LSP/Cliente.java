package NoSolid.LSP;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion sin LSP\n");
        PaymentHelper helper = new PaymentHelper();

        // Instanciando dos usuarios registrados
        RegisteredUserPayment pagoAbejita = new RegisteredUserPayment("Ajita");
        RegisteredUserPayment pagoChalito = new RegisteredUserPayment("Chbealito");

        // Agregando los usuarios a los helper
        helper.addUser(pagoAbejita);
        helper.addUser(pagoChalito);

        GuestUserPayment guestUser = new GuestUserPayment();
        helper.addUser(guestUser);

        // Procesando el pago usando la clase helper
        // Encuentras algun problema?
        helper.showPreviousPayments();
        helper.processNewPayments();

    }
}
