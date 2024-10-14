import java.util.*;
import java.lang.*;

abstract class Question {
    String questionText;
    String[] options;
    int correctOption;

    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    abstract boolean isCorrect(int userAnswer);

    String getQuestionText() {
        return questionText;
    }

    String[] getOptions() {
        return options;
    }
}

class EasyQuestion extends Question {
    String hint;

    public EasyQuestion(String questionText, String[] options, int correctOption, String hint) {
        super(questionText, options, correctOption);
        this.hint = hint;
    }

    boolean isCorrect(int userAnswer) {
        return userAnswer == correctOption;
    }

    String getHint() {
        return hint;
    }
}

class MediumQuestion extends Question {
    String hint;

    public MediumQuestion(String questionText, String[] options, int correctOption, String hint) {
        super(questionText, options, correctOption);
        this.hint = hint;
    }

    boolean isCorrect(int userAnswer) {
        return userAnswer == correctOption;
    }

    String getHint() {
        return hint;
    }

}

class HardQuestion extends Question {
    String hint;

    public HardQuestion(String questionText, String[] options, int correctOption, String hint) {
        super(questionText, options, correctOption);
        this.hint = hint;
    }

    boolean isCorrect(int userAnswer) {
        return userAnswer == correctOption;
    }

    String getHint() {
        return hint;
    }
}

class QuizGame {
    List<Question> easyQuestions;
    List<Question> mediumQuestions;
    List<Question> hardQuestions;

    public QuizGame() {
        // Initialize questions (you can add more questions)
        easyQuestions = Arrays.asList(
                new EasyQuestion("What is the capital city of France?",
                        new String[] { "A. Rome", "B. Berlin", "C. Paris", "D. Madrid" }, 3,
                        "Known as the City of Lights."),
                new EasyQuestion("Which planet is known as the Red Planet?",
                        new String[] { "A. Jupiter", "B. Mars", "C. Venus", "D. Earth" }, 2,
                        "Named after the Roman god of war."),
                new EasyQuestion("What is the largest mammal in the world?",
                        new String[] { "A. Elephant", "B. Blue Whale", "C. Giraffe", "D. Dolphin" }, 2,
                        "It's a marine creature and the biggest animal on Earth."),
                new EasyQuestion("Who wrote Romeo and Juliet?",
                        new String[] { "A. Charles Dickens", "B. Jane Austen", "C. William Shakespeare",
                                "D. Mark Twain" },
                        3, "A renowned English playwright and poet."),
                new EasyQuestion("In which year did the Titanic sink?",
                        new String[] { "A. 1905", "B. 1912", "C. 1920", "D. 1931" }, 2,
                        "It was a tragic event during the early 20th century."),
                new EasyQuestion("What is the largest ocean on Earth?",
                        new String[] { "A. Atlantic Ocean", "B. Indian Ocean", "C. Southern Ocean",
                                "D. Pacific Ocean" },
                        4, "It covers more than 60 million square miles."),
                new EasyQuestion("Who is known as the Father of Computers?",
                        new String[] { "A. Bill Gates", "B. Alan Turing", "C. Charles Babbage", "D. Steve Jobs" }, 3,
                        "He designed the first mechanical computer."),
                new EasyQuestion("What is the capital of Japan?",
                        new String[] { "A. Beijing", "B. Seoul", "C. Tokyo", "D. Bangkok" }, 3,
                        "A bustling metropolis and tech hub."),
                new EasyQuestion("Which planet is closest to the Sun?",
                        new String[] { "A. Mercury", "B. Mars", "C. Venus", "D. Earth" }, 1,
                        "It's named after the Roman messenger god."),
                new EasyQuestion("What is the currency of the United Kingdom?",
                        new String[] { "A. Euro", "B. Dollar", "C. Pound Sterling", "D. Yen" }, 4,
                        "Features the image of the Queen.")

        );
        mediumQuestions = Arrays.asList(
                new MediumQuestion("In which year did the Titanic sink?",
                        new String[] { "A. 1912", "B. 1920", "C. 1905", "D. 1931" }, 1,
                        " This tragic event occurred in the early 20th century."),
                new MediumQuestion("What is the capital city of Australia?",
                        new String[] { "A. Sydney", "B. Melbourne", "C. Canberra", "D. Perth" }, 3,
                        " It's not the most populous city in the country."),
                new MediumQuestion("Who wrote the play Romeo and Juliet",
                        new String[] { "A. William Wordsworth", "B. William Shakespeare", "C. Jane Austen",
                                "D. Charles Dickens" },
                        2, " He is often referred to as the 'Bard of Avon.'"),
                new MediumQuestion(" What is the largest planet in our solar system?",
                        new String[] { "A. Venus", "B. Mars", "C. Jupiter", "D. Saturn" }, 3,
                        "It's known for its massive size and distinct colorful bands."),
                new MediumQuestion(" In which year did the Berlin Wall fall?",
                        new String[] { "A. 1985", "B. 1989", "C. 1991", "D. 1981" }, 2,
                        "This event marked the end of the Cold War era."),
                new MediumQuestion("What is the currency of Japan?",
                        new String[] { "A. Won", "B. Yen", "C. Yuan", "D. Ringgit" }, 2,
                        " It's named after a round object."),
                new MediumQuestion("Who painted the Mona Lisa?",
                        new String[] { "A. Vincent Van Gogh", "B. Pablo Picasso", "C. Leonardo Da Vinci",
                                "D. Michelangeo" },
                        3, "The artist was a polymath and a true Renaissance man."),
                new MediumQuestion("Which planet is known as the 'Red Planet'?",
                        new String[] { "A. Venus", "B. Mars", "C. Jupiter", "D. Mercury" }, 2,
                        "It's often visible in the night sky with a reddish hue."),
                new MediumQuestion("What is the world's longest river?",
                        new String[] { "A. Nile", "B. Amazon", "C. Yangtze", "D. Mississippi" }, 1,
                        " It flows through northeastern Africa."),
                new MediumQuestion(" Who was the first woman to win a Nobel Prize?",
                        new String[] { "A. Marie Curie", "B. Jane Goodall", "C. Amelia Earhart", "D. Mother Teresa" },
                        1, "She won the Nobel Prize in Physics in 1903."));

        hardQuestions = Arrays.asList(
                new HardQuestion("In which year did the Tunguska event occur?",
                        new String[] { "A. 1908", "B. 1922", "C. 1945", "D. 1913" }, 1,
                        "This mysterious explosion happened in a remote Siberian region."),
                new HardQuestion("What is the capital city of Bhutan?",
                        new String[] { "A. Thimphu", "B. Paro", "C. Punakha", "D. Jakar" }, 1,
                        "It is the largest city in the country and the political and economic center."),
                new HardQuestion("Which element has the highest melting point?",
                        new String[] { "A. Tungsten", "B. Titanium", "C. Rhenium", "D. Osmium" }, 1,
                        "It's often used in the production of lightbulb filaments due to its high melting point."),
                new HardQuestion("What is the longest river in Africa?",
                        new String[] { "A. Niger River", "B. Congo River", "C. Nile River", "D. Zambezi River" }, 3,
                        "Ancient Egyptian civilization flourished along its banks."),
                new HardQuestion("Which planet is known as the Red Planet?",
                        new String[] { "A. Venus", "B. Mars", "C. Jupiter", "D. Saturn" }, 2,
                        "It's named after the Roman god of war."),
                new HardQuestion("What is the largest mammal in the world?",
                        new String[] { "A. Blue Whale", "B. African Elephant", "C. Giraffe", "D. Hippopotamus" }, 1,
                        "It's also the largest animal on Earth."),
                new HardQuestion("Which composer wrote The Four Seasons?",
                        new String[] { "A. Wolfgang Amadeus Mozart", "B. Ludwig van Beethoven", "C. Antonio Vivaldi",
                                "D. Johann Sebastian Bach" },
                        3, "He was an Italian Baroque composer."),
                new HardQuestion("What is the currency of South Korea?",
                        new String[] { "A. Won", "B. Yuan", "C. Baht", "D. Ringgit" }, 1,
                        "It shares its name with the Japanese currency."),
                new HardQuestion("Which element has the chemical symbol Pt?",
                        new String[] { "A. Platinum", "B. Palladium", "C. Palladium", "D. Polonium" }, 1,
                        "It is a precious metal often used in jewelry."),
                new HardQuestion("What is the capital of Mongolia?",
                        new String[] { "A. Ulaanbaatar", "B. Astana", "C. Bishkek", "D. Tashkent" }, 1,
                        "It is the coldest national capital in the world."));

    }

