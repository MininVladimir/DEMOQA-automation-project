package TestClasses.API;

import net.datafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class DataGenerate {
    Faker faker = new Faker(Locale.of("ru"));
    final String userName = faker.name().username();

    public String generatePassword(int lowerRandomLettersLength, int upperRandomLettersLength, int randomNumbersLength, int randomSymbolsLength){

        final String alphabet = "abcdefghijklmnopqrstuvwxyz";
        final String numbers = "1234567890";
        final String symbols = "!@#$%^&*";

        String randomLetter = "";
        String lowerRandomLetters = "";
        String upperRandomLetters = "";
        String randomNumbers = "";
        String randomSymbols = "";

        Random random = new Random();

        while (lowerRandomLetters.length() < lowerRandomLettersLength) {
            randomLetter = String.valueOf(alphabet.charAt(random.nextInt(alphabet.length())));
            lowerRandomLetters += randomLetter.toLowerCase();
        }
        while (upperRandomLetters.length() < upperRandomLettersLength) {
            randomLetter = String.valueOf(alphabet.charAt(random.nextInt(alphabet.length())));
            upperRandomLetters += randomLetter.toUpperCase();
        }
        while (randomNumbers.length() < randomNumbersLength) {
            String randomNumber = String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
            randomNumbers += randomNumber;
        }
        while (randomSymbols.length() < randomSymbolsLength) {
            String randomSymbol = String.valueOf(symbols.charAt(random.nextInt(symbols.length())));
            randomSymbols += randomSymbol;
        }
        final String password = lowerRandomLetters + upperRandomLetters + randomNumbers + randomSymbols;
        return password;
    }
}
