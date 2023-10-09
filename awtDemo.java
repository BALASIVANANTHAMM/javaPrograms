import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awtDemo extends Frame implements ActionListener {
    Button btn;
    Label label;
    public awtDemo(){
        super("Title");
        setLayout(null);
        setSize(1000,600);

        btn=new Button();
        btn.setBounds(75,75,200,60);
        btn.setLabel("Submit");
        btn.addActionListener(this);
        add(btn);

        label=new Label("");
        label.setBounds(75,150,200,60);
        add(label);

        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        awtDemo aw=new awtDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked....");
    }
}
