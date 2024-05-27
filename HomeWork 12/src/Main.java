public class Main {
    public static void main(String[] args) {
        Author georgeOrwell = new Author("George", "Orwell");
        Book bookOfOrwell = new Book("1984", georgeOrwell, 1949);
        System.out.println( bookOfOrwell.getTitle() + " " + bookOfOrwell.getAuthor().getFirstName()
                + " " + bookOfOrwell.getAuthor().getLastName() + " " + bookOfOrwell.getYearOfPublication());
        bookOfOrwell.setYearOfPublication(1948);
        System.out.println( "\n" + bookOfOrwell.getTitle() + " " + bookOfOrwell.getAuthor().getFirstName()
                + " " + bookOfOrwell.getAuthor().getLastName() + " " + bookOfOrwell.getYearOfPublication());

        Author stanislawLem = new Author("Stanislaw", "Lem");
        Book theInvincible = new Book("The Invincible", stanislawLem, 1964);
        System.out.println( "\n" + theInvincible.getTitle() + " " + theInvincible.getAuthor().getFirstName()
                + " " + theInvincible.getAuthor().getLastName() + " " + theInvincible.getYearOfPublication());
    }
}