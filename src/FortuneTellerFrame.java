import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FortuneTellerFrame extends JFrame {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    JPanel outerPanel;
    JPanel topPanel;
    JPanel midPanel;
    JPanel botPanel;

    JLabel titleLabel;

    JButton quitButton;
    JButton printButton;

    JTextField nameField;

    JTextArea fortuneArea;

    JScrollPane fortuneScroller;

    FortuneTeller fortuneTeller;

    public FortuneTellerFrame() throws HeadlessException {
        fortuneTeller = new FortuneTeller();

        outerPanel = new JPanel();
        topPanel = new JPanel();
        midPanel = new JPanel();
        botPanel = new JPanel();

        titleLabel = new JLabel("Fortune Teller");

        quitButton = new JButton("Quit");

        printButton = new JButton("Print");

        nameField = new JTextField();
        nameField.setColumns(15);

        fortuneArea = new JTextArea(10,50);
        fortuneArea.setEditable(false);

        fortuneScroller = new JScrollPane(fortuneArea);

        printButton.addActionListener(new ClickListener());
        quitButton.addActionListener((ActionEvent actionEvent) -> System.exit(0));

        setSize(WIDTH, HEIGHT);
        setTitle("Fortune Teller Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outerPanel.setLayout(new BoxLayout(outerPanel, BoxLayout.PAGE_AXIS));
        add(outerPanel);

        outerPanel.add(topPanel);
        topPanel.add(titleLabel);

        outerPanel.add(midPanel);
        midPanel.add(fortuneScroller);

        outerPanel.add(botPanel);
        botPanel.add(quitButton);
        botPanel.add(printButton);

        setVisible(true);
    }

    public class ClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            fortuneArea.append(fortuneTeller.getRandomFortune() + "\n");
            System.out.println(fortuneTeller.getRandomFortune() + "\n");
        }
    }
}
