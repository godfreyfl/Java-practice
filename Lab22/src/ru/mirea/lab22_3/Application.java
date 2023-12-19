package ru.mirea.lab22_3;

// Объявление класса Application
public class Application {

    // Метод main, точка входа в приложение
    public static void main(String[] args) {
        // Создание экземпляров фабрик для текстовых, музыкальных и изображений документов
        IDocumentFactory textFactory = new TextDocumentFactory();
        IDocumentFactory musicFactory = new MusicDocumentFactory();
        IDocumentFactory imageFactory = new ImageDocumentFactory();

        // Создание приложений для каждой фабрики, создание, установка информации и сохранение документов
        Application textApp = new Application(textFactory);
        textApp.createNewDocument();
        textApp.setDocumentInfo("Test Text Document");
        textApp.saveDocument();

        Application musicApp = new Application(musicFactory);
        musicApp.createNewDocument();
        musicApp.setDocumentInfo("Test Music Document");
        musicApp.saveDocument();

        Application imageApp = new Application(imageFactory);
        imageApp.createNewDocument();
        imageApp.setDocumentInfo("Test Image Document");
        imageApp.saveDocument();
    }

    // Приватные поля класса
    private IDocumentFactory documentFactory;
    private IDocument document;

    // Конструктор класса, принимающий фабрику документов
    public Application(IDocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    // Метод для создания нового документа
    public void createNewDocument() {
        document = documentFactory.createNewDocument();
        document.newFile();
    }

    // Метод для открытия существующего документа
    public void openExistingDocument(String info) {
        document = documentFactory.openExistingDocument(info);
        document.openFile();
    }

    // Метод для сохранения документа
    public void saveDocument() {
        // Проверка наличия документа перед сохранением
        if (document != null) {
            document.saveFile();
        } else {
            System.out.println("No document to save");
        }
    }

    // Метод для установки информации о документе
    public void setDocumentInfo(String info) {
        // Проверка наличия документа перед установкой информации
        if (document != null) {
            document.setInfo(info);
        } else {
            System.out.println("No document to set info");
        }
    }

    // Метод для получения информации о документе
    public String getDocumentInfo() {
        // Проверка наличия документа перед получением информации
        if (document != null) {
            return document.getInfo();
        } else {
            System.out.println("No document to get info from");
            return null;
        }
    }
}
