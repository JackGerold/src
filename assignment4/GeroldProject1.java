package assignment4;

public class GeroldProject1 {


    /* Student1 or S1 opens every locker
     Student2 or S2 closes every other locker starting at Locker 2
     Student3 or S3 changes every 3 locker starting at Locker 3 *closes if open/ opens if closed
     Student4 or s4 starts at locker 4 changes every 4th locker
     continues up to 100
    */ 
	

    public static void main(String[] args) {

        boolean[] lockers = new boolean[100];
//start the boolean array for lockers
        for (int student = 1; student <= 100; student++) {
            shuffle(lockers, student);
        }
        display(lockers);
    }

    public static void shuffle(boolean[] lockersOpenState,  int start) {
//start the lockers in open state, because of first student
        int nextLocker = start;
        for (int i = start - 1; i < lockersOpenState.length; i += nextLocker) {
                lockersOpenState[i] = !lockersOpenState[i];

        }
    }


    public static void display(boolean[] lockers) {

        int lockerCount = 0;
        for (int i = 0; i < lockers.length; i++) {
//keep going until done
            if (lockers[i]) {
            	//print out the open lockers with newline between \n
                System.out.printf("Locker %d is open. \n", i+1);
                lockerCount++;
                if (lockerCount % 10 == 0) System.out.println("");
            }


        }

    }


}