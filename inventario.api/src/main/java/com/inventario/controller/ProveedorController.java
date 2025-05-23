package com.inventario.controller;

import com.inventario.model.Proveedor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    private List<Proveedor> proveedores = new ArrayList<>();
    private long contadorId = 1;

    public ProveedorController() {
        Proveedor p1 = new Proveedor();
        p1.setId(contadorId++);
        p1.setNombre("Bayer");
        p1.setCorreo("Bayer@email.com");
        p1.setCelular("3158418521");
        p1.setDireccion("Calle 123 #45-67");
        p1.setNit("123456789");

        Proveedor p2 = new Proveedor();
        p2.setId(contadorId++);
        p2.setNombre("johnson y johnson");
        p2.setCorreo("johnsonyjohnson@email.com");
        p2.setCelular("3124564845");
        p2.setDireccion("Calle 456 #78-90");
        p2.setNit("987654321");

        proveedores.add(p1);
        proveedores.add(p2);
    }

    // GET: localhost:8283/api/proveedores/Mostrar
    @GetMapping("/Mostrar")
    public List<Proveedor> getTodos() {
        return proveedores;
    }

    // POST: localhost:8283/api/proveedores/Crear
    @PostMapping("/Crear")
    public Proveedor crearProveedor(@RequestBody Proveedor nuevo) {
        nuevo.setId(contadorId++);
        proveedores.add(nuevo);
        return nuevo;
    }

    // PUT: localhost:8283/api/proveedores/Actualizar/id
    @PutMapping("/Actualizar/{id}")
    public Proveedor actualizarProveedor(@PathVariable long id, @RequestBody Proveedor proveedorActualizado) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getId() == id) {
                proveedor.setNombre(proveedorActualizado.getNombre());
                proveedor.setCorreo(proveedorActualizado.getCorreo());
                proveedor.setCelular(proveedorActualizado.getCelular());
                return proveedor;
            }
        }
        return null;
    }

    // DELETE: localhost:8283/api/proveedores/Eliminar/id
    @DeleteMapping("/Eliminar/{id}")
    public String eliminarProveedor(@PathVariable long id) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getId() == id) {
                proveedores.remove(proveedor);
                return "Proveedor eliminado con éxito";
            }
        }
        return "Proveedor no encontrado";
    }
}