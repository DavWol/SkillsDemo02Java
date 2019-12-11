import java.util.Scanner;

public class SkillsDemo02 {
    static int count = 0;
    static final int MAX = 3;

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] films = new String[MAX];

        while(true){
            System.out.println("***Welcome to my Favourite Films***");
            System.out.println();
            System.out.println("Please select one of the following");
            System.out.println("1. Add a Film Title to the list");
            System.out.println("2. Delete a Film Title from the list");
            System.out.println("3. Check if a Film Title is on the list");
            System.out.println("4. View all Film Titles on the list");
            System.out.println();
            System.out.println("0. Exit");
            System.out.println();

            int option = sc.nextInt();

            if (option == 0){
                System.out.println("Thank you for using our system");
                break;
            }
            else if (option == 1){
                System.out.println("Please enter film to add");
                String film = sc.nextLine();
                boolean found = false;
                for(String f : films){
                    if(f.equalsIgnoreCase(film)){
                        System.out.println("Film is already there");
                        found = true;
                        break;
                    }
                }
                if(found){
                    if(count == MAX){
                        System.out.println("Sorry, the film store is full");
                    }
                }
            }
            else if (option == 2){
                boolean found = false;
                System.out.println("Please enter a film to delete");
                for(int i = 0; i < count; i ++){
                    if(found){
                        int j=i;
                                for(; j<count-1; j++){
                                    films[j] = films[j+1];
                                }
                                films[j] = "";
                        System.out.println("The film has been deleted");
                        found = true;

                    }
                }
                if(found){
                    count--;
                }
                else{
                    System.out.println("The film was not in the list to be deleted");
                }

                }
            else if (option == 3){
                System.out.println("Please enter a film to search for");
            }
            else if (option == 4){

            }
            else{
                System.out.println("You entered invalid option");
                sc.nextLine();

            }


        }

    }
}
