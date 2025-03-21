interface Animal{
    void sound();
}
class interface1 {
    void method(){
        Animal animal=new Animal() {
            public void sound(){
                System.out.println("Meow merp miu miu");
            }
        };
        animal.sound();
    }
    public static void main(String[] args) {
        interface1 obj=new interface1();
        obj.method();
    }
}
