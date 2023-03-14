package day30exceptionsinterface;

public class InvalidNumberException extends RuntimeException{
    //Urettigimiz exception'i run time exception olmasini istiyorsak parent'i RunTimeException yap
    public InvalidNumberException(String message){

        super(message);


    }


}
