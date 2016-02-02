package ua.npu.project.library;

import java.util.ArrayList;

//Читальний зал
/*
Властивості:
Кількість місць
Методи:
Дати читачу номер його місця, якщо є вільне місце. Якщо вільних місць немає, повернути -1
 */
public class ReadingRoom {

    public ArrayList<Reader>list;

    public ReadingRoom(ArrayList<Reader> list) {
        this.list = list;
    }

    public ReadingRoom() {
        list = new ArrayList<>();
    }

    public void addReader(Reader r) {
        list.add(r);
    }

}
