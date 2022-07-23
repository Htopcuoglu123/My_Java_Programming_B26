package day58_exceptions;

public class TryWithInheritance {
    public static void main(String[] args) {
        try{

        }catch(IndexOutOfBoundsException e){//Syntax go from more specific to more general

        }catch(RuntimeException e){//more general

        } catch(Exception e){//most general

        }
        /*
        possible references for IndexOutOfBoundsException
        IndexOutOfBoundsException obj=new IndexOutOfBoundsException();
        RunTimeException obj=new IndexOutOfBoundsException();
        Exception obj=new IndexOutOfBoundsException();

         */
    }
}
