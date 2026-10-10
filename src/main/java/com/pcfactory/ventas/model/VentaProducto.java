package com.pcfactory.ventas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ventas_productos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class VentaProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVentaProducto; // JPA -> id_venta_producto

    @Column(nullable = false, length = 255, unique = false)
    private String nombreCliente; // JPA -> nombre_cliente

    @Column(nullable = false, unique = false)
    private Long idCliente;

    @Column(nullable = false, unique = false)
    private Long idProducto;

    @Column(nullable = false, unique = false)
    private String nombreProducto;

    @Column(nullable = false, unique = false)
    private Long precio;

    @Column(nullable = false, unique = false)
    private Long cantidad;

}
