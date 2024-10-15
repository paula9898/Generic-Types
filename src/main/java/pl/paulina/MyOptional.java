package pl.paulina;

import java.util.Optional;

public class MyOptional <T>{

    private T value;

    private MyOptional(T value) {
        this.value = value;
    }

    public static <T>  MyOptional<T> empty(){

        return new MyOptional<>(null);
    }

    public boolean isPresent() {

        return value != null;
    }

    public static <T> MyOptional<T> ofNullable(T value)
    {
        if(value == null)
        {
            return new MyOptional<>(null);
        }

        return new MyOptional<T>(value);

    }

    //public MyOptional<T> get ()
    //{



    //}

}
