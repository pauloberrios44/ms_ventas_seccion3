package com.pcfactory.ventas.service;

import com.pcfactory.ventas.dto.VentaProductoRequest;
import com.pcfactory.ventas.model.VentaProducto;
import com.pcfactory.ventas.repository.VentaProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VentaProductoService {

    @Autowired
    private VentaProductoRepository ventaProductoRepository;

    @Transactional
    public List<VentaProducto> registrarVenta(List<VentaProductoRequest> request) {
        List<VentaProducto> productos = new ArrayList<>();

        for (VentaProductoRequest item : request) {
            VentaProducto producto = new VentaProducto();

            producto.setNombreCliente(item.getNombreCliente());
            producto.setIdCliente(item.getIdCliente());
            producto.setIdProducto(item.getIdProducto());
            producto.setNombreProducto(item.getNombreProducto());
            producto.setPrecio(item.getPrecio());
            producto.setCantidad(item.getCantidad());

            productos.add(producto);
        }

        return ventaProductoRepository.saveAll(productos);

    }

    @Transactional
    public List<VentaProducto> obtenerProductosVendidos() {
        return ventaProductoRepository.findAll();
    }

}
