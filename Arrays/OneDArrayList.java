import java.util.*;
//dafsfggh

class OneDArrayList {
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