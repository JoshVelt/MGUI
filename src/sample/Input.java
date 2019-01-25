package sample;

public class Input {

    int[][] keyArray = new int[6][8];

    public void keyDect() {

        /*Instantiates array keyArray which acts as a reference for keyboard to piano handoff. Rows are "asdfghj" on the keyboard.
         Columns are 1-9. Combining will lookup in array and give A1 B7 etc.
         */

        for (int i = 0; i < 63; i++) {
            int x = 0;
            int y = 0;
            if (x < 7 && y < 9) {
                keyArray[x][y] = i;
                System.out.println(keyArray[x][y]);
                x++;

            } else if (x == 7) {
                x = 0;
                y++;



            }
        }

    }
    public int toNote(int n, int o){

        if (n <= 6 && o <= 8){
            System.out.println(keyArray[n][o]);
            return keyArray[n][o];

        } else {
            System.out.println("Invalid Note entry");
            return (0);
        }

    }

    //public int fromString(String key){



    //}




}
