import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Challenge_1 {
    public static void main(String[] args) throws IOException {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter email id");
        String emailID = myObj.nextLine();

        String address = "https://www.ecs.soton.ac.uk/people/" + emailID;
        URL myURL = new URL(address);

        BufferedReader in = new BufferedReader(new InputStreamReader(myURL.openStream()));

        String inputLine = null;
        for (int i = 0; i < 8; i++) {
            inputLine = in.readLine();
        }
        System.out.println(inputLine.substring(11, inputLine.lastIndexOf("<")));
        in.close();
    }
}
