public class StringCalculator {

    public int add(String numbers) {

        if (numbers.equals("")) {

            return 0;
        }

        String numberString = numbers.replace('\n',',');

        if(numberString.startsWith("//")) {
            numberString = numberString.substring(3);
        }

        String[] arraySplit = numberString.split("[\n,;]");

        if (arraySplit.length == 1) {
            return Integer.valueOf(arraySplit[0]);
        }

        int total = 0;

        for (int i = 1; i < arraySplit.length; i++) {
            int item = Integer.valueOf(arraySplit[i]);
            total += item;
        }

        return total;
    }
}
