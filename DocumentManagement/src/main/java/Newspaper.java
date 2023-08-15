public class Newspaper extends Document {
    int dayIssue;

    public Newspaper(String id, String publisher, int releaseNumber, int dayIssue) {
        super(id, publisher, releaseNumber);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }
    @Override
    public String toString() {
        return "Journal {"
                + "id = " + id + " | "
                + "publisher = " + publisher + " | "
                + "releaseNumber = " + releaseNumber + " | "
                + "dayIssue = " + dayIssue + "} ";
    }
}
