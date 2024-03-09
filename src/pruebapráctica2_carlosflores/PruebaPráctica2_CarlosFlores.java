package pruebapráctica2_carlosflores;

import java.util.Scanner;
import static pruebapráctica2_carlosflores.Libro.prestar;
import static pruebapráctica2_carlosflores.Libro.regresar;

public class PruebaPráctica2_CarlosFlores {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Libro libreria [] = new Libro [0];
        boolean var = true;
        int op = 0;
        do{
            System.out.println("1) Agregar Nuevo libro a la biblioteca\n2) Solicitar libro\n3) Regresar libro\n4) Buscar libro por nombre\n5) Listar libros disponibles\n6) Listar libros prestados\n7) Salir");
            op = leer.nextInt();
            switch(op){
                
                case 1:{
                    break;
                }//fin case 1
                
                case 2:{
                    String name = leer.next();
                    int pos = leer.nextInt();
                    prestar(libreria,pos,name);
                    break;
                }//fin case 2
                
                case 3:{
                    int pos = leer.nextInt();
                    regresar(libreria,pos);
                    break;
                }//fin case 3
                
                case 4:{
                    String buscar = leer.next();
                    boolean finded = false;
                    for (int i = 0; i < libreria.length; i++) {
                        if(libreria[i].getNombre().contentEquals(buscar)){
                            System.out.println();
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
                        if(libreria[i].getEstado().contentEquals("disponible")){
                            System.out.println(cont+") "+libreria[i].getNombre());
                            cont++;
                        }
                    }
                    break;
                }//fin case 5
                
                case 6:{
                    int cont = 1;
                    System.out.println("Libros prestado:");
                    for (int i = 0; i < libreria.length; i++) {
                        if(libreria[i].getEstado().contentEquals("prestado")){
                            System.out.println(cont+") "+libreria[i].getNombre());
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
            
        }while (var);//fin do while
        
    }//fin main
    
}//fin class