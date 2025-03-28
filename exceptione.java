public class exceptione {
    static void validate(int num) throws Exception{
        if(num<0){
            throw new Exception("Number cant be -ve");
        }
    }
    public static void main(String[] args) {
        validate(-2);
    }
}
