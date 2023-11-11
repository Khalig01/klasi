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
        }











