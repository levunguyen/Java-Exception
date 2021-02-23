import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void print(){
        print();
    }
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int zero = 0;
            int result = 10 / zero;
            System.out.println("Result " + result);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Đây là khối finally");
        }

        System.out.println("Chương trình kết thúc");

//        FileReader f = new FileReader("Filename.json");
    }
}
