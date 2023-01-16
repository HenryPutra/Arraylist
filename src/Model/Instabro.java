package Model;
import java.util.ArrayList;

public class Instabro {
    private String UserId;
    private String UserName;
    private String FullName;
    private ArrayList<String> Snap;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public ArrayList<String> getSnap() {
        return Snap;
    }

    public void setSnap(ArrayList<String> snap) {
        Snap = snap;
    }



    public Instabro(){
        System.out.println("Constructor tanpa parameter...");
    }
    public Instabro(String id, String usr, String name, ArrayList<String>snap){
        this.UserId=id;
        this.UserName=usr;
        this.FullName=name;
        this.Snap=snap;

    }

    public static void main(String[] args) {
        Instabro user1 = new Instabro();
        user1.setUserId("001");
        user1.setUserName("@Bagong");
        user1.setFullName("ABC");

        ArrayList<String> postingan = new ArrayList<>();
        postingan.add("halo ");
        postingan.add("yuhuu ");
        postingan.add("balik kuy");

        user1.setSnap(postingan);

        //mengambil value dari entity dari object
        System.out.println(user1.getUserId());
        System.out.println(user1.getUserName());
        System.out.println(user1.getFullName());
        System.out.println("Snaps Are : ");
        //for(int i=0,i<postingan.size();int i++){
        for(String p : postingan){
            System.out.println(p);
        }
    }

}
