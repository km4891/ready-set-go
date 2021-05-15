import java.util.*;

public class midterm {

    public static class Race {

        // A race simulating bot that Implements a Fisher–Yates shuffle
                int[] array = {1, 2, 3, 4};
        // constructor
        
                void Race() {
                }
        // run the imaginary race
        
                void readysetgo() {
                    int n = array.length;
                    Random random = new Random();
        // Loop over array.
                    for (int i = 0; i < array.length; i++) {
        // Get a random index of the array past the current index.
        // ... The argument is an exclusive bound.
        // It will not go past the array's end.
                        int randomValue = i + random.nextInt(n - i);
        // Swap the random element with the present element.
                        int randomElement = array[randomValue];
                        array[randomValue] = array[i];
                        array[i] = randomElement;
                    }
                } // end shuffle
        
                int first() {
                    return array[0];
                }
        
                int second() {
                    return array[1];
                }
        
                int third() {
                    return array[2];
                }
        
                int fourth() {
                    return array[3];
                }
        
                int[] getarray() {
                    return array;
                }
            } // end class
        
            public static void main(String[] args) {
               System.out.println("Welcome to the racetrack");

               Race r = new Race();
               r.readysetgo();
               int selection = 0;
               int cash = 200;
               Scanner input = new Scanner (System.in);
               int x, y, z;
               int youWon = 0;
               int youLost = 0;
               int exactaWin = 100;
               int exactaLost = 10;
               int exactaBoxWin = 50;
               int exactaBoxLost = 5;
               int trifectaWin = 200;
               int trifectaLost = 25;
               int trifectaBoxWin = 150;
               int trifectaBoxLost = 20;

               
              

               do {
                System.out.println("[1]Place an Exacta bet");
                System.out.println("[2]Place an Exactabox bet");
                System.out.println("[3]Place an Trifecta bet");
                System.out.println("[4]Place an Trifectabox bet");
                System.out.println("[5]Check your balance");
                System.out.println("[6]See into the future (cheat sheet)");
                System.out.println("[7]Betting History");
                System.out.println("[8]Exit");


                System.out.print("Make a selection: ");
                selection = input.nextInt();

                switch(selection){
                    case 1:
                   
                    System.out.println("Exacta Bet");
                        x = input.nextInt(); y = input.nextInt();
                            if (x == r.first() && y == r.second()) {
                                cash = Math.abs (cash + exactaWin);
                                youWon++;
                             System.out.println("winner");
                             
                        } else {
                            cash = Math.abs (cash - exactaLost);
                            youLost++;
                            System.out.println("lose");
                        }
                    r.readysetgo();  
                    break;
                    
                    case 2:
                    System.out.println("Exacta Box Bet");
                        x = input.nextInt(); y = input.nextInt();
                        if ( (x == r.first() && y == r.second()) || (x == r.second() && y == r.first()) ) {
                            cash = Math.abs (cash + exactaBoxWin);
                            youWon++;
                            System.out.println("winner");
                        } else {
                            cash = Math.abs (cash - exactaBoxLost);
                            youLost++;
                            System.out.println("lose");
                        }
                    r.readysetgo();
                    break;
                    
                    case 3:
                    System.out.println("Trifecta Bet");
                        x = input.nextInt(); y = input.nextInt(); z = input.nextInt();
                        if (x == r.first() && y == r.second() && z == r.third()) {
                            cash = Math.abs (cash + trifectaWin);
                            youWon++;
                         System.out.println("winner");

                        } else {
                            cash = Math.abs(cash - trifectaLost);
                            youLost++;
                            System.out.println("lose");
                        }
                    r.readysetgo();
                    break;
                    
                    case 4:
                    System.out.println("Trifecta Box Bet");
                        x = input.nextInt(); y = input.nextInt(); z = input.nextInt();
                        if (x != r.fourth() && y != r.fourth() && z != r.fourth()) {
                            cash = Math.abs(cash + trifectaBoxWin);
                            youWon++;
                            System.out.println("win");
                    } else  {
                        cash = Math.abs(cash - trifectaBoxLost);
                        youLost++;
                        System.out.println("lose");
                    }
                    r.readysetgo();
                    break;
                    
                    case 5:
                    System.out.println("Your balance is " + cash);
                    break;
                   
                    case 6:
                    System.out.println("The winners will be " + r.first() + r.second() + r.third() + r.fourth() );
                    break;
                    
                    case 7:
                    System.out.println("You have won " + youWon + " bets. You have lost" + youLost + " bets.");
                    break;
                    
                    case 8:
                    System.out.println("All done");
                    break;
                    default:
                    System.out.println("please select a valid option");
                }
            }while (selection != 8);
               
               
               
                
                
         // Display elements in array using a loop (you can ignore this)
                for (int value : r.getarray()) {
                    System.out.println(value);
                }
        // display the winners using the access methods
        // print out the first place
                System.out.println("First place is " + r.first());
        // print out the second place
                System.out.println("Second place is " + r.second());
        // print out the third place
                System.out.println("Third place is " + r.third());
        // print out the fourth place
                System.out.println("Fourth place is " + r.fourth());
            r.readysetgo();
            }
        
}
    

