import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class main extends JFrame implements ActionListener ,WindowListener ,Runnable, MouseListener {
  JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, reset, solution, exit, newgame, AI;
  JLabel noofclick, time;
  Clip clip;

  main() {
    this.setSize(500, 650);
    JLabel bground = new JLabel();
    JLabel heading = new JLabel("<HTML><u>15 PUZZLE<u><HTML>");
    noofclick = new JLabel("CLICKS :0");
    noofclick.setBounds(400, 80, 150, 50);
    bground.add(noofclick);
    noofclick.setFocusable(false);
    noofclick.setBackground(new Color(246, 110, 60));
    noofclick.setFont(new Font("MV boli", Font.BOLD, 15));


    time = new JLabel("Time: 0 m 0 s");
    time.setBounds(5, 80, 150, 50);
    bground.add(time);
    time.setBackground(new Color(246, 110, 60));
    time.setFont(new Font("MV boli", Font.BOLD, 15));


    bground.setBounds(0, 0, 500, 650);
    bground.setIcon(new ImageIcon("15puzzle/res/background.png"));
    bground.setOpaque(true);

    heading.setFont(new Font("MV boli", Font.BOLD, 56));
    heading.setForeground(new Color(246, 110, 60));
    heading.setBounds(100, 0, 400, 100);
    bground.add(heading);


    b1 = new JButton("1");
    b1.setBounds(100, 120, 80, 80);
    bground.add(b1);
    b1.addActionListener(this);
    b1.setFocusable(false);
    b1.setBackground(new Color(246, 110, 60));
    b1.setFont(new Font("MV boli", Font.BOLD, 45));
    b1.setForeground(Color.white);
    b1.addMouseListener(this);

    b2 = new JButton("2");
    b2.setBounds(180, 120, 80, 80);
    bground.add(b2);
    b2.addActionListener(this);
    b2.setFocusable(false);
    b2.setBackground(new Color(246, 110, 60));
    b2.setFont(new Font("MV boli", Font.BOLD, 45));
    b2.setForeground(Color.white);
    b2.addMouseListener(this);


    b3 = new JButton("3");
    b3.setBounds(260, 120, 80, 80);
    bground.add(b3);
    b3.addActionListener(this);
    b3.setFocusable(false);
    b3.setBackground(new Color(246, 110, 60));
    b3.setFont(new Font("MV boli", Font.BOLD, 45));
    b3.setForeground(Color.white);
    b3.addMouseListener(this);


    b4 = new JButton("4");
    b4.setBounds(340, 120, 80, 80);
    bground.add(b4);
    b4.addActionListener(this);
    b4.setFocusable(false);
    b4.setBackground(new Color(246, 110, 60));
    b4.setFont(new Font("MV boli", Font.BOLD, 45));
    b4.setForeground(Color.white);
    b4.addMouseListener(this);

    b5 = new JButton("5");
    b5.setBounds(100, 200, 80, 80);
    bground.add(b5);
    b5.addActionListener(this);
    b5.setFocusable(false);
    b5.setBackground(new Color(246, 110, 60));
    b5.setFont(new Font("MV boli", Font.BOLD, 45));
    b5.setForeground(Color.white);
    b5.addMouseListener(this);


    b6 = new JButton("6");
    b6.setBounds(180, 200, 80, 80);
    bground.add(b6);
    b6.addActionListener(this);
    b6.setFocusable(false);
    b6.setBackground(new Color(246, 110, 60));
    b6.setFont(new Font("MV boli", Font.BOLD, 45));
    b6.setForeground(Color.white);
    b6.addMouseListener(this);


    b7 = new JButton("7");
    b7.setBounds(260, 200, 80, 80);
    bground.add(b7);
    b7.addActionListener(this);
    b7.setFocusable(false);
    b7.setBackground(new Color(246, 110, 60));
    b7.setFont(new Font("MV boli", Font.BOLD, 45));
    b7.setForeground(Color.white);
    b7.addMouseListener(this);


    b8 = new JButton("8");
    b8.setBounds(340, 200, 80, 80);
    bground.add(b8);
    b8.addActionListener(this);
    b8.setFocusable(false);
    b8.setBackground(new Color(246, 110, 60));
    b8.setFont(new Font("MV boli", Font.BOLD, 45));
    b8.setForeground(Color.white);
    b8.addMouseListener(this);

    b9 = new JButton("9");
    b9.setBounds(100, 280, 80, 80);
    bground.add(b9);
    b9.addActionListener(this);
    b9.setFocusable(false);
    b9.setBackground(new Color(246, 110, 60));
    b9.setFont(new Font("MV boli", Font.BOLD, 45));
    b9.setForeground(Color.white);
    b9.addMouseListener(this);


    b10 = new JButton("10");
    b10.setBounds(180, 280, 80, 80);
    bground.add(b10);
    b10.addActionListener(this);
    b10.setFocusable(false);
    b10.setBackground(new Color(246, 110, 60));
    b10.setFont(new Font("MV boli", Font.BOLD, 45));
    b10.setForeground(Color.white);
    b10.addMouseListener(this);

    b11 = new JButton("11");
    b11.setBounds(260, 280, 80, 80);
    bground.add(b11);
    b11.addActionListener(this);
    b11.setFocusable(false);
    b11.setBackground(new Color(246, 110, 60));
    b11.setFont(new Font("MV boli", Font.BOLD, 45));
    b11.setForeground(Color.white);
    b11.addMouseListener(this);

    b12 = new JButton("12");
    b12.setBounds(340, 280, 80, 80);
    bground.add(b12);
    b12.addActionListener(this);
    b12.setFocusable(false);
    b12.setBackground(new Color(246, 110, 60));
    b12.setFont(new Font("MV boli", Font.BOLD, 45));
    b12.setForeground(Color.white);
    b12.addMouseListener(this);

    b13 = new JButton("13");
    b13.setBounds(100, 360, 80, 80);
    bground.add(b13);
    b13.addActionListener(this);
    b13.setFocusable(false);
    b13.setBackground(new Color(246, 110, 60));
    b13.setFont(new Font("MV boli", Font.BOLD, 45));
    b13.setForeground(Color.white);
    b13.addMouseListener(this);


    b14 = new JButton("14");
    b14.setBounds(180, 360, 80, 80);
    bground.add(b14);
    b14.addActionListener(this);
    b14.setFocusable(false);
    b14.setBackground(new Color(246, 110, 60));
    b14.setFont(new Font("MV boli", Font.BOLD, 45));
    b14.setForeground(Color.white);
    b14.addMouseListener(this);

    b15 = new JButton("15");
    b15.setBounds(260, 360, 80, 80);
    bground.add(b15);
    b15.addActionListener(this);
    b15.setFocusable(false);
    b15.setBackground(new Color(246, 110, 60));
    b15.setFont(new Font("MV boli", Font.BOLD, 45));
    b15.setForeground(Color.white);
    b15.addMouseListener(this);

    b16 = new JButton("");
    b16.setBounds(340, 360, 80, 80);
    bground.add(b16);
    b16.addActionListener(this);
    b16.setFocusable(false);
    b16.setBackground(new Color(246, 110, 60));
    b16.setFont(new Font("MV boli", Font.BOLD, 45));
    b16.setForeground(Color.white);
    b16.addMouseListener(this);

    newgame = new JButton("NEW GAME");
    newgame.setBounds(250, 542, 200, 50);
    bground.add(newgame);
    newgame.addActionListener(this);
    newgame.setFocusable(false);
    newgame.setBackground(new Color(246, 110, 60));
    newgame.setFont(new Font("MV boli", Font.BOLD, 30));
    newgame.setForeground(Color.white);
    newgame.addMouseListener(this);


    solution = new JButton("SET");
    solution.setBounds(85, 460, 110, 55);
    bground.add(solution);
    solution.addActionListener(this);
    solution.setFocusable(false);
    solution.setBackground(new Color(246, 110, 60));
    solution.setFont(new Font("MV boli", Font.BOLD, 35));
    solution.setForeground(Color.white);
    solution.addMouseListener(this);


    reset = new JButton("RESET");
    reset.setBounds(210, 460, 130, 55);
    bground.add(reset);
    reset.addActionListener(this);
    reset.setFocusable(false);
    reset.setBackground(new Color(246, 110, 60));
    reset.setFont(new Font("MV boli", Font.BOLD, 30));
    reset.setForeground(Color.white);
    reset.addMouseListener(this);

    exit = new JButton("EXIT");
    exit.setBounds(350, 460, 90, 55);
    bground.add(exit);
    exit.addActionListener(this);
    exit.setFocusable(false);
    exit.setBackground(new Color(246, 110, 60));
    exit.setFont(new Font("MV boli", Font.BOLD, 30));
    exit.setForeground(Color.white);
    exit.addMouseListener(this);


    AI = new JButton("SOLVE");
    AI.setBounds(90, 542, 150, 50);
    bground.add(AI);
    AI.addActionListener(this);
    AI.setFocusable(false);
    AI.setBackground(new Color(246, 110, 60));
    AI.setFont(new Font("MV boli", Font.BOLD, 30));
    AI.setForeground(Color.white);
    AI.addMouseListener(this);



// ------------ ------------ ------------ ------------ ------------ ------------ ------------ ------------ ------------ ------------ ------------
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setLocationRelativeTo(null);
    this.add(bground);
    this.setTitle("15 PUZZLE.exe");
    this.setIconImage(new ImageIcon("15puzzle/res/icon.png").getImage());
    this.addWindowListener(this);
    this.setResizable(false);
    this.setVisible(true);


  }

  //<=========================================================================================================================================
  int counter;

  public boolean emptychecker(JButton b1, JButton b2) {
    String Shufflenumber = b2.getText();
    if (Shufflenumber.equals("")) {
      b2.setText(b1.getText());
      b1.setText("");
      try {

        clip = AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(new File("15puzzle/res/click.wav")));
        clip.start();
      } catch (Exception exc) {
        exc.printStackTrace(System.out);
      }
      counter = counter + 1;
      noofclick.setText("CLICKS :" + counter);
      achieve();
      return true;
    }
    else
      return false;
  }

  //<====================================================================================================================================
  int timer;
  int min;

  public void run() {

    min = 0;
    for (timer = 1; true; timer++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      if (timer % 60 == 0) {
        min++;
        timer = 0;
      }
      time.setText("TIME: " + min + " m " + timer + " s");

    }
  }


  //<====================================================================================================================================
  public void quit() {
    JOptionPane mes = new JOptionPane();
    mes.setFocusable(false);
    if (mes.showConfirmDialog(this, "DO YOU WANT TO EXIT", "PUZZLE GAME", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
      System.exit(0);
    }
  }
  //<====================================================================================================================================

  public void shuffle() {

    // Generate an array of integers
    Integer[] puzzle = new Integer[16];
    for (int i = 0; i < 16; ++i) {
      puzzle[i] = i;
    }
    // Do the Knuth shuffle
    for (int i = 0; i < 16; ++i) {
      int randomIndex = (int) Math.floor(Math.random() * (i - 1) + 1);
      Integer temp = puzzle[i];
      puzzle[i] = puzzle[randomIndex];
      puzzle[randomIndex] = temp;
    }
    b1.setText(Integer.toString(puzzle[1]));
    b2.setText(Integer.toString(puzzle[2]));
    b3.setText(Integer.toString(puzzle[3]));
    b4.setText(Integer.toString(puzzle[4]));
    b5.setText(Integer.toString(puzzle[5]));
    b6.setText(Integer.toString(puzzle[6]));
    b7.setText(Integer.toString(puzzle[7]));
    b8.setText(Integer.toString(puzzle[8]));
    b9.setText(Integer.toString(puzzle[9]));
    b10.setText(Integer.toString(puzzle[10]));
    b11.setText(Integer.toString(puzzle[11]));
    b12.setText(Integer.toString(puzzle[12]));
    b13.setText(Integer.toString(puzzle[13]));
    b14.setText(Integer.toString(puzzle[14]));
    b15.setText(Integer.toString(puzzle[15]));
    b16.setText("");
  }

  //<========================================================================================================================================
  public void soltionchecker() {
    String val1 = b1.getText();
    String val2 = b2.getText();
    String val3 = b3.getText();
    String val4 = b4.getText();
    String val5 = b5.getText();
    String val6 = b6.getText();
    String val7 = b7.getText();
    String val8 = b8.getText();
    String val9 = b9.getText();
    String val10 = b10.getText();
    String val11 = b11.getText();
    String val12 = b12.getText();
    String val13 = b13.getText();
    String val14 = b14.getText();
    String val15 = b15.getText();
    if (val1.equals("1") && val2.equals("2") && val3.equals("3") && val4.equals("4") &&
            val5.equals("5") && val6.equals("6") && val7.equals("7") && val8.equals("8") &&
            val9.equals("9") && val10.equals("10") && val11.equals("11") && val12.equals("12") &&
            val13.equals("13") && val14.equals("14") && val15.equals("15")) {

      String[] array = {"RESTART", "QUIT", "CANCEL"};
      if (JOptionPane.showOptionDialog(this, "YOU WON THE GAME", "PUZZLE GAME", JOptionPane.YES_NO_CANCEL_OPTION,
              JOptionPane.INFORMATION_MESSAGE, new ImageIcon("15puzzle/res/youwon.png"), array, 1) == 0) {
        shuffle();
        timer = 1;
        min = 0;
        b1.setBackground(new Color(246, 110, 60));
        b2.setBackground(new Color(246, 110, 60));
        b3.setBackground(new Color(246, 110, 60));
        b4.setBackground(new Color(246, 110, 60));
        b5.setBackground(new Color(246, 110, 60));
        b6.setBackground(new Color(246, 110, 60));
        b7.setBackground(new Color(246, 110, 60));
        b8.setBackground(new Color(246, 110, 60));
        b9.setBackground(new Color(246, 110, 60));
        b10.setBackground(new Color(246, 110, 60));
        b11.setBackground(new Color(246, 110, 60));
        b12.setBackground(new Color(246, 110, 60));
        b13.setBackground(new Color(246, 110, 60));
        b14.setBackground(new Color(246, 110, 60));
        b15.setBackground(new Color(246, 110, 60));
        b16.setBackground(new Color(246, 110, 60));
      } else if (JOptionPane.showOptionDialog(this, "YOU WON THE GAME IN " + "TIME: " + min + " m " + timer + " s" +
              "AND " + counter + "OF CLICKS", "PUZZLE GAME", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
              new ImageIcon("res/youwon.png"), array, 1) == 1) {
        quit();
      }
    }

  }

  //<========================================================================================================================================
  public void achieve() {
    if (b1.getText().equals("1")) {
      b1.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1")) {
      b2.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3")) {
      b3.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3") && b4.getText().equals("4")) {
      b4.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3") && b4.getText().equals("4")
            && b5.getText().equals("5")) {
      b5.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3") && b4.getText().equals("4")
            && b5.getText().equals("5") && b6.getText().equals("6")) {
      b6.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3") && b4.getText().equals("4")
            && b5.getText().equals("5") && b6.getText().equals("6") && b7.getText().equals("7")) {
      b7.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3") && b4.getText().equals("4")
            && b5.getText().equals("5") && b6.getText().equals("6") && b7.getText().equals("7") && b8.getText().equals("8")) {
      b8.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3") && b4.getText().equals("4")
            && b5.getText().equals("5") && b6.getText().equals("6") && b7.getText().equals("7") && b8.getText().equals("8")
            && b9.getText().equals("9")) {
      b9.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3") && b4.getText().equals("4")
            && b5.getText().equals("5") && b6.getText().equals("6") && b7.getText().equals("7") && b8.getText().equals("8")
            && b9.getText().equals("9") && b10.getText().equals("10")) {
      b10.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3") && b4.getText().equals("4")
            && b5.getText().equals("5") && b6.getText().equals("6") && b7.getText().equals("7") && b8.getText().equals("8")
            && b9.getText().equals("9") && b10.getText().equals("10") && b11.getText().equals("11")) {
      b11.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3") && b4.getText().equals("4")
            && b5.getText().equals("5") && b6.getText().equals("6") && b7.getText().equals("7") && b8.getText().equals("8")
            && b9.getText().equals("9") && b10.getText().equals("10") && b11.getText().equals("11") && b12.getText().equals("12")) {
      b12.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3") && b4.getText().equals("4")
            && b5.getText().equals("5") && b6.getText().equals("6") && b7.getText().equals("7") && b8.getText().equals("8")
            && b9.getText().equals("9") && b10.getText().equals("10") && b11.getText().equals("11") && b12.getText().equals("12")
            && b13.getText().equals("13")) {
      b13.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3") && b4.getText().equals("4")
            && b5.getText().equals("5") && b6.getText().equals("6") && b7.getText().equals("7") && b8.getText().equals("8")
            && b9.getText().equals("9") && b10.getText().equals("10") && b11.getText().equals("11") && b12.getText().equals("12")
            && b13.getText().equals("13") && b14.getText().equals("14")) {
      b14.setBackground(new Color(255, 163, 11));
    }
    if (b2.getText().equals("2") && b1.getText().equals("1") && b3.getText().equals("3") && b4.getText().equals("4")
            && b5.getText().equals("5") && b6.getText().equals("6") && b7.getText().equals("7") && b8.getText().equals("8")
            && b9.getText().equals("9") && b10.getText().equals("10") && b11.getText().equals("11") && b12.getText().equals("12")
            && b13.getText().equals("13") && b14.getText().equals("14") && b15.getText().equals("15")) {
      b15.setBackground(new Color(255, 163, 11));
    }


  }


  //<========================================================================================================================================

  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == b1) {
      emptychecker(b1, b2);
      emptychecker(b1, b5);
      soltionchecker();
    }
    if (e.getSource() == b2) {
      emptychecker(b2, b1);
      emptychecker(b2, b3);
      emptychecker(b2, b6);
      soltionchecker();
    }
    if (e.getSource() == b3) {
      emptychecker(b3, b2);
      emptychecker(b3, b4);
      emptychecker(b3, b7);
      soltionchecker();
    }
    if (e.getSource() == b4) {
      emptychecker(b4, b3);
      emptychecker(b4, b8);
      soltionchecker();
    }
    if (e.getSource() == b5) {
      emptychecker(b5, b1);
      emptychecker(b5, b6);
      emptychecker(b5, b9);
      soltionchecker();
    }
    if (e.getSource() == b6) {
      emptychecker(b6, b2);
      emptychecker(b6, b5);
      emptychecker(b6, b7);
      emptychecker(b6, b10);
      soltionchecker();
    }
    if (e.getSource() == b7) {
      emptychecker(b7, b3);
      emptychecker(b7, b6);
      emptychecker(b7, b8);
      emptychecker(b7, b11);
      soltionchecker();
    }
    if (e.getSource() == b8) {
      emptychecker(b8, b4);
      emptychecker(b8, b7);
      emptychecker(b8, b12);
      soltionchecker();
    }
    if (e.getSource() == b9) {
      emptychecker(b9, b5);
      emptychecker(b9, b10);
      emptychecker(b9, b13);
      soltionchecker();
    }
    if (e.getSource() == b10) {
      emptychecker(b10, b6);
      emptychecker(b10, b9);
      emptychecker(b10, b11);
      emptychecker(b10, b14);
      soltionchecker();
    }
    if (e.getSource() == b11) {
      emptychecker(b11, b7);
      emptychecker(b11, b10);
      emptychecker(b11, b12);
      emptychecker(b11, b15);
      soltionchecker();
    }
    if (e.getSource() == b12) {
      emptychecker(b12, b8);
      emptychecker(b12, b11);
      emptychecker(b12, b16);
      soltionchecker();
    }
    if (e.getSource() == b13) {
      emptychecker(b13, b9);
      emptychecker(b13, b14);
      soltionchecker();
    }
    if (e.getSource() == b14) {
      emptychecker(b14, b10);
      emptychecker(b14, b13);
      emptychecker(b14, b15);
      soltionchecker();
    }
    if (e.getSource() == b15) {
      emptychecker(b15, b11);
      emptychecker(b15, b14);
      emptychecker(b15, b16);
      soltionchecker();
    }
    if (e.getSource() == b16) {
      emptychecker(b16, b12);
      emptychecker(b16, b15);
      soltionchecker();
    }
    if (e.getSource() == reset) {
      shuffle();
    }
    if (e.getSource() == solution) {
      b1.setText("1");
      b2.setText("2");
      b3.setText("3");
      b4.setText("4");
      b5.setText("5");
      b6.setText("6");
      b7.setText("7");
      b8.setText("8");
      b9.setText("9");
      b10.setText("10");
      b11.setText("11");
      b12.setText("12");
      b13.setText("13");
      b14.setText("14");
      b15.setText("15");
      b16.setText("");

      soltionchecker();
    }
    if (e.getSource() == exit) {
      quit();
    }
    if (e.getSource() == newgame) {
      counter = 0;

      if (JOptionPane.showConfirmDialog(this, "DO YOU WANT START NEW GAME", "PUZZLE GAME",
              JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
        shuffle();
        noofclick.setText(Integer.toString(counter));
        timer = 1;
      }
      b1.setBackground(new Color(246, 110, 60));
      b2.setBackground(new Color(246, 110, 60));
      b3.setBackground(new Color(246, 110, 60));
      b4.setBackground(new Color(246, 110, 60));
      b5.setBackground(new Color(246, 110, 60));
      b6.setBackground(new Color(246, 110, 60));
      b7.setBackground(new Color(246, 110, 60));
      b8.setBackground(new Color(246, 110, 60));
      b9.setBackground(new Color(246, 110, 60));
      b10.setBackground(new Color(246, 110, 60));
      b11.setBackground(new Color(246, 110, 60));
      b12.setBackground(new Color(246, 110, 60));
      b13.setBackground(new Color(246, 110, 60));
      b14.setBackground(new Color(246, 110, 60));
      b15.setBackground(new Color(246, 110, 60));
      b16.setBackground(new Color(246, 110, 60));
    }
    if(e.getSource()==AI) {
    ai();
    }
  }
  //<========================================================================================================================================

  //<========================================================================================================================================
  int size=4;
  boolean isSolvable(String grid[][]) {
    int countInversions = 0;
    for (int i = 0; i < size * size; i++) {
      for (int j = 0; j < i; j++) {
        if (grid[i][j] == "") {
        } else {
          if (Integer.parseInt(grid[i][j]) > Integer.parseInt(grid[j][i]))
            countInversions++;
        }
      }
    }
    return countInversions % 2 == 0;
  }
