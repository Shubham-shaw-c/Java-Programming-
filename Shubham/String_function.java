package Shubham;

public class String_function {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        String name="Shubham";
        String name1="Hi";
        String name2=name+name1;                                             //CONCANTENATE
        String name3 =name+" and "+name1;                                   //CONCANTENATE
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name.charAt(5));                            //charAt() (returns index position value or string)
        System.out.println(name.length());                                  //length() (returns the length of the string
        System.out.println(name.substring(0,4));        /*substring() (returns the value or string in the
                                                                            given index(a,b) {a is starting index and b is ending index*/
    }
}