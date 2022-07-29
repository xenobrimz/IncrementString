public class IncrementString {
    public static void main(String[] args) throws Exception {
        System.out.println(incrementString("abc"));
    }
    
    public static String incrementString(String string){
        String newString = "";
        for(int i=1;i<=5;i++){
            newString += string + i;
        }
        return newString;
    }
}
