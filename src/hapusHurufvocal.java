public class hapusHurufvocal {
    public static String RemoveHrufVocal(String Kalimat){
        String[] h = Kalimat.split(" ");
        char[] kata = new char[Kalimat.length()];
        for (char index = 0; index < Kalimat.length(); index++){
            kata[index] = Character.valueOf(kata[index]);
        }

        return Kalimat.replaceAll("(?i)[a i u e o]"," ");

    }
    public static void main(String[] args) {
        System.out.println(RemoveHrufVocal("Kemarin saya pergi ke pasar"));
    }
}
