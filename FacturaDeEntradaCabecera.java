public class FacturaDeEntradaCabecera implements Factura {
    private String fecha;
    private int numeroDeFactura;
    private Proveedor proveedor;

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public int getNumeroDeFactura() { return numeroDeFactura; }
    public void setNumeroDeFactura(int numero) { this.numeroDeFactura = numero; }

    public Proveedor getProveedor() { return proveedor; }
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor; }

    @Override
    public void imprimirFactura() {
        System.out.println("Factura de Entrada #" + numeroDeFactura);
    }
}
