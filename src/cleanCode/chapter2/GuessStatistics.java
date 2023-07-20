package cleanCode.chapter2;

public class GuessStatistics {

    public static void main(String[] args) {
        printGuessStatistics('r', 10);

        var gsm = new GuessStatisticsMessage();
        System.out.println(gsm.make('q',0));
    }

    public static void printGuessStatistics(char candidate, int count) {
        String number;
        String verb;
        String pluralModifier;
        if (count == 0) {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        } else if (count == 1) {
            number = "1";
            verb = "is";
            pluralModifier = "";
        } else {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }
        String guessMessage = String.format("There %s %s %s %s", verb, number, candidate, pluralModifier);
        System.out.println(guessMessage);
    }
}
