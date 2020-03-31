package PracOOP;

public class TestBook {
    public static void main(String[] args) {
//        Author[] codeLean = new Author("Code Lean", "codeleanvn@gmail.com", 'f');
//        System.out.println(codeLean);
//
//        Book dummyBook = new Book("Java for dummy", codeLean, 19.95, 99);
//        System.out.println(dummyBook);
//
//        dummyBook.setPrice(29.95);
//        dummyBook.setQty(28);
//        System.out.println("name is : " + dummyBook.getName());
//        System.out.println("price is : " + dummyBook.getPrice());
//        System.out.println("qty is : " + dummyBook.getQty());
//        System.out.println("Author is : " + dummyBook.getAuthor());
//        System.out.println("Author's name is : " + dummyBook.getAuthor().getName());
//        System.out.println("Author's email is : " + dummyBook.getAuthor().getEmail());
//
//        Book anotherBook = new Book("more Java", new Author("Dang Kim Thi", "dangkimthi@gmail.com",'f'),29.95);
//        System.out.println(anotherBook);
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@gmail.com", '1');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'b');
        System.out.println(authors[0]);
        System.out.println(authors[1]);
        Book javadummy  =  new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javadummy);
        System.out.println("Author's name is : " + javadummy.getAuthor()[0].getName());
        System.out.println("Author's name is : " + javadummy.getAuthor()[1].getName());
        System.out.println("Author's name is : " + javadummy.getAuthor()[1].getEmail());
        System.out.println("Author's name is : " + javadummy.getAuthor()[0].getEmail());
        System.out.println("Author's name is : " + javadummy.getAuthor()[0].getGender());
        System.out.println(javadummy.getAuthorName());
}
}
