import java.io.*;
import java.util.*;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "questions.txt"; // File containing quiz questions
        List<Question> questions = loadQuestions("D:/projects/.vscode/.vscode/questions.txt");

        if (questions.isEmpty()) {
            System.out.println("No questions found in the file. Please check the file content.");
            return;
        }

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Answer the following questions by entering the number of your chosen option.\n");

        int score = 0;

        // Ask each question
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            // Display options
            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println((i + 1) + ". " + question.getOptions()[i]);
            }

            System.out.print("Your answer (enter the number of the option): ");
            int answer = -1;

            // Validate user input
            while (true) {
                try {
                    answer = Integer.parseInt(scanner.nextLine());
                    if (answer < 1 || answer > question.getOptions().length) {
                        System.out.print("Invalid option. Please enter a valid option number: ");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter a number: ");
                }
            }

            
            if (question.getCorrectOptionIndex() == answer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was option " + question.getCorrectOptionIndex() + ".\n");
            }
        }

        // Display final score
        System.out.println("Quiz Over! Your final score is: " + score + "/" + questions.size());
    }

   
    private static List<Question> loadQuestions(String fileName) {
        List<Question> questions = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    String questionText = parts[0];
                    String[] options = parts[1].split(",");
                    int correctOptionIndex = Integer.parseInt(parts[2]);
                    questions.add(new Question(questionText, options, correctOptionIndex));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing correct option index: " + e.getMessage());
        }
        return questions;
    }
}

// Question class to represent a quiz question
class Question {
    private final String question;
    private final String[] options;
    private final int correctOptionIndex;

    public Question(String question, String[] options, int correctOptionIndex) {
        this.question = question;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }
}
