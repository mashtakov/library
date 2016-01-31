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
    protected final int capacity;
    protected ArrayList<Reader> users;
    static int occupied = 0;
    public ReadingRoom(int capacity) {
        this.capacity = capacity;
        this.users = new ArrayList<Reader>();
    }

    public ReadingRoom() {
        this.capacity = 0;
        this.users = new ArrayList<Reader>();
    }

    public int getCapacity() {
        return capacity;
    }
    
/* Константа
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
*/

    public ArrayList<Reader> getUsers() {
        return users;
    }

/*
    public void setUsers(ArrayList<Reader> users) {
        this.users = users;
    }
*/

    public boolean addUser(Reader reader){
        if(occupied < capacity){
            occupied++;
            this.users.add(reader);
            return true;
        }
        else
            return false;

    }
    
    public void removeUser(Reader reader){
        this.users.remove(reader);
        occupied--;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i=0; i < users.size() ; i++) {
            result = result + users.get(i).toString();
            }
        return result;
        }

}
