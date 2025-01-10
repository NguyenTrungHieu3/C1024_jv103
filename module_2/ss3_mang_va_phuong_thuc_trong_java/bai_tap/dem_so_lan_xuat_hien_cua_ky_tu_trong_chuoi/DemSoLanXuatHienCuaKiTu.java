import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Thân em vừa trắng lại vừa tròn\n" +
                "Bảy nổi ba chìm với nước non\n" +
                "Rắn nát mặc dầu tay kẻ nặn\n" +
                "Mà em vẫn giữ tấm lòng son";

        System.out.println("Enter a character want to count: ");
        String countChar = sc.nextLine();

        if (countChar.length() != 1) {
            System.out.println("You must enter exactly one character!");
            return;
        }

        char characterToCount = countChar.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == characterToCount) {
                count++;
            }
        }

        System.out.println("The number of character '" + characterToCount + "' in the string is " + count);
    }
}
