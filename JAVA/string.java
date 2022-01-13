public class string {
    public static void main (String args[]){
        String name1 = " Ranjan ";
        String name2 = " Ranjan ";

        String name3 = new String(" Ranjan ");
        String name4 = new String(" Ranjan ");

        System.out.println(name1.equals(name2)); //compare text
        System.out.println(name1==name2); //compare object
        System.out.println(name2.equals(name3)); //compare text
        System.out.println(name2==name3); // compare object
        System.out.println(name3==name4); //compare object




    }
}
