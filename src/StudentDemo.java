import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Student myGrade = new Student();
        int choice;

        do {
            System.out.println("Press 1 to change your name  \nPress 2 to change concept test 1 "+
                    "\nPress 3 to change programming test 1 \nPress 4 to change concept test 2 " +
                            "\nPress 5 to change programming test 2 \nPress 6 to change concept final " +
                            "\nPress 7 to change programming final  \nPress 8 to view all your grades " +
                    "\nPress 9 to end the program");
            choice = keyboard.nextInt();

            if (choice == 1){
                System.out.println("What is your name?");
                String newName = keyboard.next();
                myGrade.setName(newName);

            }
            else if (choice ==2){
                System.out.println("What is your score for concept test 1?");
                double newConceptTest1 = keyboard.nextDouble();
                myGrade.setConcept1(newConceptTest1);

            }
            else if (choice ==3){
                System.out.println("What is your score for programming test 1?");
                double newProgrammingTest1 = keyboard.nextDouble();
                myGrade.setProgramming1(newProgrammingTest1);

            }  else if (choice ==4){
                System.out.println("What is your score for concept test 2?");
                double newConceptTest2 = keyboard.nextDouble();
                myGrade.setConcept2(newConceptTest2);

            }  else if (choice ==5){
                System.out.println("What is your score for programming test 2?");
                double newProgrammingTest2 = keyboard.nextDouble();
                myGrade.setProgramming2(newProgrammingTest2);

            }
            else if (choice ==6){
                System.out.println("What is your score for concept final?");
                double newConceptFinalTest = keyboard.nextDouble();
                myGrade.setConceptfinal(newConceptFinalTest);

            }
            else if (choice ==7){
                System.out.println("What is your score for programming final?");
                double newProgrammingFinalTest = keyboard.nextDouble();
                myGrade.setProgrammingfinal(newProgrammingFinalTest);

            }

            else if (choice == 8){
                System.out.println(myGrade.getName());
                System.out.println(myGrade.getConcept1());
                System.out.println(myGrade.getConcept2());
                System.out.println(myGrade.getProgramming1());
                System.out.println(myGrade.getProgramming2());
                System.out.println(myGrade.getConceptfinal());
                System.out.println(myGrade.getProgrammingfinal());


            }
            else if (choice == 9){
                System.out.println("Goodbye");
            }
            else
                System.out.println("Error!");


        } while (choice !=9);
    }
}
