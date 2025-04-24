public class FacturaDeEntradaCabecera {
    private String fecha;
    private String numeroDeFactura;
    private Proveedor proveedor;

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getNumeroDeFactura() { return numeroDeFactura; }
    public void setNumeroDeFactura(String numero) { this.numeroDeFactura = numero; }

    public Proveedor getProveedor() { return proveedor; }
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor; }
}