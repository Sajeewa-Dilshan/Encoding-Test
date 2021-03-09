package encoded;

import java.util.ArrayList;
import java.util.List;

public class EncodedAlgo {

    public static void main(String[] args) {

        String inputString = "AAABBAADDBBBCCCCFFF";

        EncodedAlgo encodedAlgo= new EncodedAlgo();
        System.out.println(encodedAlgo.encoding(inputString));


    }

    public boolean  encoding(String inputString){


        List list = new ArrayList<String>();

        for (int k = 0; k < inputString.length(); k++) {
            list.add(inputString.charAt(k));

        }
        System.out.println(list);



        int t = 1;
        int temp = 0;
        String encoded = "";

        for (int i = 0; i < inputString.length() - 1; i++) {

            if (i == inputString.length() - 2) {
                temp = t;



                encoded += String.valueOf(temp + 1) + list.get(i);


                temp = 1;
                t = 1;

            } else if (list.get(i) == list.get(i + 1)) {
                t += 1;

            } else {
                temp = t;



                encoded += String.valueOf(temp) + list.get(i);


                temp = 1;
                t = 1;
            }

        }

        Boolean valid=true;

        for(int l=0; l<list.size();l++){
            char character = (char)list.get(l);
            int ascii = (int) character;
            System.out.println(ascii);
            if(ascii<65|| 122<ascii){
                valid=false;
            }

        }



        System.out.println(encoded);

        return valid;

    }


}
