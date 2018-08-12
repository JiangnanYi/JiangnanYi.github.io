public class equals {
    public static void main(String[] args) {
        String a = new String("aaa"); // a 为一个引用
         String b = new String("aaa"); // b为另一个引用,对象的内容一样
         String aa = "aaa"; // 放在常量池中
         String bb = "aaa"; // 从常量池中查找
         if (aa == bb) // true
                 System.out.println("aa==bb");
         if (a == b) // false，a和b非同一对象
                  System.out.println("a==b");
          if (a.equals(b)) // true
                  System.out.println("a==b");
    }
}
