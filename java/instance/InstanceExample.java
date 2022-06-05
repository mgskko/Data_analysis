public class InstanceExample
{
    private String message;

    public InstanceExample(String m){
        setMessage(m);
    }
    public void printHelloworld(){
        System.out.println(message);
    }
    public String getMessage(){
        return message;
    }

    public void setMessage(String m){
        message = m;
    }
    public static void main(String[] args){
        InstanceExample example = new InstanceExample("Hello world!");
        
        example.printHelloworld();
    }
}