public class StringCalculator {

    public int add(String numbers) {

        if(numbers.length() < 2) {

            if ("".equals(numbers)) {
                return 0;
            }

            return Integer.valueOf(numbers);

        }


        String[] arraySplit = numbers.split(",");

        int total = 0;

        for(int i = 0; i < arraySplit.length; i ++){
            int item = Integer.valueOf(arraySplit[i]);
            total += item;

        }

        return total;


    }
}
