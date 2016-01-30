package ua.npu.project.library;

import java.util.ArrayList;

//Бібліотека

public class Library {
    public ArrayList<ReadingRoom> rooms;
    public ArrayList<Publication> publications;
    public CardIndex cardIndex;

    public Library(ArrayList<ReadingRoom> rooms, ArrayList<Publication> publications, CardIndex cardIndex) {
        this.rooms = rooms;
        this.publications = publications;
        this.cardIndex = cardIndex;
    }

    public Library() {
        this.rooms = new ArrayList<ReadingRoom>();
        this.publications = new ArrayList<Publication>();
        this.cardIndex = new CardIndex();
    }
    public void AddPublication(Publication publication){
        cardIndex.addPublication(publication);
}

    public ArrayList<ReadingRoom> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<ReadingRoom> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Publication> getPublications() {
        return publications;
    }

    public void setPublications(ArrayList<Publication> publications) {
        this.publications = publications;
    }

    public CardIndex getCardIndex() {
        return cardIndex;
    }

    public void setCardIndex(CardIndex cardIndex) {
        this.cardIndex = cardIndex;
    }
}
