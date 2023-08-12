package bookItem;

public class Book {
        private String title;
        private String author;
        private byte ISBN;

        public Book() {
            author = "unnamed";
            title = "have no title";
            ISBN = 0;
        }

    public Book(String title, String author, byte ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
            return title;
        }
        public String getAuthor() {
            return author;
        }
        public byte getISBN() {
            return ISBN;
        }

        public void setTitle(String title) {
            this.title = title;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public void setISBN(byte isbn) {
            this.ISBN = isbn;
        }
}
