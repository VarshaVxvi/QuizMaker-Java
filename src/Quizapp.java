import java.util.*;

class Quizapp{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       QuizSystem q = new QuizSystem();
       while(true){
       System.out.println("Welcome to quiz maker app");
       System.out.println("1.PostQuiz\n2.Attend Quiz\n3.Exit");
       int choice = sc.nextInt();

           switch (choice) {
               case 1:
                   q.postQuiz();
                   break;
               case 2:
                   q.attendQuiz();
                   break;
               case 3:
                   System.out.println("Exiting...");
                   return;
           }
       }
   }

}