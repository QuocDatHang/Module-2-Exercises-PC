public class Journal extends Document {
    int issueNumber;
    int monthIssue;

    public Journal(String id, String publisher, int releaseNumber, int issueNumber, int monthIssue) {
        super(id, publisher, releaseNumber);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }
    @Override
    public String toString() {
        return "Journal {"
                + "id = " + id + " | "
                + "publisher = " + publisher + " | "
                + "releaseNumber = " + releaseNumber + " | "
                + "issueNumber = " + issueNumber + " | "
                + "monthIssue = " + monthIssue + "}";
    }
}
