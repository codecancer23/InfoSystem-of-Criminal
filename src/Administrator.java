public class Administrator {
    private String text;
    public void setText(String text){
        this.text = text;
    }
    public Snapshot createSnapshot(){
        return new Snapshot(text);
    }
}
