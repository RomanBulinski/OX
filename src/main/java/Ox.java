public class Ox {

    public static boolean getXO (String str) {
        str = str.toLowerCase();
        int x = 0;
        int o = 0;
        char[] letteres = str.toCharArray();
        for( char letter : letteres ){

            if(letter == 'x'){
                x++;
            }
            if(letter == 'o'){
                o++;
            }
        }

        if(x==o){
            return true;
        }
        return false;
    }

}
