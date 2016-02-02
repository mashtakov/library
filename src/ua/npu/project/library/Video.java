package ua.npu.project.library;

//Відео


public class Video extends Publication{

    public String format;
    public double lenght;

        public Video(String format, double lenght) {
            this.format = format;
            this.lenght = lenght;
        }

        public Video() {
            this.format = "";
            this.lenght = 0;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public double getLenght() {
            return lenght;
        }

        public void setLenght(double lenght) {
            this.lenght = lenght;
        }
}