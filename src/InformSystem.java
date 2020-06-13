public final class InformSystem {
    private static InformSystem instance;
    String name;
    public static InformSystem getInstance(String name) {
            if (instance == null) {
                instance = new InformSystem(name);
            }
            return instance;
    }
    private InformSystem(String name){
        this.name = name;
    }
    

    public void getName() {
        System.out.println(name);
    }

    public void ChangeSusStat(){}
    public void Trearment(){}
    public void SusCheck(){}
    public void SusExemption(){}
    
}
