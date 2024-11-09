public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Марк", "Цукенберг");
        Author author2 = new Author("Марк", "Цукенберг");
        Book book = new Book("Война и мир", 1966, tolstoy);
        Book book2 = new Book("Тяжко", 2024, author2);
        book.setPublicationYear(2000);
        System.out.println("Год = " + book.getPublicationYear());
        System.out.println("book2 = " + book2.getPublicationYear() + " Название - " + book2.getBookName() + " автор- " + book2.getAuthor());
        System.out.println(book);
        System.out.println(book.equals(book2));
        System.out.println(tolstoy.equals(author2));
        System.out.println(author2);
        System.out.println(book.hashCode());
        System.out.println(tolstoy.hashCode());
    }
}