package com.inventario.model;

public class Inventario {
    private Medicamento medicamento;
    private int cantidad;
    private String fechaDeUltimaActualizacion;

    public Medicamento getMedicamento() { return medicamento; }
    public void setMedicamento(Medicamento medicamento) { this.medicamento = medicamento; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public String getFechaDeUltimaActualizacion() { return fechaDeUltimaActualizacion; }
    public void setFechaDeUltimaActualizacion(String fecha) { this.fechaDeUltimaActualizacion = fecha; }
}
