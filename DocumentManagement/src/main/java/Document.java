public class Document {
    protected String id;
    protected String publisher;
    protected int releaseNumber;

    public Document(String id, String publisher, int releaseNumber) {
        this.id = id;
        this.publisher = publisher;
        this.releaseNumber = releaseNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }
}
