package com.adl.tugas.controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.adl.tugas.model.ModelQuizFile;

public class QuizController {
	ModelQuizFile model = new ModelQuizFile("D:/bootcamp/quiz.txt");
	
	public int poin = 0;
	
	public void Tampil(int soal_ke, JTextField textPertanyaan, JTextField textJawaban, JTextArea textArea) {
		try {
			if(soal_ke > 0) {
				String line_sebelum = model.getListSoal().get(soal_ke - 1);
				String[] string_sebelum = line_sebelum.split(";");
				if(string_sebelum[0].equalsIgnoreCase("essay")) {
					if(textJawaban.getText().equalsIgnoreCase(string_sebelum[2])) {
						poin += Integer.parseInt(string_sebelum[3]);
					}
				}
				else {
					if(textJawaban.getText().equalsIgnoreCase(string_sebelum[3])) {
						poin += Integer.parseInt(string_sebelum[4]);
					}
				}
			}
			String line = model.getListSoal().get(soal_ke);
			String[] string = line.split(";");
			
			textPertanyaan.setText(string[1]);
			textArea.setText("");
			textJawaban.setText("");
			
			switch(string[0]) {
			case "multiplechoice" :
				for(String pilihan : string[2].split("#")) {
					textArea.setText(textArea.getText() + "\n" + pilihan);
				}
				break;
			case "essay" : 
				textArea.setText("");
				break;
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Point Anda : "+this.poin);
		}
	}
}
