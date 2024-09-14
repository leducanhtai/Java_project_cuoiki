package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controller.DictionaryController;

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
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;

public class DictionaryView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
	
	DictionaryController dictionaryController = new DictionaryController(this);
	private JTextField textField_search;
	private JPanel panel;
	private JMenuItem jMenuItem_search;
	private JMenuItem jMenuItem_help;
	
	private List<JPanel> wordPanels = new ArrayList<>();
	private JPanel panel_1;
	 
	public DictionaryView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1667, 1044);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_tool = new JPanel();
		panel_tool.setBackground(new Color(0, 128, 64));
		contentPane.add(panel_tool, BorderLayout.WEST);
		panel_tool.setLayout(new GridLayout(15,1));
		
		JMenuItem jMenuItem_home = new JMenuItem("Home");
		jMenuItem_home.setForeground(new Color(255, 255, 255));
		jMenuItem_home.setFont(new Font("Segoe UI", Font.BOLD, 14));
		jMenuItem_home.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Desktop\\javaproject\\Java_project_cuoiki\\src\\view\\image\\home.png"));
		jMenuItem_home.setBackground(new Color(0, 0, 0));
		jMenuItem_home.addActionListener(dictionaryController);
		panel_tool.add(jMenuItem_home);
		
		JMenuItem jMenuItem_dowload = new JMenuItem("Dowload");
		jMenuItem_dowload.setFont(new Font("Segoe UI", Font.BOLD, 14));
		jMenuItem_dowload.setForeground(new Color(64, 0, 128));
		jMenuItem_dowload.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Desktop\\javaproject\\Java_project_cuoiki\\src\\view\\image\\dowload.png"));
		panel_tool.add(jMenuItem_dowload);
		
		JMenuItem jMenuItem_game = new JMenuItem("Game");
		jMenuItem_game.setForeground(new Color(255, 255, 255));
		jMenuItem_game.setFont(new Font("Segoe UI", Font.BOLD, 14));
		jMenuItem_game.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Desktop\\javaproject\\Java_project_cuoiki\\src\\view\\image\\game.png"));
		jMenuItem_game.addActionListener(dictionaryController);
		panel_tool.add(jMenuItem_game);
		
		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenuItem_exit.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Desktop\\javaproject\\Java_project_cuoiki\\src\\view\\image\\exit.png"));
		jMenuItem_exit.setFont(new Font("Segoe UI", Font.BOLD, 14));
		jMenuItem_exit.setBackground(new Color(240, 240, 240));
		jMenuItem_exit.setForeground(new Color(64, 0, 128));
		jMenuItem_exit.addActionListener(dictionaryController);
		panel_tool.add(jMenuItem_exit);
		
		jMenuItem_help = new JMenuItem("Help");
		jMenuItem_help.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Desktop\\javaproject\\Java_project_cuoiki\\src\\view\\image\\help.png"));
		jMenuItem_help.setForeground(new Color(255, 255, 255));
		jMenuItem_help.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_tool.add(jMenuItem_help);
		
		panel = new JPanel();
		panel.setBackground(new Color(227, 255, 227));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField_search = new JTextField();
		textField_search.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		textField_search.setBounds(35, 32, 698, 83);
		panel.add(textField_search);
		textField_search.setColumns(10);
		
		jMenuItem_search = new JMenuItem("Search");
		jMenuItem_search.setFont(new Font("Segoe UI", Font.BOLD, 30));
		jMenuItem_search.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Desktop\\javaproject\\Java_project_cuoiki\\src\\view\\image\\search.png"));
		jMenuItem_search.setBounds(743, 32, 179, 83);
		jMenuItem_search.addActionListener(dictionaryController);
		panel.add(jMenuItem_search);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(208, 255, 208));
		panel_1.setBounds(0, 125, 1498, 872);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(100,1));
		
		JScrollPane scrollPane = new JScrollPane(panel_1);
		
