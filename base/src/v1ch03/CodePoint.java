package v1ch03;

public class CodePoint
{
    public static void main(String[] Args)
    {
        String str="hello";
        int n=str.length();
        System.out.println(n);

        int m=str.codePointCount(0,str.length());
        System.out.println(m);


        String hello = "hi𝕆";
        System.out.println(hello.length());//4
        System.out.println(hello.codePointCount(0, hello.length()));//3

        System.out.println("*****************");
        int length = hello.length();
        for(int i=0;i<length;i++) {
            char charAt = hello.charAt(i);
            System.out.println(Integer.toHexString(charAt));
        }
        System.out.println("*****************");
        int codePointCount = hello.codePointCount(0, length);
        for(int i=0;i<codePointCount;i++) {
            int charAt = hello.codePointAt(i);
            System.out.println(Integer.toHexString(charAt));
        }

    }
}
