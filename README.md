<h1>GitHub: Cifrado Cesar</h1>
<p>Este es un programa en Java que implementa el cifrado César, un algoritmo de cifrado muy simple que consiste en desplazar las letras del alfabeto un número fijo de posiciones. El programa permite cifrar y descifrar mensajes utilizando este algoritmo.</p>
<h2>Uso del programa</h2>
<p>Para utilizar el programa, simplemente ejecute el archivo <code>CifradoCesar.java</code> y siga las instrucciones que aparecen en la consola. El programa ya viene configurado con una cadena de texto y un desplazamiento predeterminados, pero se pueden modificar según se requiera.</p>
<h2>Funcionamiento del programa</h2>
<p>El programa comienza definiendo un array con todas las letras del alfabeto, en mayúsculas, incluyendo una comilla simple (<code>\u2018</code>) para representar el espacio en blanco. A continuación, se define una cadena de texto y un número de desplazamiento. También se especifica si se quiere cifrar o descifrar el mensaje.</p>
<p>El programa convierte la cadena de texto en mayúsculas y elimina todos los espacios en blanco. Luego, utiliza un bucle para recorrer cada letra de la cadena y aplicarle el desplazamiento correspondiente, utilizando la función <code>encotrarPosicionLetraEnAbecedario</code> para encontrar la posición de cada letra en el array del alfabeto, y la función <code>modulo</code> para asegurarse de que el resultado del desplazamiento no se salga del rango de letras del alfabeto.</p>
<p>Finalmente, el programa muestra en la consola el resultado del cifrado o descifrado.</p>
<h2>Funciones</h2>
<p>El programa cuenta con dos funciones adicionales:</p>
<ul><li><code>encotrarPosicionLetraEnAbecedario</code>: recibe una letra y el array del alfabeto, y devuelve la posición de esa letra en el alfabeto. Si la letra no se encuentra en el alfabeto, devuelve -1.</li><li><code>modulo</code>: recibe una posición y asegura que el resultado esté dentro del rango de posiciones del alfabeto, es decir, entre 0 y 26. Si la posición es mayor que 26, se le resta 27; si es menor que 0, se le suma 27.</li></ul>
<h2>Contribuciones</h2>
<p>Este programa es de código abierto y se aceptan contribuciones a través de pull requests. Si encuentra un error o una manera de mejorarlo, no dude en abrir un issue.</p>
