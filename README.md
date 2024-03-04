# APROXIMACIÓN DE π POR EL MÉTODO DE MONTECARLO

## Descripción de la aplicación

* Resumen: el software que se publica en este repositorio permite
  [aproximar el número Pi mediante simulación de forma recursiva](https://www.youtube.com/watch?v=ELetCV_wX_c)
* Versión: 1.0.

## Compilación del programa

Se ha incluido un `makefile` que define, entre otras tareas, la
generación de un `.jar`:

```console
make jar
```

## Ejecución del programa

```console
java aplicacion.Principal <número_de_pasos>
```

## Ejemplo de Ejecución
```console
java aplicacion.Principal 333333
```
Esto generará una salida similar a:
```console
El número PI es 3.1464
```
## Cómo generar el HTML a partir del Javadoc

El HTML con los comentarios se puede obtener mediante la siguiente
sentencia:

```console
make javadoc
```

## License

Este proyecto está bajo la [Licencia](LICENSE.txt).
