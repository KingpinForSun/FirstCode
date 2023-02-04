package wrapper;

public class WrapperType {
    public static void main(String[] args) {
//        String str = "sda-sd";
        Integer i = 100;
        String s = i + "";
        String s1 = i.toString();
        String s2 = String.valueOf(i);

        String str = "123";
        int i1 = Integer.parseInt(str);
//        Integer integer = new Integer(str);
        System.out.println("ok");
    }
}
