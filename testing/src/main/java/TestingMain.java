public class TestingMain {
    public static void main(String[] args) {
        Member member = new Member("Mysterious Member", 999);

        String checkName = member.getMemberName();
        int checknumber = member.getMemberNumber();

        if (checkName.equals("Mysterious Member") && checknumber==999){
            System.out.println("test OK");
        } else {
            System.out.println("error!");
        }
    }
}
