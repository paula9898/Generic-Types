package pl.paulina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenericsTests {

    @Test
    void shouldReturnEmptyTest()
    {
        //given
        MyOptional<String> emptyValue;

        //when

        emptyValue = MyOptional.empty();
        boolean isValuePresent = emptyValue.isPresent();

        //then
        assertFalse(isValuePresent);

    }

    @Test

    void isPresentTest()
    {
        //given
        String name = "Paulina";
        MyOptional<String> optValue = MyOptional.ofNullable(name);

        //when

        optValue.isPresent();

        //then


    }







}
