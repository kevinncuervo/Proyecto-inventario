public class FacturaDeSalidaDetalle {
    private Medicamento medicamento;
    private int cantidad;
    private int precioUnitario;
    private int subtotal;
    private int total;
    private int id;

    public Medicamento getMedicamento() { return medicamento; }
    public void setMedicamento(Medicamento medicamento) { this.medicamento = medicamento; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public int getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(int precio) { this.precioUnitario = precio; }

    public int getSubtotal() { return subtotal; }
    public void setSubtotal(int subtotal) { this.subtotal = subtotal; }

    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}
