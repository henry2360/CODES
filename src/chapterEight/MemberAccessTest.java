package chapterEight;

public class MemberAccessTest {

    public void memberStuff(){
        MemberAcess.getName();
    }







    public static void main(String[] args) {
        MemberAcess access = new MemberAcess();
        MemberAcess secondAccess = new MemberAcess();
        access.setName("Obi");
        secondAccess.setName("Kalu");
        System.out.println(access.getName());
        System.out.println(secondAccess.getName());
    }
}
