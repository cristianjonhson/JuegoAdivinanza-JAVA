# Juego de Adivinanzas

Este es un programa simple en Java que simula un **juego de adivinanzas**. El objetivo del juego es que el usuario adivine un número aleatorio entre 0 y 100 en un máximo de 5 intentos. El programa proporciona pistas indicando si el número ingresado es mayor o menor que el número generado.

---
## Características

- Genera un número aleatorio entre 0 y 100.
- Permite al usuario intentar adivinar el número en un máximo de 5 intentos.
- Ofrece retroalimentación al usuario indicando si el número es mayor o menor.
- Informa si el usuario adivina correctamente o si se queda sin intentos.
- Utiliza un operador ternario para decisiones simples.

---

## Tecnologías

- Lenguaje: Java
- Librerías: 
  - `java.util.Random` para generar números aleatorios.
  - `java.util.Scanner` para leer la entrada del usuario.

---

## Ejecución

### Prerrequisitos

- Tener instalado Java 8 o superior.
- Un editor o IDE para ejecutar el programa (como IntelliJ IDEA, Eclipse o VS Code).

### Instrucciones

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/juego-adivinanzas.git
   ```
2. Navega al directorio del proyecto:
   ```bash
   cd juego-adivinanzas
   ```
3. Compila el archivo `JuegoAdivinanza.java`:
   ```bash
   javac JuegoAdivinanza.java
   ```
4. Ejecuta el programa:
   ```bash
   java JuegoAdivinanza
   ```

## Ejemplo de uso

```plaintext
¡Bienvenido al juego de adivinanzas!
He pensado un número entre 0 y 100. ¿Puedes adivinar cuál es?
Tienes un máximo de 5 intentos.
Introduce tu intento: 50
El número es menor que 50.
Introduce tu intento: 25
El número es mayor que 25.
Introduce tu intento: 37
¡Felicidades! Has adivinado el número en 3 intentos.
```

Si el usuario no adivina el número en los 5 intentos, el programa revelará el número secreto.

---
## Estructura del código

- **Generación de número aleatorio**: Se usa `Random` para generar el número secreto.
- **Entrada del usuario**: Se utiliza `Scanner` para capturar la entrada.
- **Bucle de intentos**: Controla el número de intentos y proporciona retroalimentación en cada intento.
- **Pistas**: Indica si el número es mayor o menor.
- **Condición de éxito o falla**: Informa si el usuario adivinó el número o se quedó sin intentos.

---

## Mejoras futuras

- Agregar un modo difícil con un rango más amplio de números.
- Permitir personalizar el número de intentos.
- Implementar un marcador para registrar las puntuaciones de los jugadores.

---
## Contribuciones

Las contribuciones son bienvenidas. Siéntete libre de abrir un issue o enviar un pull request.

---

## Licencia

Este proyecto está licenciado bajo la licencia MIT.