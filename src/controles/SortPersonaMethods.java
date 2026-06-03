package controles;

import models.Persona;

public class SortPersonaMethods {

    public void insertionSort(Persona[] personas){
        
        for (int i = 1; i< personas.length; i++){
            Persona actual = personas[i];
            int j = i-1;

            while(j >= 0 && personas[j].getCriterioOrdenamiento()> actual.getCriterioOrdenamiento()){

                personas [j+1] = personas[j];
                j--;


            }
            personas[j+1] = actual;
        }

    }
    public void quickSort(Persona[] personas, int inicio, int fin) {
    if (inicio < fin) {
        int indicePivote = particionar(personas, inicio, fin);
        quickSort(personas, inicio, indicePivote - 1);
        quickSort(personas, indicePivote + 1, fin);
        }
    }

    private int particionar(Persona[] personas, int inicio, int fin) {
        Persona pivote = personas[inicio + (fin - inicio) / 2];
    
    int i = inicio - 1;
    int j = fin + 1;

    while (true) {
        do {
            i++;
        } while (personas[i].getCriterioOrdenamiento() < pivote.getCriterioOrdenamiento());

        do {
            j--;
        } while (personas[j].getCriterioOrdenamiento() > pivote.getCriterioOrdenamiento());

        if (i >= j) {
            return j;
        }
        intercambiar(personas, i, j);
    }

 
    }

    private void intercambiar(Persona[] personas, int i, int j) {
    Persona aux = personas[i];
    personas[i] = personas[j];
    personas[j] = aux;
    }

}
