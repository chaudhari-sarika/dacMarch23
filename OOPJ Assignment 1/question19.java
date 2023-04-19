/*Write a program to perform below operations on long type to 
get: 
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long*/


class Question19{
    public static void main(String args[]){
       // long = 1234567890;
        System.out.println("long Bits : "+ Long.SIZE);
        System.out.println("long Bytes : "+ Long.BYTES);
        System.out.println("long Maximun vlaue : "+ Long.MAX_VALUE);
        System.out.println("long MINIMUM VALUE : "+ Long.MIN_VALUE);
        System.out.println("longTYPE : "+ Long.TYPE);
    }
}