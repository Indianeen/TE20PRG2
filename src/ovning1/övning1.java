package ovning1;

import javax.swing.*;
import java.util.Random;

public class övning1 {
    public static void main (String[] args){

        int i = 1;
        String start = JOptionPane.showInputDialog("Hej. Vad vill du prata om");
        if (start == ""){
            JOptionPane.showMessageDialog(null, "Så du har ingenting att prata om?");
        }else {
            while (i == 1){
                String[] arr={"Jag förstår.","Okej.","Intressant.","Jaha ja.","Fortsätt."};
                Random r=new Random();
                int randomNumber=r.nextInt(arr.length);
                String convo = JOptionPane.showInputDialog(arr[randomNumber]);
                if (convo == ""){i = 0;}
            };
            JOptionPane.showMessageDialog(null, "Ha en bra dag");
        }
    }
}
