package sample;

public class Input {

    public void keyDect() {

        /*Instantiates array keyArray which acts as a reference for keyboard to piano handoff. Rows are "asdfghj" on the keyboard.
         Columns are 1-9. Combining will lookup in array and give A1 B7 etc.
         */
        int[][] keyArray = new int[6][8];
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
}