//		JPanel panel_word = new JPanel();
//		panel_word.setBackground(new Color(208, 255, 208));
//		panel_1.add(panel_word);
//		panel_word.setLayout(new GridLayout(1,6));
//		
//		JLabel lblNewLabel = new JLabel("New label");
//		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
//		panel_word.add(lblNewLabel);
//		
//		JLabel lblNewLabel_1 = new JLabel("");
//		panel_word.add(lblNewLabel_1);
//		
//		JLabel lblNewLabel_2 = new JLabel("");
//		panel_word.add(lblNewLabel_2);
//		
//		JCheckBox chckbxNewCheckBox = new JCheckBox("Remembered");
//		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.ITALIC, 20));
//		chckbxNewCheckBox.setBackground(new Color(208, 255, 208));
//		// Thêm icon vào JCheckBox
//		ImageIcon uncheckedIcon = new ImageIcon("C:\\Users\\LENOVO\\Pictures\\bright_2.png");
//		ImageIcon checkedIcon = new ImageIcon("C:\\Users\\LENOVO\\Pictures\\bright.png");
//		// Đặt icon khi checkbox chưa được chọn
//		chckbxNewCheckBox.setIcon(uncheckedIcon);
//		// Đặt icon khi checkbox được chọn
//		chckbxNewCheckBox.setSelectedIcon(checkedIcon);
//		panel_word.add(chckbxNewCheckBox);
//		
//		JMenuItem mntmNewMenuItem = new JMenuItem("Dowload");
//		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.ITALIC, 20));
//		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Pictures\\dowload.png"));
//		panel_word.add(mntmNewMenuItem);
		// Tạo 100 panel giống panel_word và lưu vào list
        for (int i = 0; i < 100; i++) {
            JPanel panel_word = createPanelWord(i);
            wordPanels.add(panel_word);  // Lưu vào list
            panel_1.add(panel_word);  // Thêm vào panel_1
        }
		
		scrollPane.setBounds(0, 125, 1498, 872);  // Đặt kích thước và vị trí cho JScrollPane
		panel.add(scrollPane);
		
		URL urlIconFrame = DictionaryView.class.getResource("title.png");
		Image img = Toolkit.getDefaultToolkit().createImage(urlIconFrame);
		this.setIconImage(img);
		this.setTitle("Dictionary");
		
		this.setVisible(true);
	}
	private JPanel createPanelWord(int index) {
        JPanel panel_word = new JPanel();
        panel_word.setBackground(new Color(208, 255, 208));
        panel_word.setLayout(new GridLayout(1, 6));

        JLabel lblNewLabel = new JLabel("Label " + index);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblNewLabel.setForeground(new Color(64, 0, 128));
        panel_word.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("");
        panel_word.add(lblNewLabel_1);
        
        JMenuItem jMenuItem_sound = new JMenuItem("");
        jMenuItem_sound.setFont(new Font("Segoe UI", Font.ITALIC, 20));
        jMenuItem_sound.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Desktop\\javaproject\\Java_project_cuoiki\\src\\view\\image\\sound.png"));
        panel_word.add(jMenuItem_sound);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Remembered");
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.ITALIC, 20));
        chckbxNewCheckBox.setBackground(new Color(208, 255, 208));

        // Thêm icon vào JCheckBox
        ImageIcon uncheckedIcon = new ImageIcon("C:\\Users\\LENOVO\\Desktop\\javaproject\\Java_project_cuoiki\\src\\view\\image\\bright_2.png");
        ImageIcon checkedIcon = new ImageIcon("C:\\Users\\LENOVO\\Desktop\\javaproject\\Java_project_cuoiki\\src\\view\\image\\bright.png");

        // Đặt icon khi checkbox chưa được chọn
        chckbxNewCheckBox.setIcon(uncheckedIcon);
        // Đặt icon khi checkbox được chọn
        chckbxNewCheckBox.setSelectedIcon(checkedIcon);
        panel_word.add(chckbxNewCheckBox);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Dowload");
        mntmNewMenuItem.setFont(new Font("Segoe UI", Font.ITALIC, 20));
        mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Desktop\\javaproject\\Java_project_cuoiki\\src\\view\\image\\dowload.png"));
        panel_word.add(mntmNewMenuItem);

        return panel_word;
    }
	public void runGame() {
		clearPanel();
		
		// Tạo một JButton mới
	    JButton gameButton = new JButton("Start Game");
	    gameButton.setFont(new Font("Segoe UI", Font.BOLD, 30));
	    gameButton.setBackground(new Color(0, 128, 64));
	    gameButton.setForeground(Color.GREEN);
	    gameButton.setBounds(300, 300, 698, 83);

	    // Thêm JButton vào giữa panel
	    panel.add(gameButton);
	    
	    // Cập nhật lại giao diện
	    panel.revalidate();
	    panel.repaint();
	    
	}
	public void startGame() {
		
	}
	public void selectHome() {
		clearPanel();
		// Add textField_search and jMenuItem_search back to the panel
	    panel.add(textField_search);
	    panel.add(jMenuItem_search);
	    
	    clearPanel();
	    
	    // Add textField_search and jMenuItem_search back to the panel
	    panel.add(textField_search);
	    panel.add(jMenuItem_search);

	    // Khôi phục lại JScrollPane và panel_1
	    panel_1.removeAll(); // Xóa hết các phần tử hiện tại của panel_1

	    // Thêm lại các panel word từ danh sách wordPanels
	    for (JPanel wordPanel : wordPanels) {
	        panel_1.add(wordPanel);
	    }

	    // Tạo JScrollPane và thêm vào panel
	    JScrollPane scrollPane = new JScrollPane(panel_1);
	    scrollPane.setBounds(0, 125, 1498, 872);  // Đặt kích thước và vị trí cho JScrollPane
	    panel.add(scrollPane);

	    // Cập nhật lại giao diện
	    panel.revalidate();
	    panel.repaint();

	}
	public void clearPanel() {
	    // Xóa hết các phần tử trên panel
	    panel.removeAll();

	    // Cập nhật lại giao diện
	    panel.revalidate();
	    panel.repaint();
	}
}

