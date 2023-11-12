import java.util.Objects;

public class Book {
    public String bookTitle;
    public int yearBook;
    public  Author author;

    public Book (String bookTitle, int yearBook, Author author) {
        this.bookTitle = bookTitle;
        this.yearBook = yearBook;
        this.author = author;

    }
        public String getBookTitle() {

            return bookTitle;
        }
        public int getYearBook () {

            return yearBook;
        }
        public Author getAuthor () {

            return author;
        }
            public void setYearBook(int yearBook) {
                this.yearBook = yearBook;
            }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", yearBook=" + yearBook +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, yearBook, author);
    }
}














