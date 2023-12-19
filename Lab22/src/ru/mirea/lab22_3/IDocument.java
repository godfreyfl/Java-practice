package ru.mirea.lab22_3;

public interface IDocument {
    void openFile();
    void newFile();
    void saveFile();
    String getInfo();
    void setInfo(String info);
}
