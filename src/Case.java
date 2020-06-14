public class Case {
    private Snapshot snapshot;
     public void makeBackup(Administrator administrator){
        snapshot = administrator.createSnapshot();
     }
     public void undo(){
         if(snapshot != null){
             snapshot.restore();
         }
     }

}
