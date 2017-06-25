package lock;

import java.io.*;

class EnterKey {

    private int key;

    int getKey(String passwordType) {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        boolean correctPassword = false;
        String password;

        do {
            System.out.println("Enter " + passwordType + ", please.");

            try {
                password = bufferedReader.readLine();

                this.key = Integer.valueOf(password);
                correctPassword = true;

            } catch (IOException e) {
                e.printStackTrace();

            } catch (NumberFormatException e) {
                System.out.println(passwordType + " is not correct!");
            }
        } while(!correctPassword);

        return this.key;
    }
}