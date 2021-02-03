import java.util.Scanner; // Import para leer por pantalla

import java.util.Stack; /* Ejercicio 5: Import para crear una pila. Una pila es una estructura que nos 
                         * permite apilar elementos y recopilarlos en el orden inverso al cual los apilamos
                         * mediante operaciones de desapilar. */

import java.util.StringTokenizer; // Ejercicio 5: Import para convertir la frase en un array de palabras.

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al menú de ejercicios!!!");
        System.out.println("Estas son los ejercicios que puedes ver:");
        mostrarMenu();
        System.out.println("-->  Ahora elige que ejercicio quieres ver:  <--");
        mostrarEjercicios();
    }
    public static void mostrarMenu(){
        // Primer ejercicio
        System.out.println("1.- Leer 5 números (con bucle por favor, no pongáis 5 scanner" +
        " consecutivos) y mostrarlos en el mismo orden introducido. Lo 5 números se deben" +
        " almacenar en un array.");
        // Segundo ejercicio
        System.out.println("2.- Leer 5 números y mostrarlos en orden inverso al introducido.");
        // Tercer ejercicio
        System.out.println("3.- Leer 5 números por teclado y a continuación realizar la media de los" +
        " números positivos, la media de los negativos y contar el número de ceros que se han" +
        " introducido por teclado.");
        // Cuarto ejercicio
        System.out.println("4.- Reciba como parámetro un texto y devuelva la cantidad de caracteres" +
        " que incorpora el texto.");
        // Quinto ejercicio
        System.out.println("5.- Reciba como parámetro un texto y devuelva el texto invertido.");
        // Sexto ejercicio
        System.out.println("6.- Reciba como parámetro un texto y lo devuelva sin espacios en blanco.");
        // Séptimo ejercicio
        System.out.println("7.- Reciba como parámetro dos cadenas y las devuelva concatenadas.");
        // Octavo ejercicio
        System.out.println("8.- Reciba como parámetro una cadena y una vocal, el método sustituye" +
        " todas las vocales de la cadena por la vocal que se ha pasado como parámetro (no" + 
        " devuelve nada).");
        // Noveno ejercicio
        System.out.println("9.- Reciba como parámetro una cadena, y muestre el código ASCII de cada" +
        " uno de los caracteres de la cadena (no devuelve nada el método).");
    }
    public static void mostrarEjercicios(){
        Scanner lector = new Scanner(System.in);
        int opcion = lector.nextInt();
        String basurero = lector.nextLine(); 
        // El String 'basurero' sirve para comerse el retorno de carro (/n) que hace el nextInt()
        switch(opcion){
            case 1:
                System.out.println("<--   Has elegido el ejercicio 1:   -->");
                almacenarNumeros();
                break;
            case 2:
                System.out.println("<--   Has elegido el ejercicio 2:   -->");
                invertirNumeros();
                break;
            case 3:
                System.out.println("<--   Has elegido el ejercicio 3:   -->");
                hacerMedias();
                break;
            case 4:
                System.out.println("<--   Has elegido el ejercicio 4:   -->");
                System.out.println("Escribe un texto y te devolverá el número de carácteres que tiene: ");
                String cadena4 = lector.nextLine();
                devolverCaracteres(cadena4);
                break;
            case 5:
                System.out.println("<--   Has elegido el ejercicio 5:   -->");
                System.out.println("Escribe un texto para invertirlo: ");
                String cadena5 = lector.nextLine();
                invertirCadena(cadena5);
                //devuelve strings
                break;
            case 6:
                System.out.println("<--   Has elegido el ejercicio 6:   -->");
                System.out.println("Escribe un texto para quitarle los espacios: ");
                String cadena6 = lector.nextLine();
                quitarEspacios(cadena6);
                break;
            case 7:
                System.out.println("<--   Has elegido el ejercicio 7:   -->");
                System.out.println("Escribe la primera cadena:");
                String concat1 = lector.nextLine();
                System.out.println("Escribe la segunda cadena: ");
                String concat2 = lector.nextLine();
                concatenarCadenas(concat1, concat2);
                break;
            case 8:
                System.out.println("<--   Has elegido el ejercicio 8:   -->");
                System.out.println("Ahora escribe una cadena y luego una vocal:");
                System.out.printf("Cadena: ");
                String cadena8 = lector.nextLine();
                System.out.printf("Vocal: ");
                String vocal = lector.nextLine();
                sustituirVocal(cadena8, vocal);
                break;
            case 9:
                System.out.println("<--   Has elegido el ejercicio 9:   -->");
                System.out.println("Escribe una cadena:");
                System.out.printf("Cadena: ");
                String cadena9 = lector.nextLine();
                mostrarASCII(cadena9);
                break;
            default:
                System.out.println("Escribe el número correcto del ejercicio que quieras ver.");
                break;
        }
    }
    // PRIMER EJERCICIO 
    public static void almacenarNumeros(){
        Scanner lectorNumeros = new Scanner(System.in);
        int [] mi_array = new int [5];
        int i;
        for(i=0; i<mi_array.length; i++){
            System.out.printf("Introduzca un número %d: ", i+1);
            mi_array[i] = lectorNumeros.nextInt();
        }
        System.out.println("Los números que has puesto són los siguientes:");
        for(i=0; i<mi_array.length; i++){
            System.out.printf("%d - ", mi_array[i]);
        }  
    }
    // SEGUNDO EJERCICIO
    public static void invertirNumeros(){
        Scanner lectorNumeros = new Scanner(System.in);
        int [] mi_array2 = new int [5];
        int i;
        for(i=0; i<mi_array2.length; i++){
            System.out.printf("Introduzca un número %d: ", i+1);
            mi_array2[i] = lectorNumeros.nextInt();
        }
        System.out.println("Los números que has puesto en orden invertidos són los siguientes:");
        for (i = mi_array2.length - 1; i >= 0 ; i--) {
            System.out.printf("%d - ", mi_array2[i]);
        }
    }
    // TERCER EJERCICIO
    public static void hacerMedias(){
        Scanner lectorNumeros = new Scanner(System.in);
        int [] mi_array3 = new int [5];
        int positivos = 0;
        int negativos = 0;
        int mediaPositivos = 0;
        int mediaNegativos = 0;
        int contadorCeros = 0;
        for(int i=0; i<5; i++){
            System.out.printf("Introduce un número %d: ", i+1);
            int numeros = lectorNumeros.nextInt();
            mi_array3[i] = numeros;
        }
        for(int j=0; j<5; j++){
            if(mi_array3[j] > 0){
                positivos++;
                mediaPositivos += mi_array3[j];
            }
            else if(mi_array3[j] < 0){
                negativos++;
                mediaNegativos += mi_array3[j];
            }
            else{
                contadorCeros++;
            }
        }
        mediaPositivos = mediaPositivos / positivos;
        mediaNegativos = mediaNegativos / negativos;

        System.out.println("La media de los números positivos es de un " + mediaPositivos);
        System.out.println("La media de los números negativos es de un " + mediaNegativos);
        System.out.println("Hay " + contadorCeros + " ceros");
        
    }
    // CUARTO EJERCICIO
    public static void devolverCaracteres(String cadena4){
        System.out.println("Has escrito esto: " + cadena4);
        System.out.println("Y tiene " + cadena4.length() + " carácteres");
    }
    // QUINTO EJERCICIO
    public static void invertirCadena(String cadena5){

        StringTokenizer frase = new StringTokenizer(cadena5); // Import arriba --> import java.util.StringTokenizer
        Stack pila = new Stack(); // Import arriba --> import java.util.Stack

        while (frase.hasMoreTokens()) {
            pila.push(frase.nextToken());
        }

        while (!pila.empty()){
            System.out.print(pila.pop() + " ");
        }
    }
    // SEXTO EJERCICIO
    public static void quitarEspacios(String cadena6){
        System.out.println(cadena6.replace(" ",""));
    }
    // SÉPTIMO EJERCICIO
    public static void concatenarCadenas(String concat1, String concat2){
        String cadenaConcatenada = concat1.concat(concat2);
        System.out.println("La cadena concatenada és la sigiente:");
        System.out.println(cadenaConcatenada);
    }
    // OCTAVO EJERCICIO
    public static void sustituirVocal(String cadena8, String vocal){
        String cadenaSustituida = cadena8.replace("a",vocal);
        cadenaSustituida = cadenaSustituida.replace("e",vocal);
        cadenaSustituida = cadenaSustituida.replace("i",vocal);
        cadenaSustituida = cadenaSustituida.replace("o",vocal);
        cadenaSustituida = cadenaSustituida.replace("u",vocal);
        System.out.println(cadenaSustituida);
    }
    // NOVENO EJERCICIO
    public static void mostrarASCII(String cadena9){
        for (int i=0; i<cadena9.length(); i++){
            System.out.println(cadena9.codePointAt(i));
        }
    }
}
