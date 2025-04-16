package controllers;
import models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinario {
private Persona[] people;
private ShowConsole pantalla;

    public MetodosBusquedaBinario(Persona[] people) {
        this.people = people;
        this.pantalla = new ShowConsole();
        pantalla.showMesagge("Metodo de busqueda binario");
    }

    private int findPersonByCode(int code){
        int bajo=0;
        int alto=people.length-1;

        while(alto>=bajo){

            int central = (alto+bajo)/2;
            if(people[central].getCode()==code){

                return central;
            }
            if(people[central].getCode()>code){

                alto = central -1;//izq
            }else{
                bajo=central+1;//der
            }
        }
        return -1;
    }

    public void shpwPersonByName(){
        int codeToFind= pantalla.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson == -1){
            pantalla.showMesagge("Persona con codigo "+codeToFind+(" no encontrada"));
        }else{
            pantalla.showMesagge("Persona con codigo "+codeToFind+(" encontrada"));
            pantalla.showMesagge(people[indexPerson].toString());
        }
    }
    public void metodoOrdenamiento(Persona[] personas) {
        int tam = personas.length;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                if (personas[j].getName().compareToIgnoreCase(personas[j + 1].getName()) > 0) {
                    Persona aux = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = aux; 
                }
            }
        }
    }

    public void showPersonByName() {
        metodoOrdenamiento(people);

        String nameToFind = pantalla.inputName();
        int index = findPersonByName(nameToFind);

        if (index == -1) {
            pantalla.showMesagge("Persona con nombre '" + nameToFind + "' no encontrada");
        } else {
            pantalla.showMesagge("Persona con nombre '" + nameToFind + "' encontrada");
            pantalla.showMesagge(people[index].toString());
        }
    }

    public int findPersonByName(String nameToFind) {
        int bajo = 0;
        int alto = people.length - 1;

        while (bajo <= alto) {
            int central = (bajo + alto) / 2;
            String currentName = people[central].getName();

            int comparison = currentName.compareToIgnoreCase(nameToFind);

            if (comparison == 0) {
                return central;
            } else if (comparison > 0) {
                alto = central - 1;
            } else {
                bajo = central + 1;
            }
        }

        return -1;
    }

    
}
