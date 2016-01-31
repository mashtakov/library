package ua.npu.project.library;

//Газета


public class Magazine extends Publication {
    public int pages;

    public Magazine(int pages) {
        this.pages = pages;
    }

    public Magazine(String name, int year, String autor, int pages) {
        super(name, year, autor);
        this.pages = pages;
    }

    public Magazine() {
        this.pages = 0;
    }

    public Magazine(String name, int year, String autor) {
        super(name, year, autor);
        this.pages = 0;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
