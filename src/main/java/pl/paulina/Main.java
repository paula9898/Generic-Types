package pl.paulina;


import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<String> optionalOne = Optional.empty();
        System.out.println(optionalOne.isPresent());

        MyOptional<String> myOptionalTwo = MyOptional.empty();
        System.out.println(myOptionalTwo.isPresent());

    }
}