package barratms;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Barratms {

    public static void main(String[] args) {
        Barraptms pf = new Barraptms();
        pf.setVisible(true);

        for (int i = 0; i < 101; i++) {
            try {
                Thread.sleep(70);
                pf.progressBar.setValue(i);
                
                
                

                if (i%2==0) {

                    pf.PleaseWait.setText("Please wait");

                } else {
                    pf.PleaseWait.setText("Please wait");

                }
                if (i == 100) {
                    pf.setVisible(true);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Barratms.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
