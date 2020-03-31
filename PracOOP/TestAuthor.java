package PracOOP;

public class TestAuthor {
    public static void main(String[] args) {
        Author codelean = new Author("Code lean", "codeleanvn@gmail.com", 'm');
        System.out.println(codelean);

        codelean.setEmail("codelean@gmail.com");
        System.out.println("name is : " + codelean.getName());
        System.out.println("email is : " + codelean.getEmail());
        System.out.println("gender is : " + codelean.getGender());
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@gmail.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        System.out.println(authors[0]);
        System.out.println(authors[1]);
    }
}
