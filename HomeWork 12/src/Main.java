public class Main {
    public static void main(String[] args) {
        Author georgeOrwell = new Author("George", "Orwell");
        Book bookOfOrwell = new Book("1984", georgeOrwell, 1949);
        bookOfOrwell.setYearOfPublication(1948);

        Author stanislawLem = new Author("Stanislaw", "Lem");
        Book theInvincible = new Book("The Invincible", stanislawLem, 1964);

        Author palahniuk = new Author("Chuck", "Palahniuk");
        Author palahniuk1 = new Author("Chuck", "Palahniuk");
        Book haunted = new Book("Haunted", palahniuk, 2005);

        System.out.println(bookOfOrwell);
        System.out.println("\n" + theInvincible);
        System.out.println("\n" + haunted);
        System.out.println("\n" + palahniuk1.equals(stanislawLem));
        System.out.println("\n" + palahniuk1.equals(palahniuk));
    }
}