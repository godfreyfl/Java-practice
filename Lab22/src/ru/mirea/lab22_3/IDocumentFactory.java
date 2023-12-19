package ru.mirea.lab22_3;

public interface IDocumentFactory {
    IDocument createNewDocument();
    IDocument openExistingDocument(String info);
}
