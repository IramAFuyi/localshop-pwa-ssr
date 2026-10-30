# LocalShop PWA – Spring Boot SSR

## Descripción del proyecto

LocalShop es una Aplicación Web Progresiva (PWA) desarrollada con Java y Spring Boot. Su objetivo es mostrar un catálogo de productos mediante renderizado del lado del servidor (SSR), utilizando Thymeleaf y una base de datos relacional H2.

La aplicación integra un Service Worker para almacenar recursos en caché y permitir la consulta del catálogo sin conexión. También utiliza la API de geolocalización del navegador para obtener las coordenadas del dispositivo, con autorización del usuario.

## Tecnologías utilizadas

- Java 17 (configuración de compilación)
- Spring Boot 3.5.16
- Spring MVC
- Spring Data JPA
- Thymeleaf
- H2 Database
- HTML, CSS y JavaScript
- Service Worker y Web App Manifest
- Maven y Git

## Fase 1. Base de datos y backend SSR

Se desarrolló la entidad `Producto`, que contiene identificador, nombre, descripción, precio y URL de imagen.

Se implementó `ProductoRepository` utilizando Spring Data JPA para consultar y almacenar los productos.

Mediante un controlador MVC, el servidor obtiene los productos de la base de datos y los envía a Thymeleaf para generar la página HTML.

Se configuró H2 como base de datos persistente y se incorporaron tres productos de prueba.

## Fase 2. Componentes PWA

Se creó la vista principal utilizando Thymeleaf y una estructura adaptable a diferentes tamaños de pantalla.

También se incorporó un archivo `manifest.json`, que contiene el nombre de la aplicación, colores, iconos y configuración de visualización.

La aplicación implementa la API de geolocalización para obtener la latitud y longitud del dispositivo, previa autorización.

## Fase 3. Service Worker y funcionamiento offline

Se implementó un Service Worker para almacenar en caché la página principal y los recursos estáticos.

Se utilizaron dos estrategias:

- **Network First:** prioriza la respuesta de la red y utiliza el contenido almacenado cuando no existe conexión.
- **Cache First:** consulta primero los recursos almacenados antes de solicitarlos a la red.

Se comprobó que los productos continúan visibles al activar el modo offline del navegador.

## Instrucciones de ejecución

**Requisitos:** JDK 17 o superior y Maven Wrapper incluido en el proyecto.

1. Clonar el repositorio.
2. Abrir el directorio del proyecto en VS Code o cualquier IDE compatible.
3. Ejecutar en Windows:

   `.\mvnw.cmd spring-boot:run`

4. Abrir la aplicación en:

   `http://localhost:8090/`

5. Acceder a la consola H2 en:

   `http://localhost:8090/h2-console`

La base de datos utiliza la URL JDBC `jdbc:h2:file:./data/localshopdb`.

## Pruebas realizadas

Se verificó el inicio de Spring Boot, la conexión a H2, la visualización del catálogo, el funcionamiento offline y la obtención de coordenadas mediante geolocalización.

### Evidencias

- Catálogo renderizado con Thymeleaf.
- Consulta de productos en H2.
- Service Worker registrado.
- Recursos almacenados en Cache Storage.
- Catálogo en modo offline.
- Obtención de coordenadas mediante geolocalización.

Las capturas se encuentran en `docs/evidencias/`.

## Conclusión

El desarrollo de LocalShop permitió integrar tecnologías backend y frontend para construir una Aplicación Web Progresiva. La práctica demostró cómo Spring Boot y Thymeleaf pueden generar contenido dinámico desde una base de datos relacional, mientras que el Service Worker proporciona soporte sin conexión y las APIs del navegador permiten acceder a funciones del dispositivo.

## Autores

- Iram Guillermo Álvarez Fuyivara
- Aldo Alberto Barrera González
- María José Durán Ramírez
- Raúl Adrián Cano García
- Oliver Manríquez Coronado 
- Ailton Márquez Vargas
