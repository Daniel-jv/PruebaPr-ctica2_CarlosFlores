package pruebapráctica2_carlosflores;

import java.util.Random;
import java.util.Scanner;
import static pruebapráctica2_carlosflores.Libro.prestar;
import static pruebapráctica2_carlosflores.Libro.regresar;

public class PruebaPráctica2_CarlosFlores {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int libros = 0;
        Libro libreria [] = new Libro[10];
        agregarlibro(libreria,libros);
        listarlibros(libreria);
        boolean var = true;
        int op = 0;
        do{
            System.out.print("---MENU---\n1) Agregar Nuevo libro a la biblioteca\n2) Solicitar libro\n3) Regresar libro\n4) Buscar libro por nombre\n5) Listar libros disponibles\n6) Listar libros prestados\n7) Salir\nIngrese una opcion:");
            op = leer.nextInt();
            
            switch(op){
                
                case 1:{
                    agregarlibro(libreria,libros);
                    break;
                }//fin case 1
                
                case 2:{
                    System.out.print("Ingrese su nombre");
                    String name = leer.next();
                    System.out.print("Ingrese la posicion del libro: ");
                    int pos = leer.nextInt();
                    prestar(libreria,pos,name);
                    break;
                }//fin case 2
                
                case 3:{
                    System.out.print("Ingrese la posicion del libro: ");
                    int pos = leer.nextInt();
                    regresar(libreria,pos);
                    break;
                }//fin case 3
                
                case 4:{
                    System.out.print("Ingrese el nombre del libro: ");
                    String buscar = leer.next();
                    boolean finded = false;
                    for (int i = 0; i < libreria.length; i++) {
                        if(libreria[i] == null){
                        
                        }else if(libreria[i].getNombre().contentEquals(buscar)){
                            System.out.println(libreria[i]);
                            finded = true;
                        }
                    }
                    if(finded == false){
                        System.out.println("No se encontro el libro");
                    }
                    break;
                }//fin case 4
                
                case 5:{
                    int cont = 1;
                    System.out.println("Libros disponibles:");
                    for (int i = 0; i < libreria.length; i++) {
                        if(libreria[i] == null){
                        
                        }else if(libreria[i].getEstado().contentEquals("disponible")){
                            System.out.println(cont+") "+libreria[i]);
                            cont++;
                        }
                    }
                    break;
                }//fin case 5
                
                case 6:{
                    int cont = 1;
                    System.out.println("Libros prestado:");
                    for (int i = 0; i < libreria.length; i++) {
                        if(libreria[i] == null){
                        
                        }else if(libreria[i].getEstado().contentEquals("prestado")){
                            System.out.println(cont+") "+libreria[i]);
                            cont++;
                        }
                    }
                    break;
                }//fin case 6
                
                case 7:{
                    System.out.println("Ha salido de la libreria, nos vemos");
                    var = false;
                    break;
                }//fin case 7
                
                default:{
                    System.out.println("opcion no valida");
                    break;
                }//fin default
                
            }//fin switch
            System.out.println("\n");
        }while (var);//fin do while
        
    }//fin main
    
   public static void agregarlibro(Libro libreria [], int libros){
        Random rand = new Random();
        System.out.println("Vamos a agregar un nuevo libro...");
        System.out.print("Ingrese el nombre: ");
        leer.next();
        String name = leer.nextLine();
        System.out.print("Ingrese el autor: ");
        String autor = leer.nextLine();
        int ID = rand.nextInt(1000-100+1)+100;
        String estado = "disponible";
        String dueño = "N/A";
        Libro nuevolibro = new Libro(name,autor,ID,estado,dueño);
        libreria[libros] = nuevolibro;
   } 
   
   public static void listarlibros(Libro [] libros){
       System.out.println("LIBROS:");
        for (int i = 0; i < libros.length; i++) {
            System.out.println(i+1+ ")" + libros[i]);
        }
    }//fin listarPersonas

   
}//fin class