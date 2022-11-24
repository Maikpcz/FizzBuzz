public class Testprogramm {
    public static void main(String[] args) {
        System.out.println(stringLongerThenTwenty("testString"));
        //System.out.println(stringFancy("testString"));
        System.out.println(stringFanc("test"));

    }
    public static boolean stringLongerThenTwenty(String testString){
        int stringSize= testString.length();
        System.out.println(stringSize);
        boolean result = stringSize>20 ;
        System.out.println(stringFancy(testString));
        return result ;
    }
    public static boolean stringFancy(String testString){
        boolean result = testString.contains("Fancy");
        return result;
    }
    public static boolean stringFanc(String teststring1){
        boolean result =teststring1.contains("test");
        return result ;
}
