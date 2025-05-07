public class FacturaDeSalidaCabecera implements Factura {
    private String fecha;
    private Cliente cliente;
    private int numeroDeFacturaDeSalida;
    private int totalVenta;

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public int getNumeroDeFacturaDeSalida() { return numeroDeFacturaDeSalida; }
    public void setNumeroDeFacturaDeSalida(int numero) { this.numeroDeFacturaDeSalida = numero; }

    public int getTotalVenta() { return totalVenta; }
    public void setTotalVenta(int total) { this.totalVenta = total; }

    @Override
    public void imprimirFactura() {
        System.out.println("Factura de Salida #" + numeroDeFacturaDeSalida);
    }
}
