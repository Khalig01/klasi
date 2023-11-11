public class Main {
    public static void main(String[] args) {
        Author firstAuthor= new Author("Бенджамин", "Грем");
        Author secondAuthor= new Author("Эдвин", "Лефевр");
        Book firstBook= new Book("Разумный Инвестор", 1949,firstAuthor);
        Book secondBook= new Book("Воспоминания биржевого спекулянта",1923,secondAuthor);
        System.out.println("Книга1");
        System.out.println("Название:"  +firstBook.getBookTitle());
        System.out.println("Автор:"+ firstAuthor.getLastName() + " " + firstAuthor.getLastName());
        System.out.println("Год издания:"+ firstBook.getYearBook());


        System.out.println("Книга2");
        System.out.println("Название:" +secondBook.getBookTitle());
        System.out.println("Автор:"+ secondAuthor.getLastName()+ " " + secondAuthor.getLastName());
        System.out.println("Год издания:"+ secondBook.getYearBook());

        System.out.println( );

        firstBook.setYearBook(2000);
        System.out.println(firstBook.getYearBook());






    }
}