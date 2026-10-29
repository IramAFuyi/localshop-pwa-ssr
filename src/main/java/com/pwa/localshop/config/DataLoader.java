
package com.pwa.localshop.config;

import com.pwa.localshop.model.Producto;
import com.pwa.localshop.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner cargarProductos(ProductoRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new Producto(null,
                    "Laptop Lenovo",
                    "Laptop para estudiantes y trabajo",
                    12500.0, null));

                repository.save(new Producto(null,
                    "Mouse Inalambrico",
                    "Mouse ergonomico USB",
                    350.0, null));

                repository.save(new Producto(null,
                    "Teclado Mecanico",
                    "Teclado RGB para computadora",
                    950.0, null));
            }
        };
    }
}
