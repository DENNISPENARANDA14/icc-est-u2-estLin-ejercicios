# Estructuras de Datos Lineales - Ejercicio Práctico

## Getting Started

Este proyecto es un ejercicio práctico sobre cómo implementar estructuras de datos lineales básicas en Java. 

Este repositorio se refiere a la segunda unidad de Estructuras de Datos, donde el primer capítulo cubre estructuras de datos lineales: Pilas, Colas y Listas Enlazadas.

## Requisitos
- Java JDK 11 o superior
- Git 2.20 o superior


## Identificación del Estudiante (Obligatorio)

Antes de comenzar a programar o ejecutar el proyecto, **debes completar tu nombre y correo institucional en el archivo `student.env`** que se encuentra en la raíz del proyecto. Este archivo es necesario para validar tu identidad como autor del trabajo.

### ¿Por qué es obligatorio?

Este proyecto utiliza una verificación automática que valida que has ingresado tu información personal. Si no lo haces:

- Al ejecutar el proyecto (`App.java`) verás este mensaje de error:
```
❌ Debes completar STUDENT_NAME y STUDENT_EMAIL en student.env
```
- No podrás enviar tu código (`push`) al repositorio si tienes activado el sistema de validación local.
- Las pruebas automáticas en GitHub Actions también fallarán si no detectan tu nombre y correo.

### ¿Qué debo hacer?

1. Abre el archivo `student.env` que ya está creado en el proyecto.
2. Rellena tus datos:

```
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.correo@institucion.edu.ec
```


3. **No borres estas líneas ni cambies los nombres de las variables.**
4. Guarda los cambios y vuelve a ejecutar el programa o hacer push.

> 💡 Este mecanismo asegura la autoría del código y que cada estudiante reciba su evaluación automática de forma personalizada.

---




## Explicación para el estudiante

A continuación se explica cómo implementar y probar cada uno de los métodos de la clase `LogicaClasificacion`:

### 1. invertirCadena(String texto)
- Utiliza una pila (`Stack`) para invertir el orden de los caracteres de una cadena.
- Apila cada carácter y luego desapila para formar la cadena invertida.

Concepto:
Debes invertir una cadena usando una estructura de pila (Stack). Las pilas funcionan bajo el principio LIFO (Last In, First Out), es decir, el último elemento en entrar es el primero en salir.

Pasos sugeridos:

- Crea una pila de caracteres.
- Recorre la cadena y apila cada carácter.
- Extrae (pop) los caracteres de la pila y construye la cadena invertida.
> **Pista:**  
> Utiliza `Stack<Character>` y un `StringBuilder` para armar la cadena final.




### 2. validarSimbolos(String expresion)
- Usa una pila para verificar si los símbolos de apertura y cierre (`()`, `{}`, `[]`) están correctamente balanceados.
- Apila los símbolos de apertura y verifica que cada cierre coincida con el tope de la pila.

Concepto:
Debes verificar si los símbolos de apertura y cierre (`()`, `{}`, `[]`)  están correctamente balanceados. Esto se resuelve típicamente con una pila.

Pasos sugeridos:

Recorre la cadena carácter por carácter.
- Si es un símbolo de apertura, apílalo.
- Si es de cierre, verifica que coincida con el tope de la pila.
- Si la pila queda vacía al final, está balanceado.

> Pista:
> Puedes usar un `Stack<Character>` y un mapa para relacionar los símbolos de apertura y cierre.

### 3. ordenarPila(Stack<Integer> pila)
- Ordena una pila de enteros en orden ascendente usando solo otra pila auxiliar.
- Inserta los elementos en la pila auxiliar en el lugar correcto, simulando el ordenamiento de cartas en la mano.

Concepto:
Debes ordenar una pila de enteros en orden ascendente usando solo otra pila auxiliar.

Pasos sugeridos:

- Usa una pila auxiliar para ir insertando los elementos en orden.
- Saca elementos de la pila original y colócalos en la auxiliar en el lugar correcto.
- Al final, extrae los elementos de la pila auxiliar y colócalos en una lista.

> Pista:
> Este algoritmo es similar a ordenar cartas en la mano.

### 4. clasificarPorParidad(LinkedList<Integer> original)
- Separa los números pares e impares de una lista, manteniendo el orden original.
- Devuelve una lista con los pares primero y luego los impares.

Debes separar los números pares e impares, manteniendo el orden original, y devolver una lista con los pares primero y luego los impares.

Pasos sugeridos:

Crea dos listas: una para pares y otra para impares.
- Recorre la lista original y agrega cada número a la lista correspondiente.
- Junta ambas listas y retorna el resultado.

> Pista:
> Puedes usar dos `LinkedList<Integer>` y luego combinarlas.

Consejo general:
Antes de programar, piensa en cómo usar las estructuras de datos adecuadas (pila, lista, etc.) para cada problema. Si tienes dudas, prueba con ejemplos pequeños en papel



## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial
- [DENNIS PENARANDA] - Desarrollo ejercicios propuestos
# test hook
