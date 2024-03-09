package pruebapráctica2_carlosflores;


public class Libro {
    
    public String Nombre;
    public String Autor;
    public int ID;
    public String estado;
    public String dueño;

    public Libro(String Nombre, String Autor, int ID, String estado, String dueño) {
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.ID = ID;
        this.estado = estado;
        this.dueño = dueño;
    }

    public static void prestar(Libro libros [], int pos, String name){
        if(libros[pos].getEstado().contentEquals("disponible")){
            libros[pos].setEstado("prestado");
            libros[pos].setDueño(name);
        }else{
            System.out.println("El libro no esta disponible, esta prestado");
        }
    }
    
    public static void regresar(Libro libros [], int pos){
        if(libros[pos].getEstado().contentEquals("prestado")){
            libros[pos].setEstado("disponible");
            libros[pos].setDueño("");
        }else{
            System.out.println("El libro no esta prestado, esta disponible");
        }
    }
    
    public String toString(){
        return "Nombre: " + Nombre + "Autor: " + Autor + ", ID: " + ID + "Estado: " + estado + "Dueño: "+ dueño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    
    
    
}
