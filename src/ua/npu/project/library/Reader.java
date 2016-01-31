package ua.npu.project.library;

//Читач

public class Reader {
    protected String name;
    protected int id;
    static int lastID = 0;

    public Reader(String name) {
        this.name = name;
        this.id = lastID + 1;
        lastID++;
    }

    public Reader() {
        String name = new String();
        new Reader(name); //Навіщо тут "new"?
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
