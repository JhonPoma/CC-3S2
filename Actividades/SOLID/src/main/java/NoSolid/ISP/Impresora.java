package NoSolid.ISP;

interface Impresora {
    void printDocument();

    default public  void sendFax() {
        System.out.println("f");;
    }
}
