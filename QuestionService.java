import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selections = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Who is PM?", "Narendra Modi", "Rahul Gandhi", "Manmohan Singh", "Indira Gandhi", "Narendra Modi");
        questions[1] = new Question(2, "What is the capital of India?", "Mumbai", "Delhi", "Kolkata", "Chennai", "Delhi");
        questions[2] = new Question(3, "What is 2 + 2?", "3", "4", "5", "6", "4");
        questions[3] = new Question(4, "Largest ocean?", "Atlantic", "Indian", "Arctic", "Pacific", "Pacific");
        questions[4] = new Question(5, "Fastest animal?", "Cheetah", "Tiger", "Lion", "Leopard", "Cheetah");
    }

    public void playQuiz() {
        Scanner sc = new Scanner(System.in);
        int idx = 0;

        for (Question q : questions) {
            System.out.println("Question no. " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A) " + q.getOpt1());
            System.out.println("B) " + q.getOpt2());
            System.out.println("C) " + q.getOpt3());
            System.out.println("D) " + q.getOpt4());
            selections[idx++] = sc.nextLine();  // take raw user input
        }

        sc.close();
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            String correct = questions[i].getAnswer();
            if (correct.equalsIgnoreCase(selections[i])) {
                score++;
            }
        }

        System.out.println("Your score is: " + score);
    }
}
