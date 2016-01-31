package ua.npu.project.library;

//Картотека
//Список всіх книг, що зареєстровані в бібліотеці

import java.util.ArrayList;

public class CardIndex {
    protected ArrayList<Publication> listOfPublicatios;

    public CardIndex() {
        listOfPublicatios = new ArrayList<Publication>();
    }

    public void AddPublication(Publication publication){
        listOfPublicatios.add(publication);
    }

    public void removePublication(Publication publication) {
        listOfPublicatios.remove(publication);
    }

    @Override
    public String toString() {
            String result = "";
            for(int i=0; i < listOfPublicatios.size() ; i++) {
                result = result + listOfPublicatios.get(i).toString();
            }
            return result;
    }
}