public void ai(){
    String grid[][] = new String[4][4];
    grid[0][0]=((b1.getText()));
    grid[0][1]=(b2.getText());
    grid[0][2]=(b3.getText());
    grid[0][3]=(b4.getText());
    grid[1][0]=(b5.getText());
    grid[1][1]=(b6.getText());
    grid[1][2]=(b7.getText());
    grid[1][3]=(b8.getText());
    grid[2][0]=(b9.getText());
    grid[2][1]=(b10.getText());
    grid[2][2]=(b11.getText());
    grid[2][3]=(b12.getText());
    grid[3][0]=(b13.getText());
    grid[3][1]=(b14.getText());
    grid[3][2]=(b15.getText());
    grid[3][3]=(b16.getText());
    System.out.println(grid[3][3]);
    System.out.println(Integer.parseInt(grid[3][3]));
    if(!isSolvable(grid)) JOptionPane.showConfirmDialog(this,"The puzzle is not solvable","Puzzle Game",
            JOptionPane.WARNING_MESSAGE);
        else{
          for(int i =0;i<grid.length;i++){
            for(int j =0 ;j<grid.length;j++){
              if(grid[i][j]==""){
//                TODO code
              }
            }
          }

    }
}
  //<========================================================================================================================================
  public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException,
          InstantiationException, IllegalAccessException {
    UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
    main puzzle = new main();
    Thread t = new Thread(puzzle);
    t.start();
  }
