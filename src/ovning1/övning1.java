package ovning1;

import javax.swing.*;
import java.util.Random;

public class övning1 {
    public static void övning1 (){
        int i = 1;
        String start = JOptionPane.showInputDialog("Hej. Vad vill du prata om");
        if (start == ""){
            JOptionPane.showMessageDialog(null, "Så du har ingenting att prata om?");
        }else {
            while (i == 1){
                String respons = Random ;
                String convo = JOptionPane.showInputDialog(respons);
                if (convo == ""){i = 0;};
            };
            JOptionPane.showMessageDialog(null, "Ha en bra dag");
        }
    }
}
