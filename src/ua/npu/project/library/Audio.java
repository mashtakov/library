package ua.npu.project.library;

//Аудио

public class Audio extends Publication{

    protected String format;
    protected double lenght;
    protected int bitrate;

    public Audio(String format, double lenght, int bitrate) {
        this.format = format;
        this.lenght = lenght;
        this.bitrate = bitrate;
    }

    public Audio() {
        this.format = "";
        this.lenght = 0;
        this.bitrate = 0;
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

    public double getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }
}
