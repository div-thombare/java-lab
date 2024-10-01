import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HogwartsHouseQuiz {

    // Questions and options
    static String[][] questions = {
        {
            "What trait do you value most?",
            "A: Bravery",    // Gryffindor
            "B: Ambition",   // Slytherin
            "C: Intelligence",  // Ravenclaw
            "D: Loyalty"     // Hufflepuff
        },
        {
            "What would you most want to learn at Hogwarts?",
            "A: Flying on a broomstick",  // Gryffindor
            "B: Curses and hexes",        // Slytherin
            "C: Everything",              // Ravenclaw
            "D: How to care for magical creatures"  // Hufflepuff
        },
        {
            "Which of the following would you most hate people to call you?",
            "A: Cowardly",    // Gryffindor
            "B: Weak",        // Slytherin
            "C: Ignorant",    // Ravenclaw
            "D: Unkind"       // Hufflepuff
        },
        {
            "Which of these magical creatures do you find most fascinating?",
            "A: Phoenix",       // Gryffindor
            "B: Basilisk",      // Slytherin
            "C: Hippogriff",    // Ravenclaw
            "D: Niffler"        // Hufflepuff
        },
        {
            "How would you like to be remembered in history?",
            "A: The Bold",       // Gryffindor
            "B: The Great",      // Slytherin
            "C: The Wise",       // Ravenclaw
            "D: The Kind"        // Hufflepuff
        }
    };

    // Points for each house
    static Map<String, Integer> housePoints = new HashMap<>();

    public static void main(String[] args) {
        housePoints.put("Gryffindor", 0);
        housePoints.put("Slytherin", 0);
        housePoints.put("Ravenclaw", 0);
        housePoints.put("Hufflepuff", 0);

        askQuestions();
        presentResult();
    }

    // Function to ask questions and gather input
    public static void askQuestions() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.print("Enter your choice (A/B/C/D): ");
            String choice = scanner.next().toUpperCase();

            switch (choice) {
                case "A":
                    housePoints.put("Gryffindor", housePoints.get("Gryffindor") + 1);
                    break;
                case "B":
                    housePoints.put("Slytherin", housePoints.get("Slytherin") + 1);
                    break;
                case "C":
                    housePoints.put("Ravenclaw", housePoints.get("Ravenclaw") + 1);
                    break;
                case "D":
                    housePoints.put("Hufflepuff", housePoints.get("Hufflepuff") + 1);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter A, B, C, or D.");
                    i--;  // Repeat the question
            }
        }

        scanner.close();
    }

    // Function to present the result
    public static void presentResult() {
        int maxPoints = -1;
        String house = "";

        for (Map.Entry<String, Integer> entry : housePoints.entrySet()) {
            if (entry.getValue() > maxPoints) {
                maxPoints = entry.getValue();
                house = entry.getKey();
            }
        }

        System.out.println("\nYou belong to " + house + "!");
    }
}
