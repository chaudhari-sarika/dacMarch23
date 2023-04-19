/*Write a program to perform below operations on Boolean type to 
convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.

*/

class Question6{
    public static void main(String args[]){
       boolean b =true ;
       String s = Boolean.toString( b ) ;
       System.out.println("New string value is : " + s);

       Boolean B = new Boolean ("true");
       System.out.println("New Boolean instance value is : " + B);
         //Boolean.valueOf();
         
       String S ="true";
       boolean ab= Boolean.parseBoolean(S);
       System.out.println("new boleean valu is ::"+S);

       Boolean B1 = new Boolean (S);
       System.out.println("String to boolean instance value is : " + B1);


    }
}
