package TestingJava;



import javax.swing.*;
import java.awt.*;

/**
 * Created by VKashevar on 16.09.2015.
 */
    public class TestGui extends JFrame
    {
        public TestGui(){
            setTitle("Hello all people!");
            setSize(150, 200);
            setLocation(500, 500);
            setBackground(Color.BLUE);
            setVisible(true);

        }

        public static void main(String[] args){
            TestGui newGui = new TestGui();
            newGui.setTitle("Hello all people!");

        }

    }
