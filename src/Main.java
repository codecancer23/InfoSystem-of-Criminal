public class Main {
    public static void main(String[] args) {
        String name = "Criminale";
        InformSystem informSystem = InformSystem.getInstance(name);
        InformSystem informSystem1 = InformSystem.getInstance("namess");

       // informSystem.getName();
       //informSystem1.getName();
        /*InquiryExemption inquiryExemption = new InquiryExemption();
        Investigator investigator = new AdditionalInfo(inquiryExemption);
        ((AdditionalInfo) investigator).GiveInfo();*/
        System.out.println("status = true");
        Investigator investigator = new Investigator(true);
        System.out.println("\nstatus = false");
        Investigator investigator1 = new Investigator(false);

    }

}
