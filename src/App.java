public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca un número entero: ");
        int numero = Integer.parseInt(System.console().readLine());

        long factorial = 1;

        for(int i = 1; i <= numero; i++){
            factorial *=i;
        }
        System.out.println(numero+"! = "+factorial);
    }
}
