public class Snapshot {
    private Administrator administrator;
    String text;
    Snapshot(String text){
        this.text = text;
    }
    public void restore(){
        administrator.setText(text);
    }
}
