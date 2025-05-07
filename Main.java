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

        // Crear cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Pérez");
        cliente.setIdentificacion(987654321);
        cliente.setCorreo("juan@gmail.com");
        cliente.setCelular(123456789);

        // Crear factura de entrada
        FacturaDeEntradaCabecera facturaEntrada = new FacturaDeEntradaCabecera();
        facturaEntrada.setFecha("2025-04-19");
        facturaEntrada.setNumeroDeFactura(Integer.parseInt("F001".substring(1)));
        facturaEntrada.setProveedor(proveedor);

        // Crear factura de salida
        FacturaDeSalidaCabecera facturaSalida = new FacturaDeSalidaCabecera();
        facturaSalida.setFecha("2025-05-01");
        facturaSalida.setNumeroDeFacturaDeSalida(Integer.parseInt("S001".substring(1)));
        facturaSalida.setCliente(cliente);

        // Usar polimorfismo para imprimir facturas
        Factura[] facturas = {facturaEntrada, facturaSalida};
        for (Factura factura : facturas) {
            factura.imprimirFactura();
            System.out.println();
        }

        // Crear detalle de factura de entrada
        FacturaDeEntradaDetalle detalleEntrada = new FacturaDeEntradaDetalle();
        detalleEntrada.setMedicamento(medicamento);
        detalleEntrada.setCantidad(100);
        detalleEntrada.setPrecioUnitario(10);

        // Crear detalle de factura de salida
        FacturaDeSalidaDetalle detalleSalida = new FacturaDeSalidaDetalle();
        detalleSalida.setMedicamento(medicamento);
        detalleSalida.setCantidad(2);
        detalleSalida.setPrecioUnitario(12);

        // Crear inventario
        Inventario inventario = new Inventario();
        inventario.setMedicamento(medicamento);

        // Crear registro de destrucción de medicamentos
        RegistroDestruccionMedicamento registroDestruccion = new RegistroDestruccionMedicamento();
        registroDestruccion.setMedicamento(medicamento);
        registroDestruccion.setCantidad(5);
        registroDestruccion.setFecha("2025-05-05");

        // Mostrar datos adicionales
        System.out.println("\n==============================");
        System.out.println("         FACTURA DE MEDICAMENTOS");
        System.out.println("==============================");

        System.out.println("\nCliente:");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Identificación: " + cliente.getIdentificacion());
        System.out.println("Correo: " + cliente.getCorreo());
        System.out.println("Celular: " + cliente.getCelular());

        System.out.println("\nProveedor:");
        System.out.println("Nombre: " + proveedor.getNombre());
        System.out.println("NIT: " + proveedor.getNit());
        System.out.println("Correo: " + proveedor.getCorreo());
        System.out.println("Celular: " + proveedor.getCelular());
        System.out.println("Dirección: " + proveedor.getDireccion());

        System.out.println("\nDetalle del Medicamento:");
        System.out.println("Medicamento: " + medicamento.getNombre());
        System.out.println("Categoría: " + medicamento.getCategoria());
        System.out.println("Precio Unitario: " + medicamento.getPrecio());
        System.out.println("Fecha de Vencimiento: " + medicamento.getFechaDeVencimiento());

        System.out.println("\nInventario:");
        System.out.println("Cantidad Disponible: " + inventario.getCantidad());

        System.out.println("\nRegistro de Destrucción:");
        System.out.println("Cantidad Destruida: " + registroDestruccion.getCantidad());
        System.out.println("Fecha de Destrucción: " + registroDestruccion.getFecha());

        System.out.println("\n==============================");
        System.out.println("         FIN DE LA FACTURA");
        System.out.println("==============================");
    }
}