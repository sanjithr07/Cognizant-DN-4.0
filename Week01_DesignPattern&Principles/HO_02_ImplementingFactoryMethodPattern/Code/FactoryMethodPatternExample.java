
//Product section
interface Document{
    void create();
}

class PdfDocument implements Document{
    public void create(){
        System.out.println("A PDF document has been created.");
    }
}

class WordDocument implements Document{
    public void create(){
        System.out.println("A Word document has been created.");
    }
}

class ExcelDocument implements Document{
    public void create(){
        System.out.println("An Excel document has been created.");
    }
}

//Creator section: Factory
abstract class DocumentFactory {
    abstract Document createDocument();    
}

class PdfDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        System.out.println("DocumentFactory chilld returns pdf object required to create PDF document.");
        return new PdfDocument();
    }
}

class WordDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        System.out.println("DocumentFactory child returns word object required to create Word document.");
        return new WordDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        System.out.println("DocumentFactory child returns excel object required to create Excel document.");
        return new ExcelDocument();
    }
}

//Main class to test the Factory Method Pattern
public class FactoryMethodPatternExample{
    public static void main(String[] args) {
        DocumentFactory pdffactory = new PdfDocumentFactory();
        Document pdf = pdffactory.createDocument();
        pdf.create();
        
        DocumentFactory wordfactory = new WordDocumentFactory();
        Document word = wordfactory.createDocument();
        word.create();

        DocumentFactory excelfactory = new ExcelDocumentFactory();
        Document excel = excelfactory.createDocument();
        excel.create();
    }
}