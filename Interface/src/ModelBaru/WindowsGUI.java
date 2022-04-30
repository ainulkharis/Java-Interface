package ModelBaru;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowsGUI {
    
    public WindowsGUI(String title, String _Header, int _width, int _height, String _fileImage) {

        this.setTitle(title);
        this.setSize(_width, _height);

        _header = new JLabel(_Header,JLabel.CENTER);
        JPanel panel = new JPanel(new GridLayout(4,4,4,4));

        ImageIcon icon = createImageIcon (_fileImage,"Dress");

        afterClickButton = new JLabel();
        afterClickButton.setSize(350,150);
        afterClickButton.setBounds(150,150,350,150);

        JButton fashion1 = new JButton("Fashion 1");
        fashion1.setBounds(100,100,150,80);
        JButton fashion2 = new JButton("Fashion 2");
        JButton fashion3 = new JButton("Fashion 3");

        fashion1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                afterClickButton.setText("you click fashion 1");
            }
        });

        fashion1.setPreferredSize(new Dimension(100,100));
        panel.add(fashion1);
        this.add(_header);
        this.add(panel);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static ImageIcon createImageIcon(String path, String description) {
        java.net.URL imgURL = WindowsGUI.class.getResource(path);
        System.out.println("path is : "+ imgURL);
        if (imgURL != null) {
            return new ImageIcon(imgURL,description);
        } else {
            System.out.println("Couldn't find file : "+ path);
            return null;
        }
    }
}
