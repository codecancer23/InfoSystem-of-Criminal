public class Main {
    public static void main(String[] args) {
        String name = "Criminale";
        InformSystem informSystem = InformSystem.getInstance(name);
        InformSystem informSystem1 = InformSystem.getInstance("namess");

       // informSystem.getName();
       //informSystem1.getName();
        InquiryExemption inquiryExemption = new InquiryExemption();
        Investigator investigator = new AdditionalInfo(inquiryExemption);
        ((AdditionalInfo) investigator).GiveInfo();

    }

}
