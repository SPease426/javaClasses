package class21;

public abstract class File {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public abstract void open();

    public void edit() {
        System.out.println("File is editing");

    }

    public void close () {
        System.out.println("File is now closed");
    }

}

class JavaFile extends File {

    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("To open a java file must open a notepad++ or sublime txt file");
    }
}

class PdfFile extends File {

    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("To open a PDF must have a pdf reader program or web browser installed");
    }

    public void edit() {
        System.out.println("Editing a PDF File is not possible as it is only a Picture Document File of like a word File document");
    }
}

class WordFile extends File {

    public WordFile(String name, int size) {
        super(name,size);
    }

    @Override
    public void open() {
        System.out.println("To open a word file must have a Microsoft word to be installed");
    }
}