public class PredefinedMethod{
    public static void main(String[] args) {
        String str1="java is fun to learn",str2="JAVA",str3="java",str4="Hello Java";
        System.out.println("Checking length: "+str1.length());
        char[] charArray=str3.toCharArray();
        System.out.println("Size of character array: "+charArray.length);
        System.out.println("Printing the last element of the array: "+charArray[charArray.length-1]);
    }
}