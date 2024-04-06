//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a Screen Match!");
        System.out.println("Pelicula: MATRIX");

        int fechaDeLanzamiento = 1999;
        //boolean incluidoEnElPlan = true;
        double notaDeLaPelicula1 = 8.2;
        double notaDeLaPelicula2 = 7;
        double notaDeLaPelicula3 = 9.5;

        double media = (notaDeLaPelicula1 + notaDeLaPelicula2 + notaDeLaPelicula3)/3;

        System.out.println(media);

        //Text Block
        String sinopsis= """
                Matrix es una paradoja
                La pelicula mas disruptiva de la epoca
                Fue lanzada en:\s
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);
        String duracion = "2 horas";
        if (duracion.equals("2 horas")){
            System.out.println("Muy larga la pelicula");
        } else {
            System.out.println("Muy corta");
        }
        //Formato de textos
        String nombre = "Cristian";
        int edad = 38;
        double dinero = 75.7856;
        String mensaje = String.format("Hola! mi nombres es %s, tengo %d años y tengo $%.1f dolares", nombre, edad, dinero);
        System.out.println(mensaje);

        int clasificacion = (int) (notaDeLaPelicula3/2);
        System.out.println("La pelicula esta clasificada con " +clasificacion + " estrellas.");













//        //Operadores
//
//        //Operadores de asignación:
//        int valor =  5;  //Atribuye el valor 5 a la variable valor
//        //Operadores de asignación combinados:
//        int valor =  10;
//        valor += 15;  //Equivalente al valor = valor + 15, atribuye el valor 15 a la variable valor
//        //Operadores aritméticos:
//        int a = 10 + 5; // Atribuye el valor 15 a la variable a
//        int b = 10 - 5; // Atribuye el valor 5 a la variable b
//        int c = 10 * 5; // Atribuye el valor 50 a la variable c
//        int d = 10 / 5; // Atribuye el valor 2 a la variable d
//        int e = 10 % 3; // Atribuye el valor 1 a la variable ya que (el resto de la divición de 10 por 3 es 1)
//        //Operadores relacionales:
//        int a = 10; // Atribui o valor 10 à variável a
//        int b = 5; // Atribui o valor 5 à variável b
//        int c = 30; // Atribui o valor 30 à variável c
//
//        boolean igual = (b == a); //En este caso la variable igual quedará con valor *false, pues el el valor de b no es igual al valor de a.
//
//        boolean diferente = (b != c); //La variable diferente quedará con el valor de *true*, pues el valor de b es diferente del valor de c.
//        boolean mayor= (b > a); //la variable mayor quedará con el valor *false*, pues el valor de b es menor que el valor de a.
//
//        boolean menorIgual = (b <= c); //La variable menor igual quedará con el valor de *true*, pues el valor de b es menor que el valor de c.
//        //Operadores lógicos:
//        //AND (&&)
//        boolean a = true;
//        boolean b = false;
//        if (a && b) {
//            // Este código no será ejecutado, ya que a es verdadero y b es falso
//        }
//        // OR (||)
//        boolean a = true;
//        boolean b = false;
//        if (a || b) {
//            //Este código será ejecutado, ya que a es verdadero aunque b sea falso
//        }
//        //NOT (!)
//        boolean a = true;
//        if (!a) {
//            // Este código no será ejecutado, ya que a es verdadero
//        }
//        //Operadores de incremento
//        //pre-incremento (++variable)
//        int num = 5;
//        int resultado = ++num; //num es incrementado para 6 e después es atribuido al resultado
//        System.out.println(num); // imprime 6
//        System.out.println(resultado); // imprime 6
//        //post-incremento (variable++)
//        int num = 5;
//        int resultado = num++; //num es atribuido primero a la variable resultado y depués es incrementado para 6
//        System.out.println(num); // imprime 6
//        System.out.println(resultado); // imprime







    }
}