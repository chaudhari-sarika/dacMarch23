/*15. Write a program to perform below operations on int type to 
get:
a. The number of bits used to represent a integer value
c. The minimum value a integer
d. The maximum value a integer
*/


class Question15 {
    public static void main(String[] args) {
        
        System.out.println("The number of bits used to represent a int value : "+Integer.SIZE);
        System.out.println(" The number of bytes used to represent a int value : "+Integer.BYTES);
        System.out.println("The minimum value a int : "+Integer.MIN_VALUE);
        System.out.println("The maximum value a int : "+Integer.MAX_VALUE);
    }
    
}