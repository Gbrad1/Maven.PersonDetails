package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {

        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int i = 0;
        // while `counter` is less than length of array
        while (i < personArray.length)
            // begin loop
        {
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[i];
            // get `string Representation` of `currentPerson`
            String newString = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result += newString;
            // end loop
            i++;
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        for (int i = 0; i < personArray.length; i++)
        // use the above clauses to declare for-loop signature
            // begin loop
        {
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[i];
            // get `string Representation` of `currentPerson`
            String newString = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result += newString;
            // end loop
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        int i = 0;
        // use the above discoveries to declare for-each-loop signature
        for (Person currentPerson : personArray)
            // begin loop
        {
            // get `string Representation` of `currentPerson`
            String yoy = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            // end loop
            result += yoy;
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
