public class Book extends Document {
    String authorName;
    int numberPaper;

    public Book(String id, String publisher, int releaseNumber, String authorName, int numberPaper) {
        super(id, publisher, releaseNumber);
        this.authorName = authorName;
        this.numberPaper = numberPaper;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberPaper() {
        return numberPaper;
    }

    public void setNumberPaper(int numberPaper) {
        this.numberPaper = numberPaper;
    }
    public String toString(){
        return "Book {"
                + "id = " + id + " | "
                + "publisher = " + publisher + " | "
                + "releaseNumber = " + releaseNumber + " | "
                + "authorName = " + authorName + " | "
                + "numberPaper = " + numberPaper + "}";
    }
}
