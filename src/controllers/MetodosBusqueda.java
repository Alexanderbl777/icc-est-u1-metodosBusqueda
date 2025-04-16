package controllers;

import java.util.ArrayList;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {
    
    private ShowConsole showConsole;
    private Persona[] people;
    

    public MetodosBusqueda(Persona[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        showPerson();
    }


    public int busquedaLineal(int[] arreglo, int indice, int valorBuscado) {
        if (indice >= arreglo.length) {
            return -1;
        }
        if (arreglo[indice] == valorBuscado) {
            return indice;
        }
        return busquedaLineal(arreglo, indice + 1, valorBuscado); 
    }
    public int findPersonByCode(int code){
        for(int i=0; i<people.length; i++){
            if(people[i].getCode()==code){

                return i;
            }
        }

        return -1;
    }
    public void showPerson(){
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson >= 0){
            showConsole.showMesagge("Persona con codigo "+codeToFind+" Encontrada");
            showConsole.showMesagge(people[indexPerson].toString());
        }else{
            showConsole.showMesagge("Persona no encontrada");
        }
    }
    public int findPersonByName(){

        return -1;
    }
    public void showPersonByName(){

    }
}
