import java.util.Scanner;
public class ejecutable {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int[] listaUsuarios;
        int[] listaLibros;
        String checkUsuario;
        String checkPassword;

        //codigos de los libros y los usuarios en array
        //GENERAR LIBROS Y USUARIO

        System.out.println("Introduzca su nombre de usuario:");
        checkUsuario = sc.nextLine();
        if (checkUsuario != listaUsuarios) {
        System.out.println("Usuario no reconocido");
        }
        //if ((nomUsuario no está registrado) plantear un error;
        System.out.println("Introduzca su contraseña:");
        //if (contraseña es incorrecta plantear volver al login de usuario o volver a intentar);

        /**EL SWITCH PARA PODER REALIZAR LAS FUNCIONES ES EN ESENCIA EL MISMO PERO
         * SI ERES ADMIN TE SALDRÁN OPCIONES EXTRA QUE PUEDE REALIZAR EL ADMIN.
         * 
         * if (booleanAdmin = false) {
         * switchBase
         * } else {
         * switchAdmin (switchBase + funcionesAdmin)
         * }*/
          
           
        
    }
}
