public class Investigator {
    protected Inquiries inquiries;

    Investigator(Inquiries inquiries){
        this.inquiries = inquiries;
    }
    public String InputNewData(){
        return "Data";
    }
    public void Registration(){}
    public void Authentication(){}

    public void Out(Inquiries inquiries){
        inquiries.Out();
    }
    Investigator(boolean status){
        if(status){
            inquiries = new InquiryStatChange();
            inquiries.Out();
        }
        else{
            inquiries = new InquiryExemption();
            inquiries.Out();
        }

    }


}
