    package codeignition;



import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name:");
        String userName = scanner.nextLine();


        System.out.println("How old are you:");
        int age = scanner.nextInt();

        int birthYear = LocalDateTime.now().minusYears(age).getYear();


        System.out.println("You were born in " + birthYear);

        char[] letters ={'A','A','A','B','C','D','D','D'};

        int count = countOccurrences(letters, 'A');
        System.out.println(count);

        Lens newLens = new Lens("Sony", "88", true);
        System.out.println("The lens brand is: " + newLens.brand);

    }


public static int countOccurrences(char[] letters, char searchLetter) {
    int numberOfOccurrences = 0;

        for(char letter: letters) {
            if(letter == searchLetter) {
                numberOfOccurrences++;
            }
        }

    return numberOfOccurrences;
    }



    static class Lens {
        String brand;
        String focalLength;
        Boolean isPrime;


        Lens(String brand, String focalLength, Boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }

}