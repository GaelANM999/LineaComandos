import java.util.ArrayList;
import java.util.List;

public class SumaPrefija {
    public static void main(String[] args) {

        List<Integer> argumentos= new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            argumentos.add(Integer.valueOf(args[i]));
        }

        int sumaPrefija= 0;
        for (Integer argumentin: argumentos) {
                sumaPrefija= Integer.parseInt(String.valueOf(sumaPrefija+argumentin));

            System.out.println(argumentin + "," + sumaPrefija);
        }
    }
}
