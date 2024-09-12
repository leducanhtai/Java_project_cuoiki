package test;

import javax.swing.UIManager;

import view.DictionaryView;



public class Main {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new DictionaryView();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
