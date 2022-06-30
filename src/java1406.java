import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class java1406 {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = br.readLine();
        int Cursor = str.length();
        LinkedList<String> stringList = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            stringList.add(String.valueOf(str.charAt(i)));
        }

        int OrderCount = Integer.parseInt(br.readLine());
        ListIterator<String> iter = stringList.listIterator();

        while (iter.hasNext()) {
            iter.next();
        }

        while(OrderCount-- >0) {
            String[] command = br.readLine().split(" ");
            String firstCommand= command[0];


            switch (firstCommand) {
                case "P":
                    iter.add(command[1]);
                    break;
                case "L":
                    if (iter.hasPrevious()) iter.previous();
                    break;
                case "D":
                    if (iter.hasNext()) iter.next();
                    break;
                case "B":
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
            }
        }
        System.out.println(String.join("",stringList));

    }
}
