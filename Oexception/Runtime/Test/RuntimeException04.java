package DevDojoExercicios.Oexception.Runtime.Test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeException04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro da RuntimeException");
        }
        try{
            talvezLanceExcepetion();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    private static void talvezLanceExcepetion() throws SQLException, FileNotFoundException{

    }
}
