package cat.itacademy.barcelonactiva.gispert.judith.s05.t02.n01.f1.exceptions;

public class RepeatedValueException extends RuntimeException{
    public RepeatedValueException (String errorMessage){
        super (errorMessage);
    }
}