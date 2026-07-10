package ec.edu.uteq.carrito.model;

import java.io.Serializable;

public record Producto(String nombre, double precio) implements Serializable {
    private static final long serialVersionUID = 1L;
}