public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        Author author = new Author("Olga Ravn");

        PrintedBook printedBook = new PrintedBook("Celestine", "SKØN", 140, 166);
        AudioBook audioBook = new AudioBook("Celestine", "SKØN", 140, 192);
        PrintedBook pictureBook = new PrintedBook("Muldvarpen", "BI", 50, 32);

        author.addTitle(printedBook);
        author.addTitle(audioBook);
        author.addTitle(pictureBook);

        double royalties = author.calculateRoyalties();
        System.out.println(author.getName() + ": " + royalties + "kr");
    }
}