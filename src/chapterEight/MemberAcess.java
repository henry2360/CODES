package chapterEight;

public class MemberAcess {
    private static String kolo;

    public static void setName(String newName){
        kolo = newName;
     String lastName = getName();
    }

    public  static String getName() {
        setName("Kalu");
        kolo = "Sunday";
        return kolo;

    }

}
