public class Libro {
    //Se da lugar a los atributos
    public String titulo, autor;
    public int num_paginas;
    public double precio;

    //Se crea un constructor sin parametros
    public Libro(){
        titulo="Desconocido";
        autor="Anonino";
        num_paginas=0;
        precio=0;
    }

    //Se crea un constructor con parametros
    public Libro(String titulo, String autor, int num_paginas, double precio){
        this.titulo=titulo;
        this.autor=autor;
        this.num_paginas=num_paginas;
        this.precio=precio;
    }

    //Se crea un metodo para mostrar los detalles del libro
    public void mostrarInfo(){
        System.out.println("\nTitulo: "+titulo+"\nAutor: "+autor+"\nPaginas: "+num_paginas+"\nPrecio: "+precio+"\n");
    }

    //Se crea un metodo para realizar una factura
    public void facturar(){
        System.out.println("\nTitulo: "+titulo+"\nIva: "+(precio*0.12)+"\nTotal a pagar: "+(precio+(precio*0.12))+"\n");
    }
}
