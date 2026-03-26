public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        Author author = new Author("Olga Ravn");

        // Printed bog
        PrintedBook printedBook = new PrintedBook("Celestine", "SKØN", 140, 166);
        author.addTitle(printedBook);

        // Lydbog
        AudioBook audioBook = new AudioBook("Celestine", "SKØN", 140, 192); // 3 timer 12 min = 192 min
        author.addTitle(audioBook);

        // Endnu en bog
        PrintedBook pictureBook = new PrintedBook("Muldvarpen", "BI", 50, 32);
        author.addTitle(pictureBook);

        double royalties = author.calculateRoyalties();
        System.out.println(author.getName() + ": " + royalties + "kr");
    }
}