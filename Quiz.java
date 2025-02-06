import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Quiz extends JFrame implements ActionListener 
{	
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) throws IOException
	{
		JFrame f=new JFrame("Start Quiz"); 
		JTextField t1,t2;
		t1=new JTextField("Enter your Name here.");  
	    t1.setBounds(1135,225, 200,30); 
	    t1.setSize(300, 40);
	    t1.setFont(new Font("Serif", Font.PLAIN, 17));
	    t2=new JTextField("Enter your Roll Number here");  
	    t2.setBounds(1135,270, 200,30);  
	    t2.setFont(new Font("Serif", Font.PLAIN, 17));
	    t2.setSize(300, 40);
	    f.add(t1); f.add(t2); 
	    JLabel l1;  
	    l1=new JLabel("Click on the button to proceed.");  
	    l1.setBounds(1170,330, 300,30);  
	    l1.setFont(new Font("Arial", Font.BOLD, 16));
	    f.add(l1); 
	    JButton b=new JButton("Start Quiz");  
	    b.setBounds(1220,380,126,40);  
	    b.setFont(new Font("Arial", Font.PLAIN, 16));
	    b.setHorizontalTextPosition(JButton.CENTER);
	    b.setBackground(Color.CYAN);
	    f.add(b);  
	    f.setSize(1920,1080);

	    	 
	        File file = new File("quiz_image.png");
	        BufferedImage bufferedImage = ImageIO.read(file);
	        ImageIcon imageIcon = new ImageIcon(bufferedImage);
	        f.setLayout(new FlowLayout());
	        JLabel jLabel = new JLabel();
	        jLabel.setBounds(0, 0, 1400, 795);
	        jLabel.setIcon(imageIcon);
	        f.add(jLabel);
	        f.add(new JLabel(imageIcon));
	        Color color=new Color( 204, 255, 255);
	        f.getContentPane().setBackground(color);
	        
	    f.setLayout(null);  
	    f.setVisible(true);  
		b.addActionListener(new Quiz());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	public void actionPerformed(ActionEvent e)
	{
    int i, j, k = 100, m = 140, n = 0;
    JFrame d = new JFrame("Quiz");
    d.setSize(1920, 1080);
    
    JPanel container = new JPanel();
    container.setLayout(null);
    container.setPreferredSize(new Dimension(1800, 2000)); 
    container.setBackground(new Color(205, 205, 205));

    JLabel l2 = new JLabel("Choose the right answer among the four options for the given questions.");
    l2.setBounds(30, 30, 1000, 30);
    l2.setFont(new Font("Arial", Font.BOLD, 22));
    container.add(l2);

    String[] questions = {
        "1. What year was the very first model of the iPhone released?",
        "2. What’s the shortcut for the “copy” function on most computers?",
        "3. What is often seen as the smallest unit of memory?",
        "4. What does “HTTP” stand for?",
        "5. Which email service is owned by Microsoft?",
        "6. Google Chrome, Safari, Firefox, and Explorer are different types of what?",
        "7. What was Twitter’s original name?",
        "8. Who is often called the father of the computer?"
    };

    String[] opt = {
        "a. 2004", "b. 2005", "c. 2006", "d. 2007",
        "a. alt c", "b. ctrl c", "c. fn c", "d. ctrl v",
        "a. gb", "b. mb", "c. kb", "d. Byte",
        "a. Hypertext Transmission Protocol", "b. HyperText Transfer Protocol", "c. Hyper Text Protocol", "d. Hypertext tech protocol",
        "a. Yahoo", "b. Gmail", "c. Outlook", "d. Hotmail",
        "a. OS", "b. Caches", "c. Content Management Systems", "d. Browsers",
        "a. Tweet", "b. twttr", "c. twt", "d. Tweeter",
        "a. Charles Babbage", "b. Hollerith", "c. Newmann", "d. Pascal"
    };

    JRadioButton arr[][] = new JRadioButton[8][4];

    for (i = 0; i <= 7; i++)
    {
        JLabel l = new JLabel(questions[i]);
        l.setBounds(30, k, 700, 30);
        l.setFont(new Font("Arial", Font.PLAIN, 18));
        k = k + 200;
        container.add(l);

        for (j = 0; j <= 3; j++)
        {
            JRadioButton r = new JRadioButton(opt[n]);
            r.setBounds(80, m, 300, 30);
            r.setFont(new Font("Arial", Font.PLAIN, 14));
            r.setBackground(new Color(205, 205, 205)); 
            container.add(r);
            m = m + 40;
            n++;
            arr[i][j] = r;
        }
        m = m + 40;
    }

    JButton b1 = new JButton("Submit");
    b1.setBounds(700, k, 100, 40);
    b1.setFont(new Font("Arial", Font.BOLD, 17));
    b1.setForeground(Color.BLACK);
    b1.setBackground(new Color(105, 105, 105));
    container.add(b1);

    JScrollPane scrollPane = new JScrollPane(container, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    scrollPane.setBounds(0, 0, 1900, 1000);

    d.add(scrollPane);
    d.setLayout(new BorderLayout()); 
    d.setVisible(true);

	b1.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		int sum=0;
	    		JFrame g=new JFrame("Result"); 
	    		g.setSize(1920,1080);
	    		 Color color1=new Color( 238,223,222);
	 	        g.getContentPane().setBackground(color1);
	    		g.setLayout(null);
	    		g.setVisible(true);
	    		
	    		if (arr[0][3].isSelected()) 
	    		{
	    			sum=sum+1;
	    		}
	    		if (arr[1][1].isSelected()) 
				{
	    			sum=sum+1;
				}
	    		if (arr[2][2].isSelected()) 
	    		{
	    			sum=sum+1;
	    		}
	    		if (arr[3][1].isSelected()) 
	    		{
	    			sum=sum+1;
	    		}
	    		if (arr[4][3].isSelected()) 
	    		{
	    			sum=sum+1;
	    		}
	    		if (arr[5][3].isSelected()) 
	    		{
	    			sum=sum+1;
	    		}
	    		if (arr[6][1].isSelected()) 
	    		{
	    			sum=sum+1;
	    		}
	    		if (arr[7][0].isSelected()) 
	    		{
	    			sum=sum+1;
	    		}
	    		JLabel l3;  
			    l3=new JLabel("Your Result is: "+ sum);  
			    l3.setBounds(600,300, 1000,60);  
			    l3.setFont(new Font("Arial", Font.BOLD, 40));
			    g.add(l3);
			    JButton b2=new JButton("Exit");  
				b2.setBounds(700,400,100,40); 
				b2.setFont(new Font("Arial", Font.BOLD, 20));
				b2.setForeground(Color.BLACK);
			    b2.setHorizontalTextPosition(JButton.CENTER);
			    b2.setBackground(new Color(98, 91, 91));
				g.add(b2);  
				b2.addActionListener(new ActionListener()
				    {
				    	public void actionPerformed(ActionEvent e)
				    	{
				    		g.dispose();
				    		d.dispose();
				    	}
				    });
			}
		});
	
	}

}







