/*Accept character from command line and perform below 
operations. Here you can use charAt() method to extract 
character:
a. Check whether entered character is letter or digit. If it 
is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? 
If it is in lowercase then convert it into upper case and 
print it well as its code point. If it is in uppercase 
then convert it into lower case and print it well as its 
code point.
*/

class Question11{
    public static void main(String[] args){
        String s = new String(args[0]);
        char ch = s.charAt(0);
        

        if(Character.isDigit(ch)){
            System.out.println("entered character is digit " +ch);
        }
        else{
            if(Character.isLowerCase(ch)){
                System.out.println("lowercase convert into uppercase " + Character.toUpperCase(ch));
            }
            else{
                System.out.println(" uppercase convert into lowercase " + Character.toLowerCase(ch));
            }
            

        }

    }
    

}