    void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        do {
            System.out.println("Choose difficulty level:");
            System.out.println("1. Easy");
            System.out.println("2. Medium");
            System.out.println("3. Hard");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            List<Question> questions = getQuestionsByDifficulty(choice);

            if (questions.isEmpty()) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            Collections.shuffle(questions);
            score = score+ playQuiz(questions, scanner, random);

            System.out.println("Your score: " + score);
            System.out.print("Do you want to continue? (1 for Yes, 0 for No): ");
        } while (scanner.nextInt() == 1);

        System.out.println("Thanks for playing!");
    }

    private List<Question> getQuestionsByDifficulty(int choice) {
        switch (choice) {
            case 1:
                return easyQuestions;
            case 2:
                return mediumQuestions;
            case 3:
                return hardQuestions;
            default:
                return Collections.emptyList();
        }
    }

    private int playQuiz(List<Question> questions, Scanner scanner, Random random) {
        int score=0;
        int index = (int) (Math.random() * questions.size());
        Question question = questions.get(index);
        System.out.println("Question: " + question.getQuestionText());
        String[] options = question.getOptions();

        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }

        if (question instanceof EasyQuestion) {
            System.out.print("Do you want a hint? (1 for Yes, 0 for No): ");
            int hintChoice = scanner.nextInt();
            if (hintChoice == 1) {
                System.out.println("Hint: " + ((EasyQuestion) question).getHint());
            }
        }

        if (question instanceof MediumQuestion) {
            System.out.print("Do you want a hint? (1 for Yes, 0 for No): ");
            int hintChoice = scanner.nextInt();
            if (hintChoice == 1) {
                System.out.println("Hint: " + ((MediumQuestion) question).getHint());
            }
        }

        if (question instanceof HardQuestion) {
            System.out.print("Do you want a hint? (1 for Yes, 0 for No): ");
            int hintChoice = scanner.nextInt();
            if (hintChoice == 1) {
                System.out.println("Hint: " + ((HardQuestion) question).getHint());
            }
        }

        System.out.print("Your answer (1-4): ");
        int userAnswer = scanner.nextInt();

        if (question.isCorrect(userAnswer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is: " + (question.correctOption + 1));
        }
        return score;
    }
}

public class quiz_game_project {
    public static void main(String[] args) {
        QuizGame quizGame = new QuizGame();
        quizGame.startGame();
    }
}
