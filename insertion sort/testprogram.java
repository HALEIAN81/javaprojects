import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;

public class testprogram {
    
    public static void main(String args[])
    {
        LinkedList<String> myList = new LinkedList<>(); //default constructor

        myList.add("Abra"); //inserting value
        myList.add("Cadab");
        myList.add(1, "Ra");

        Collection<String> secondList = new ArrayList<String>(); //merge with another ordered list
        secondList.add("Take");
        secondList.add("that");
        secondList.add("Voldemort");

        myList.addAll(secondList); //merge with another ordered list

        LinkedList thirdList = new LinkedList(); //add copy or clone
        thirdList = (LinkedList) myList.clone();

        System.out.println(myList);
        System.out.println("MyList linked elements are : " + myList); //list of elements
        System.out.println("The size of myList is: " + myList.size()); //return number of elements, determine if empty not 0;
        System.out.println("First element is : " + myList.getFirst()); //access to first element
        System.out.println("Last element is : " + myList.getLast()); //access to last element
        System.out.println("Our new linked list is: " + myList);//show merged lists
        System.out.println("Third linked list is: " + thirdList); //show copied list
        System.out.println("The removed front value is : " + myList.remove(0)); //remove value at front
        System.out.println("The removed last value is : " + myList.removeLast()); //remove value at last point
    }
}
