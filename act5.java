import java.util.ArrayList;

public class act5 {
    public static void main(String[] args) {
       
        // Crear un arreglo de nombres
        String[] nombres = {"Juan", "María", "Carlos", "Ana", "Luis"};

        // Utilizando el bucle for-each para recorrer el arreglo
        System.out.println("\n UTILIZO LA LISTA DE NOMBRES CARGADOS PARA LA CREACION DE SALUDOS PERSONALIZADOS");
        for (String nombre : nombres) {
            System.out.println("Hola, " + nombre + "!");
        }
    }
}
