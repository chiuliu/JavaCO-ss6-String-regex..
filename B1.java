import java.util.Arrays;

public class B1 {
    public static void main(String[] args) {
        String str = "Rikkei Academy";
        String str2 = "Rikkei Academy";
        String str3 = "Rikkeisoft";
        String str4 = "RiKKei AcaDEMy";
        String str5 = "AA , BB , CC ,DA";
        String str6 = "Ri";
        System.out.println("Kiểm tra chuỗi rỗng dùng isEmty: " + str.isEmpty());
        System.out.println("Lọại bỏ khoảng trắng: " +str.trim());
        System.out.println("So sánh chuỗi dùng equals() : " + str.equals(str2) );
        System.out.println("So sách chuỗi dùng equalslgnoreCase() : " + str.equalsIgnoreCase(str4));
        System.out.println("Tách chuỗi dùng split() : " + Arrays.toString( str5.split(",",3))  );
        System.out.println("Gộp chuỗi dùng concat() : " + str.concat(str2));
        System.out.println("Kiểm tra chuỗi S1 chứa S2 không dùng contain():" + str.contains(str6) );
        System.out.println(str3.toUpperCase());
        System.out.println("Dùng thay thế chuỗi cũ thành chuỗi mới: " + str.replace("demy", "AK4-7"));









    }
}
