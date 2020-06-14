public class InquiryStatChange implements Inquiries{
    int IDInquiry;
    int susID;
    int investID;
    int numberOfCase;
    boolean criminal = true;
    @Override
    public void setIDInquiry(int IDInquiry) {
        this.IDInquiry = IDInquiry;
    }

    @Override
    public void setNumberOfCase(int numberOfCase) {
        this.numberOfCase = numberOfCase;
    }

    @Override
    public void setSusID(int susID) {
        this.susID = susID;
    }

    @Override
    public void setInvestID(int investID) {
        this.investID = investID;
    }

    @Override
    public void Out() {
        System.out.println("Status has changes");
    }
}
