package class21;

public class FileTester {

    public static void main(String[] args) {
        File[] arr = {new JavaFile("JavaFile.java", 8000), new WordFile("Word.doc", 4000), new PdfFile("PDF.file", 9000)};

        for(File f: arr) {
            f.open();
            f.edit();
            f.close();
        }
    }
}
