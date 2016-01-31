package ua.npu.project.library;

import java.util.ArrayList;

//Бібліотека

public class Library {
    //Властивості обʼєкта "Бібліотека"
    public ArrayList<ReadingRoom> rooms;
    public ArrayList<Publication> gives;
    public CardIndex cardIndex;

    /*Конструктор бібліотеки, що приймає три параметри:
     1)список кімнат
     2)список видань
     3)картотека (одна, не список! в бібліотеці ж одна картотека?
      */
    public Library(ArrayList<ReadingRoom> rooms, ArrayList<Publication> gives, CardIndex cardIndex) {
        this.rooms = rooms;
        this.gives = gives;
        this.cardIndex = cardIndex;
    }

    /*
     Конструктор бібліотеки, що нічого не приймає (тобто пустий)
     Параметри "список кімнат", "список видань" і "картотека" - пусті
    */
    public Library() {
        this.rooms = new ArrayList<ReadingRoom>();
        this.gives = new ArrayList<Publication>();
        this.cardIndex = new CardIndex();
    }
    public void AddPublication(Publication publication){
        cardIndex.AddPublication(publication);
}

    public ArrayList<ReadingRoom> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<ReadingRoom> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Publication> getGives() {
        return gives;
    }

    public void setGives(ArrayList<Publication> gives) {
        this.gives = gives;
    }

    public CardIndex getCardIndex() {
        return cardIndex;
        }

    public void setCardIndex(CardIndex cardIndex) {
        this.cardIndex = cardIndex;
    }
}
