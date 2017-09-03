public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("X"));
        bookShelf.appendBook(new Book("Y"));
        bookShelf.appendBook(new Book("Z"));
        bookShelf.appendBook(new Book("K"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
