/*Write a program to perform below operations on char type to 
get:
a. The number of bits used to represent a char value
b. The number of bytes used to represent a char value
c. The minimum value a char
d. The maximum value a char
*/


class Question10{
    public static void main(String args[]){
        System.out.println("CHAR BIT size :"+Character.SIZE);
        System.out.println("CHAR Byte size :"+Character.BYTES);
        
        System.out.println("CHAR maxval :"+(int) Character.MAX_VALUE);
        System.out.println("CHAR minval :"+ (int)Character.MIN_VALUE);
        System.out.println("CHAR type :"+ Character.TYPE);
    }
} 