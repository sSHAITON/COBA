package COBA;

class LibrayItem {
    public String title;
    public int year;
    public String atribut1;
    public int atribut2;

    void displayinfo() {
        System.out.println("================Informasi Perpustakaan================");
        System.out.println("Judul: " + this.title);
        System.out.println("Tahun: " + this.year);
    }

    public void LibraryItem(String title, int year, String atribut1, int atribut2) {
        this.title = title;
        this.year = year;
        this.atribut1 = atribut1;
        this.atribut2 = atribut2;
    }
}

class Book extends LibrayItem {
    public String Author;
    public int ISBN;

    public Book(String title, int year, String Author, int ISBN) {
        this.Author = Author;
        this.ISBN = ISBN;
        super.LibraryItem(title, year, this.Author, this.ISBN);
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Author: " + this.Author);
        System.out.println("ISBN: " + this.ISBN);

    }

}

class DigitalMedia extends LibrayItem {
    public String Format;
    public int Size;

    public DigitalMedia(String title, int year, String Format, int Size) {
        this.Format = Format;
        ;
        this.Size = Size;
        super.LibraryItem(title, year, Format, Size);
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Format: " + Format);
        System.out.println("Size: " + Size + "MB");
    }
}

public class latihan1 {
    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Java", 2007, "Satriatama Putra", 12345678);
        DigitalMedia media1 = new DigitalMedia("Tutorial JavaFX", 2010, "Video", 30);

        book1.displayinfo();
        media1.displayinfo();
    }
}
