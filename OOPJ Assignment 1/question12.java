/*Write a program to perform below operations on short type to 
get:
a. The number of bits used to represent a short value
b. The number of bytes used to represent a short value
c. The minimum value a short
d. The maximum value a short
*/


    class Question12{
        public static void main(String args[]){
            System.out.println("BIT size :"+Short.SIZE);
            System.out.println("SHORT Byte size :"+Short.BYTES);
            System.out.println("SHORT maxval :"+Short.MAX_VALUE);
            System.out.println("SHORT minval :"+Short.MIN_VALUE);
            System.out.println("SHORT type:"+Short.TYPE);
        }
    } 