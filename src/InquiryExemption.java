public class InquiryExemption implements Inquiries {
    int IDInquiry;
    int susID;
    int investID;
    int numberOfCase;
    boolean criminal = false;
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
}
