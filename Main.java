public class Main {
    public static void main(String[] args) {
        char[] sourcearray={
            'a','b','c','d','e','f','g','h','i','j','k','l','m'
        };
        char[] endarray=new char[6];
        System.arraycopy(sourcearray,4,endarray,0,6);
         System.out.println(new String(endarray));
     }

}
