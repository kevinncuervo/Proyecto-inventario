public class Main {
    public static void main(String[] args) {
        // Crear un medicamento
        Medicamento medicamento = new Medicamento();
        medicamento.setNombre("Paracetamol");
        medicamento.setPrecio(10);
        medicamento.setCategoria("Analgésico");
        medicamento.setFechaDeVencimiento("2025-12-31");
        medicamento.setId(1);

        // Crear proveedor
        Proveedor proveedor = new Proveedor();
        proveedor.setNombre("Laboratorio ABC");
        proveedor.setNit(123456);
        proveedor.setCelular(76543210);
        proveedor.setCorreo("contacto@abc.com");
        proveedor.setDireccion("Calle Falsa 123");

        // Crear factura de entrada
        FacturaDeEntradaCabecera factura = new FacturaDeEntradaCabecera();
        factura.setFecha("2025-04-19");
        factura.setNumeroDeFactura("F001");
        factura.setProveedor(proveedor);

        // Mostrar datos
        System.out.println("Factura #" + factura.getNumeroDeFactura());
        System.out.println("Fecha: " + factura.getFecha());
        System.out.println("Proveedor: " + factura.getProveedor().getNombre());
        System.out.println("Medicamento: " + medicamento.getNombre());
        System.out.println("Precio: " + medicamento.getPrecio());
    }
}