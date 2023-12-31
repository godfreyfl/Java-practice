package ru.mirea.lab22_3;

public class MusicDocumentFactory implements IDocumentFactory {

    @Override
    public IDocument createNewDocument() {
        return new MusicDocument();
    }

    @Override
    public IDocument openExistingDocument(String info) {
        MusicDocument document = new MusicDocument();
        document.setInfo(info);
        return document;
    }
}
