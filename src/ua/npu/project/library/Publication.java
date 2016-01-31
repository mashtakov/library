package ua.npu.project.library;

//Видання

public abstract class Publication {
    protected String name;
    protected int year;
    protected String autor;

    public Publication() {
        this.name = "";
        this.year = 0;
        this.autor = "";
    }

    public Publication(String name, int year, String autor) {
        this.name = name;
        this.year = year;
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", autor='" + autor + '\'' +
                '}';
    }
}
