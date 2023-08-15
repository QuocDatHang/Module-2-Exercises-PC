import java.time.LocalDate;

public class Newspaper extends Document {
    LocalDate dayIssue;

    public Newspaper(String id, String publisher, int releaseNumber, LocalDate dayIssue) {
        super(id, publisher, releaseNumber);
        this.dayIssue = dayIssue;
    }

    public LocalDate getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(LocalDate dayIssue) {
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
