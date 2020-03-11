public class StringCalculator {

    public int add(String numbers) {

        if (numbers == "") {

            return 0;
        }

        String[] arraySplit = numbers.split(",");

        if (arraySplit.length == 1) {

            return Integer.valueOf(arraySplit[0]);
        }

        int total = 0;

        for (int i = 0; i < arraySplit.length; i++) {
            int item = Integer.valueOf(arraySplit[i]);
            total += item;

        }

        return total;
    }
}
