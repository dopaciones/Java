package Game;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class App extends JFrame {

    public int real = 0;
    public int milan = 0;

    public App(){
        super("Game Simulation");
        this.setSize(640,480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton but_milan = new JButton("AC Milan");
        but_milan.setBounds(50,50,200,100);
        but_milan.setBackground(Color.RED);
        but_milan.setForeground(Color.WHITE);

        JButton but_real = new JButton("Real Madrid");
        but_real.setBounds(380,50,200,100);
        but_real.setBackground(Color.BLUE);
        but_real.setForeground(Color.WHITE);


        JLabel result = new JLabel("Result: 0:0");
        result.setBounds(250,200,200,50);

        JLabel last_scorer = new JLabel("Last Scorer: N/A");
        last_scorer.setBounds(250,275,200,50);

        JLabel winner = new JLabel(("Winner: TBD"));
        winner.setBounds(250,350,200,50);

        add(but_milan);
        add(but_real);
        add(result);
        add(last_scorer);
        add(winner);

        but_milan.addActionListener(action -> {
            {
                milan+=1;
                result.setText("Result: "+this.milan+":"+this.real);
                last_scorer.setText("Last scorer: AC Milan");
                if (this.milan > this.real){
                    winner.setText("Winner: AC Milan");
                } else if (this.milan == this.real){
                    winner.setText("Winner: Draw");
                }
                else winner.setText("Winner: Real Madrid");
            }
        });

        but_real.addActionListener(action -> {
            {
                real+=1;
                result.setText("Result: "+this.milan+":"+this.real);
                last_scorer.setText("Last Scorer: Real Madrid");
                if (this.milan > this.real){
                    winner.setText("Winner: AC Milan");
                } else if (this.milan == this.real){
                    winner.setText("Winner: Draw");
                }
                else winner.setText("Winner: Real Madrid");
            }
        });

    }

    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
    }


}
