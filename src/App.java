import java.util.concurrent.Callable;

import controles.SortPersonaMethods;
import models.Persona;
import models.Resultado;
import utils.Benchmarking;

public class App {
    public static void main(String[] args) throws Exception {

        SortPersonaMethods metodos = new SortPersonaMethods();

        int[] pruebas = {10000, 50000, 100000};

        for (int size : pruebas) {
            ejecutarEscenarioDesordenado(size, metodos);
            ejecutarEscenarioCasiOrdenado(size, metodos);
        }
    }

    public static void ejecutarEscenarioDesordenado( int size, SortPersonaMethods metodos){

        Persona[] personita = generarPersonas(size);
        Persona[] copiaInsertion = personita.clone();
        Persona[] copiaQuickSort = personita.clone();

        Callable<Void> insertion = () -> {
            metodos.insertionSort(copiaInsertion);
            return null;
        };

        Callable<Void> quick = () -> {

            metodos.quickSort(copiaQuickSort, 0, copiaQuickSort.length -1);//1, 2, 3, 4, 5, 
            return null;
        };

        Resultado  resultado_1 = Benchmarking.medirTiempo(insertion , "Insertion", "Esta Desordenado", size);
        Resultado resultado_2 = Benchmarking.medirTiempo(quick, "QuickSort", "Desordenado", size);
        System.out.println(resultado_1);
        System.out.println(resultado_2);

    }
    public static void ejecutarEscenarioCasiOrdenado(int size, SortPersonaMethods metodos ){
        Persona[] personaOriginal = generarPersonas(size);
        Persona[] persona = new Persona[personaOriginal.length+1];
        System.arraycopy(personaOriginal, 0, persona, 0, personaOriginal.length);

        Persona personaNueva = new Persona( "Juanita", 9);
        persona[persona.length - 1] = personaNueva;

        metodos.quickSort(persona, 0, persona.length - 1);
        desordenarUnPoco(persona);
        Persona[] copiaInsertion_1 = persona.clone();
        Persona[] copiaQuickSort_1= persona.clone();

        Callable<Void> insertion = () -> {
            metodos.insertionSort(copiaInsertion_1);
            return null;
        };

        Callable<Void> quick = () -> {

            metodos.quickSort(copiaQuickSort_1, 0, copiaQuickSort_1.length -1);//1, 2, 3, 4, 5, 
            return null;
        };

        Resultado  resultado_1 = Benchmarking.medirTiempo(insertion , "Insertion", "Esta casi ordenado", size);
        Resultado resultado_2 = Benchmarking.medirTiempo(quick, "QuickSort", "Casi Ordenado", size);
        System.out.println(resultado_1);
        System.out.println(resultado_2);



    }
    
    public static void desordenarUnPoco(Persona[] persona){
        int porcentajeAlterar = 0;
        int intercambio = (persona.length * porcentajeAlterar/100);
        for(int i = 0; i<intercambio; i++){
            int indice = (int ) (Math.random() * persona.length);
            int indice_1 = (int ) (Math.random() * persona.length);

            Persona aux = persona[indice];
            persona[indice] = persona[indice_1];
            persona[indice_1] = aux;



        }
    }
    



    public static Persona[] generarPersonas(int cantidad) {
    Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona " + (i + 1);
            int edad = (int) (Math.random() * 101);
            personas[i] = new Persona(nombre, edad);
        }

    return personas;
    
    }



}
