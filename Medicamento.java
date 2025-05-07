public class Medicamento {
    private String nombre;
    private int precio;
    private String fechaDeVencimiento;
    private String categoria;
    private int id;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }

    public String getFechaDeVencimiento() { return fechaDeVencimiento; }
    public void setFechaDeVencimiento(String fecha) { this.fechaDeVencimiento = fecha; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}
