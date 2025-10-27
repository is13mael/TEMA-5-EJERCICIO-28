public class App {
    public static void main(String[] args) throws Exception {
        try{
        System.out.print("Por favor, introduzca un número entero: ");
        int numero = Integer.parseInt(System.console().readLine());

        long factorial = 1;

        for(int i = 1; i <= numero; i++){
            factorial *=i;
        }
        System.out.println(numero+"! = "+factorial);
    }catch(NumberFormatException e){
        System.out.println("Numero mal introducido.");
    }catch(Exception e){
        System.out.println("Ha ocurrido un error inesperado.");
    }
}
}