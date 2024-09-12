package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class DictionaryView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DictionaryView frame = new DictionaryView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DictionaryView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1667, 1044);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_tool = new JPanel();
		panel_tool.setBackground(new Color(0, 128, 255));
		contentPane.add(panel_tool, BorderLayout.WEST);
		panel_tool.setLayout(new GridLayout(15,1));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_tool.add(lblNewLabel_2);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_menu, BorderLayout.NORTH);
		panel_menu.setLayout(new GridLayout(1,4));
		
		JLabel jLabel_title = new JLabel("Dictionary");
		jLabel_title.setFont(new Font("Times New Roman", Font.BOLD, 50));
		panel_menu.add(jLabel_title);
		jLabel_title.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(DictionaryView.class.getResource("dictionary.png"))));
		
		JPanel panel_search = new JPanel();
		panel_menu.add(panel_search);
		panel_search.setLayout(new BorderLayout(0, 0));
		
		textField_search = new JTextField();
		textField_search.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_search.add(textField_search, BorderLayout.CENTER);
		textField_search.setColumns(10);
		
		JLabel jLabel_search = new JLabel("");
		panel_menu.add(jLabel_search);
		jLabel_search.setBackground(new Color(255, 255, 255));
		jLabel_search.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(DictionaryView.class.getResource("search2.png"))));
		//jButton_search.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(DictionaryView.class.getResource("search2.png"))));
		
		
		JLabel lblNewLabel = new JLabel("");
		panel_menu.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_menu.add(lblNewLabel_1);
		
		textField_search.setBorder(new RoundedBorder(30));
		
		URL urlIconFrame = DictionaryView.class.getResource("title.png");
		Image img = Toolkit.getDefaultToolkit().createImage(urlIconFrame);
		this.setIconImage(img);
		this.setTitle("Dictionary");
		
		this.setVisible(true);
	}

}
