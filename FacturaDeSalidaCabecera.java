public class FacturaDeSalidaCabecera {
    private String fecha;
    private Cliente cliente;
    private String numeroDeFacturaDeSalida;
    private int totalVenta;

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public String getNumeroDeFacturaDeSalida() { return numeroDeFacturaDeSalida; }
    public void setNumeroDeFacturaDeSalida(String numero) { this.numeroDeFacturaDeSalida = numero; }

    public int getTotalVenta() { return totalVenta; }
    public void setTotalVenta(int total) { this.totalVenta = total; }
}