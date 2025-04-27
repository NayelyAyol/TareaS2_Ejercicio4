public class Main {
    public static void main(String[] args) {
        //Se crea una instancia con un constructor sin parametros
        Libro libro1=new Libro();
        //Se crea otra instancia con un constructor con parametros
        Libro libro2=new Libro("Donde viven las musas","Mariela de dos Santos",215,27.50);

        //Se llama al primer metodo creado
        System.out.println("\n-------LIBROS EN STOCK-------");
        libro1.mostrarInfo();
        System.out.println("------------------------------");
        libro2.mostrarInfo();

        //Se llama al segundo metodo creado
        System.out.println("-----------FACTURA------------");
        libro1.facturar();
        System.out.println("------------------------------");
        libro2.facturar();
    }
}