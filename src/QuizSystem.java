import java.util.*;
class QuizSystem{
    List<Questions> questions = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void postQuiz(){
        System.out.println("Enter no of questions posting:");
        int num = sc.nextInt();
        sc.nextLine();
        for(int j=0;j<num;j++){
        System.out.print("Enter the question"+(j+1)+":");

        String questiontext = sc.nextLine();

            String[] options = new String[4];
            int i=0;
            while(i<4){
                System.out.println("\nEnter the option"+(i+1)+":");

                options[i]=sc.nextLine();
                i++;
             }
        System.out.println("Enter the correct option number:");
        int correctans = sc.nextInt();
        Questions q = new Questions(questiontext,options,correctans);
        questions.add(q);
        }
    }
    int marks = 0;
    public void attendQuiz(){
        for(Questions q:questions){
            q.displayQuestion();
            System.out.println("Enter your option:");
            int input =sc.nextInt();
            if(q.isCorrect(input)){
                System.out.println("Your ans is correct");
                marks+=1;
            }
            else{
                System.out.println("Your ans is incorrect");
            }
        }
        System.out.println("Your total score is"+marks);

    }
}