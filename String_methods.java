public class String_methods {
    public static void main(String[] args) {
        String NewEmptyString= new String();
        String LiteralEmptyString="";
        String NewEmptyString1= new String();
        String LiteralEmptyString1="";
        if(NewEmptyString==LiteralEmptyString){
            System.out.println("Both strings declared using new and literal method are equal");
        }
        if(NewEmptyString!=LiteralEmptyString) System.out.println("Strings declared using new and literal metodsa aren't equal");
         if(NewEmptyString1==NewEmptyString)System.out.println("Strings declared using new methods are equal");
         if(NewEmptyString!=NewEmptyString1)System.out.println("Strings declared using new methods are not equal");
         if(LiteralEmptyString==LiteralEmptyString1)System.out.println("Strings declared using Literal method are equal");
    }
}
