public class Proveedor {

    private long id;
    private String nombre;
    private int celular;
    private String correo;
    private String direccion;
    private int nit;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCelular() { return celular; }
    public void setCelular(int celular) { this.celular = celular; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public int getNit() { return nit; }
    public void setNit(int nit) { this.nit = nit; }
}
