public class ObjectMethods {
    public static void main(String[] args) {
        ObjectMethods obj1=new ObjectMethods();//object 1 created
        ObjectMethods obj2=new ObjectMethods();//object 2 created
        
        boolean equal=obj1.equals(obj2);//check obj1 equals to obj2?
        System.out.println("Is obj1 == obj2?: "+equal);

        Class<?> obj1Class=obj1.getClass();//.getClass() gets the class of the object.Here obj1's class
        System.out.println("Class of the object obj1 is: "+obj1Class.getName());

        String obj1String=obj1.toString();//converts the object to a string
        System.out.println("String representation of obj1 object: "+obj1String);

        int obj1HashCode=obj1.hashCode();//gets the hash code of the object
        System.out.println("Hash Code of the object obj1: "+obj1HashCode);

        try{
            ObjectMethods clonedobj1=(ObjectMethods)obj1.clone();//clones the object to another object
            System.out.println("Object cloned successfully!");
        }catch(Exception e){
            System.out.println("Can't clone obj1 to clonedobj1");
        }
    }
}
