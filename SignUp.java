import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        Scanner scanner = new Scanner(System.in);
        //Los datos que debes pedir al usuario son:
        //1. Nombre
        System.out.println("Enter your Name:");
        String name = scanner.nextLine();
        //2. Apellido
        System.out.println("Enter your Surname:");
        String surname = scanner.nextLine();
        //3. Nombre de usuario
        System.out.println("Enter your User Name:");
        String userName = scanner.nextLine();
        //4. Contraseña
        System.out.println("Enter your Password:");
        String password = scanner.nextLine();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        System.out.println("Hola " + name + " " + surname + ", tu nombre de usuario es " + userName + " y tu contraseña es " + password + ", gracias por registrarte.");
        //Añade una nueva línea antes de mostrar la respuesta
        scanner.close();
    }
}