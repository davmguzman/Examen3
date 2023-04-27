
package examen.manuelmontoya;


import java.util.ArrayList;


public class Datos {
    static ArrayList<Integer> codigos = new ArrayList<>();
    static ArrayList<String> descripciones = new ArrayList<>();
    static ArrayList<Integer> cantidades = new ArrayList<>();
    static ArrayList<Integer> precios = new ArrayList<>();
    
    static int activosi, activono;
    static ArrayList<String> tipos = new ArrayList<>();
    
    public static void setActivos(int activosi, int activono) {
    Datos.activosi = activosi;
    Datos.activono = activono;
}
    
static {
    tipos.add("Desechables");
    tipos.add("Mercancías");
    tipos.add("Abarrotes");
    tipos.add("Textil");
}

    public static void setCodigos(ArrayList<Integer> codigos) {
        Datos.codigos = codigos;
    }

    public static void setDescripciones(ArrayList<String> descripciones) {
        Datos.descripciones = descripciones;
    }

    public static void setCantidades(ArrayList<Integer> cantidades) {
        Datos.cantidades = cantidades;
    }

    public static void setPrecios(ArrayList<Integer> precios) {
        Datos.precios = precios;
    }

    public static void setActivosi(int activosi) {
        Datos.activosi = activosi;
    }

    public static void setActivono(int activono) {
        Datos.activono = activono;
    }

    

    
   
   
   public void setinfo(Integer codigo, String descripcion, Integer cantidad, Integer precio) {
        codigos.add(codigo);
        descripciones.add(descripcion);
        cantidades.add(cantidad);
        precios.add(precio);
    }
   
}  
   
   
   
   
   



