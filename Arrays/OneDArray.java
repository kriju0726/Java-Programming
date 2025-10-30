/*import java.util.*;

class OneDArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println("Fixed Size...");
        for (int i=0; i<nums.length; i++) {  System.out.print(nums[i] + " ");  }

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nNow.. Dynamic Size Array...");
        System.out.print("Enter new array size: ");
        int size = sc.nextInt();

        int[] pnums = new int[size];

        System.out.printf("Please!! Enter %d elements:\n", size);
        for (int i = 0; i < size; i++) {   pnums[i] = sc.nextInt();    }

        System.out.print("Your entered elements are: ");
        for (int i = 0; i < pnums.length; i++) {
            System.out.print(pnums[i] + " ");
        }

        sc.close(); // ✅ good practice
    }
}*/



//Another Approach using Collections(or nCopies)

import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.print("We are playing with ArrayList in java., like Vector in Cpp\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Array Size...: ");
        int size = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>(size);
        
        System.out.printf("Please enter %d elements., for your Array...\n", size);
        
        for(int i=0; i<size; i++){ nums.add(sc.nextInt()); }
        
        System.out.print("\nYour entered elements are...: ");
        for(int p : nums){ System.out.print(p + " ");   }
        
        
        
    System.out.println("\n\nNow, We use another way to declare array(1D)..");
    System.out.print("Please Enter 2nd Array Size...: ");
        int psize = sc.nextInt();
       ArrayList<Integer> pnums = new ArrayList<>(Collections.nCopies(psize, 0));
       //for(int p : pnums) { System.out.print(p + " "); }
       
       System.out.printf("Please enter %d elements., for your 2nd Array..: ", psize);
        for(int i=0; i<psize; i++){ 
            //pnums.add(sc.nextInt());
            pnums.set(i, sc.nextInt());
            }
            
        System.out.print("\nYour entered elements are(of second Array)...: ");
        for(int p : pnums){ System.out.print(p + " ");   }
        
    }
}