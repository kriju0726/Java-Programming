public class VariablesDemo {
    int instanceVar = 10;

    static String staticVar = "i am static variable";

    public void showVariables(){
        int localVar = 5;
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);    
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args){
        VariablesDemo obj1 = new VariablesDemo();
        obj1.showVariables();

        System.out.println("Accessing static variable via class: " + staticVar);  
        System.out.println("Accessing instance variable via class: " + obj1.instanceVar); 
        System.out.println("Accessing local variable via class: " + "Not possible, local variables are only accessible within their method.");                        
    }
}
