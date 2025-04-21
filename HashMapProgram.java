import java.util.HashMap;

public class HashMapProgram {
    public static void main(String[] args) {
        HashMap<Integer,String>employees=new HashMap<>();
        employees.put(100,"Dog");
        employees.put(101, "Car");
        employees.put(103,"Bombordilo Crocodilo");
        System.out.println("Employee with id 100: "+employees.get(100));
        employees.remove(101);
        System.out.println(employees);
        for(var entry:employees.entrySet()){//.entrySet to deal with both key and Value pairs
            System.out.println("ID: "+entry.getKey()+"\t\tName: "+entry.getValue());
        }
        var str=10;
        System.out.println(str);
    }
}
