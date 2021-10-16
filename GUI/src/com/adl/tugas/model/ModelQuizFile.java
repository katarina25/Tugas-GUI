package com.adl.tugas.model;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ModelQuizFile extends ModelQuiz {
	private String url;
	
	public ModelQuizFile(String url) {
		this.url = url;
		openFile(url);
	}
	public void openFile (String url) {
		File file = new File(url) ;
			try {
				Scanner scan = new Scanner(file);
				while (scan.hasNextLine()) {
					this.addListSoal(scan.nextLine());
				}
				scan.close();
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "dfile tidak ditemukan");
			}
		
	}
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}	
	
}