//<========================================================================================================================================

  @Override
  public void windowOpened(WindowEvent e) {
    shuffle();
  }

  @Override
  public void windowClosing(WindowEvent e) {
    int choice = JOptionPane.showConfirmDialog(this, "ARE YOU WANT TO EXIT THE GAME", "PUZZLE GAME",
            JOptionPane.WARNING_MESSAGE);
    if (choice == 0) {
      this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    else {
      this.setDefaultCloseOperation(JFrame.ABORT);
    }
  }

  @Override
  public void windowClosed(WindowEvent e) {

  }

  @Override
  public void windowIconified(WindowEvent e) {
    shuffle();
  }

  @Override
  public void windowDeiconified(WindowEvent e) {

  }

  @Override
  public void windowActivated(WindowEvent e) { Boolean running =true;
  }

  @Override
  public void windowDeactivated(WindowEvent e) {

  }
  //<========================================================================================================================================
  @Override
  public void mouseClicked(MouseEvent e) {

  }

  @Override
  public void mousePressed(MouseEvent e) {

  }

  @Override
  public void mouseReleased(MouseEvent e) {

  }

  @Override
  public void mouseEntered(MouseEvent e) {
    if (e.getSource() == b1) {
      b1.setBackground(new Color(246, 0, 0));
      b1.setBounds(95, 115, 90, 90);
    }
    if (e.getSource() == b2) {
      b2.setBackground(new Color(246, 0, 0));
      b2.setBounds(175, 115, 90, 90);

    }
    if (e.getSource() == b3) {
      b3.setBackground(new Color(246, 0, 0));
      b3.setBounds(255, 115, 90, 90);

    }
    if (e.getSource() == b4) {
      b4.setBackground(new Color(246, 0, 0));
      b4.setBounds(335, 115, 90, 90);

    }
    if (e.getSource() == b5) {
      b5.setBackground(new Color(246, 0, 0));
      b5.setBounds(95, 195, 90, 90);

    }
    if (e.getSource() == b6) {
      b6.setBackground(new Color(246, 0, 0));
      b6.setBounds(175, 195, 90, 90);

    }
    if (e.getSource() == b7) {
      b7.setBackground(new Color(246, 0, 0));
      b7.setBounds(255, 195, 90, 90);

    }
    if (e.getSource() == b8) {
      b8.setBackground(new Color(246, 0, 0));
      b8.setBounds(335, 195, 90, 90);

    }
    if (e.getSource() == b9) {
      b9.setBackground(new Color(246, 0, 0));
      b9.setBounds(95, 275, 90, 90);

    }
    if (e.getSource() == b10) {
      b10.setBackground(new Color(246, 0, 0));
      b10.setBounds(175, 275, 90, 90);

    }
    if (e.getSource() == b11) {
      b11.setBackground(new Color(246, 0, 0));
      b11.setBounds(255, 275, 90, 90);

    }
    if (e.getSource() == b12) {
      b12.setBackground(new Color(246, 0, 0));
      b12.setBounds(335, 275, 90, 90);

    }
    if (e.getSource() == b13) {
      b13.setBackground(new Color(246, 0, 0));
      b13.setBounds(95, 355, 90, 90);

    }
    if (e.getSource() == b14) {
      b14.setBackground(new Color(246, 0, 0));
      b14.setBounds(175, 355, 90, 90);

    }
    if (e.getSource() == b15) {
      b15.setBackground(new Color(246, 0, 0));
      b15.setBounds(255, 355, 90, 90);

    }
    if (e.getSource() == b16) {
      b16.setBackground(new Color(246, 0, 0));
      b16.setBounds(335, 355, 90, 90);

    }
    if (e.getSource() == reset) {
      reset.setBackground(new Color(246, 0, 0));
      reset.setBounds(205, 455, 140, 65);

    }
    if (e.getSource() == newgame) {
      newgame.setBackground(new Color(246, 0, 0));
      newgame.setBounds(245, 537, 210, 60);
    }
    if (e.getSource() == exit) {
      exit.setBackground(new Color(246, 0, 0));
      exit.setBounds(345, 455, 100, 65);

    }
    if (e.getSource() == solution) {
      solution.setBackground(new Color(246, 0, 0));
      solution.setBounds(80, 455, 120, 65);
    }
    if (e.getSource() == AI) {
        AI.setBackground(new Color(246, 0, 0));
        AI.setBounds(85, 537, 160, 60);
      }
    }


  @Override
  public void mouseExited(MouseEvent e) {
    if (e.getSource() == b1) {
      b1.setBackground(new Color(246, 110, 60));
      b1.setBounds(100, 120, 80, 80);
      achieve();
    }
    if (e.getSource() == b2) {
      b2.setBackground(new Color(246, 110, 60));
      b2.setBounds(180, 120, 80, 80);
      achieve();
    }
    if (e.getSource() == b3) {
      b3.setBackground(new Color(246, 110, 60));
      b3.setBounds(260, 120, 80, 80);
      achieve();
    }
    if (e.getSource() == b4) {
      b4.setBackground(new Color(246, 110, 60));
      b4.setBounds(340, 120, 80, 80);
      achieve();
    }
    if (e.getSource() == b5) {
      b5.setBackground(new Color(246, 110, 60));
      b5.setBounds(100, 200, 80, 80);
      achieve();
    }
    if (e.getSource() == b6) {
      b6.setBackground(new Color(246, 110, 60));
      b6.setBounds(180, 200, 80, 80);
      achieve();
    }
    if (e.getSource() == b7) {
      b7.setBackground(new Color(246, 110, 60));
      b7.setBounds(260, 200, 80, 80);
      achieve();
    }
    if (e.getSource() == b8) {
      b8.setBackground(new Color(246, 110, 60));
      b8.setBounds(340, 200, 80, 80);
      achieve();
    }
    if (e.getSource() == b9) {
      b9.setBackground(new Color(246, 110, 60));
      b9.setBounds(100, 280, 80, 80);
      achieve();
    }
    if (e.getSource() == b10) {
      b10.setBackground(new Color(246, 110, 60));
      b10.setBounds(180, 280, 80, 80);
      achieve();
    }
    if (e.getSource() == b11) {
      b11.setBackground(new Color(246, 110, 60));
      b11.setBounds(260, 280, 80, 80);
      achieve();
    }
    if (e.getSource() == b12) {
      b12.setBackground(new Color(246, 110, 60));
      b12.setBounds(340, 280, 80, 80);
      achieve();
    }
    if (e.getSource() == b13) {
      b13.setBackground(new Color(246, 110, 60));
      b13.setBounds(100, 360, 80, 80);
      achieve();
    }
    if (e.getSource() == b14) {
      b14.setBackground(new Color(246, 110, 60));
      b14.setBounds(180, 360, 80, 80);
      achieve();
    }
    if (e.getSource() == b15) {
      b15.setBackground(new Color(246, 110, 60));
      b15.setBounds(260, 360, 80, 80);
      achieve();
    }
    if (e.getSource() == b16) {
      b16.setBackground(new Color(246, 110, 60));
      b16.setBounds(340, 360, 80, 80);
      achieve();

    }
    if (e.getSource() == newgame) {
      newgame.setBackground(new Color(246, 110, 60));
      newgame.setBounds(250, 542, 200, 50);

    }
    if (e.getSource() == reset) {
      reset.setBackground(new Color(246, 110, 60));
      reset.setBounds(210, 460, 130, 55);

    }
    if (e.getSource() == solution) {
      solution.setBackground(new Color(246, 110, 60));
      solution.setBounds(85, 460, 110, 55);

    }
    if (e.getSource() == exit) {
      exit.setBackground(new Color(246, 110, 60));
      exit.setBounds(350, 460, 90, 55);
    }
      if (e.getSource() == AI) {
        AI.setBackground(new Color(246, 110, 60));
        AI.setBounds(90, 542, 150, 50);


      }
    }
  //<========================================================================================================================================
  }

