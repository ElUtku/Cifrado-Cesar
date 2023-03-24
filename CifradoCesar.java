package Cifrados;
public class CifradoCesar {
    
    public static void main(String[] args) {
        char[] abecedario = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', '\u2018', 'O', 'P', 'Q','R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

        String cadena = "el marrano esta muy bueno";
        int desplazamiento = 9;
        boolean opcion = true; // false descifrar || true cifrar

        cadena = cadena.toUpperCase();
        cadena = cadena.replaceAll(" ", "");
        char[] arrayCadena = cadena.toCharArray();

        if (opcion) {
            
            System.out.println("M = " + cadena);
            System.out.println("D = " + desplazamiento);
            for (int i = 0; i < arrayCadena.length; i++) {

                arrayCadena[i] = abecedario[modulo(encotrarPosicionLetraEnAbecedario(arrayCadena[i],abecedario)+desplazamiento)];

                System.out.println("M" + i + " = " + (char)cadena.charAt(i) + "+" + desplazamiento + " mod(27)" + " = " +
                                encotrarPosicionLetraEnAbecedario((char)cadena.charAt(i), abecedario) + "+"
                                + desplazamiento + " mod(27) = " + (encotrarPosicionLetraEnAbecedario((char)cadena.charAt(i), abecedario)
                                + desplazamiento) +" mod(27) = " +(char) arrayCadena[i]);
            }

        } else {

            System.out.println("C = " + cadena);
            System.out.println("D = " + desplazamiento);

            for (int i = 0; i < arrayCadena.length; i++) {

                arrayCadena[i] = abecedario[modulo(encotrarPosicionLetraEnAbecedario(arrayCadena[i],abecedario)-desplazamiento)];

                System.out.println("M" + i + " = " + (char)cadena.charAt(i) + "-" + desplazamiento + " mod(27)" + " = " +
                                encotrarPosicionLetraEnAbecedario((char)cadena.charAt(i), abecedario) + "+"
                                + desplazamiento + " mod(27) = " + (encotrarPosicionLetraEnAbecedario((char)cadena.charAt(i), abecedario)
                                - desplazamiento) +" mod(27) = " +(char) arrayCadena[i]);

            }
        }

        System.out.println("Resultado: "+new String(arrayCadena));
    }
    
    public static int encotrarPosicionLetraEnAbecedario(char letra, char[] abecedario) {
        int posicion = 0;

        for (int i = 0; i < abecedario.length; i++) {
            if (letra == abecedario[i]) {
                posicion = i;
                return posicion;
            }
        }

        return -1;
    }

    public static int modulo(int posicion) {
        if (posicion > 26) {
            posicion = posicion - 27;
        }
        if (posicion < 0) {
            posicion = posicion + 27;
        }

        return posicion;
    }
}
