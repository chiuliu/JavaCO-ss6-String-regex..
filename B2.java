public class B2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("aka");
        str.append(" 4-7 silver");
        System.out.println("Dùng phương thức nối chuối append:" +str);
        StringBuffer str2 = str.insert(2,"kaka");
        System.out.println("Dùng chèn insert : " +str2);
        System.out.println(str);
        System.out.println("Dùng thay thế kí tự replace()" +str.replace(1,3,"lenka"));
        System.out.println("Dùng xóa chuỗi:  " + str.delete(1,6));
        System.out.println("Đảo ngược : " + str.reverse());


    }
}
