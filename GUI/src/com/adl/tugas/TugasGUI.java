package com.adl.tugas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import com.adl.tugas.controller.QuizController;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class TugasGUI {

	private JFrame frame;
	private JTextField textPertanyaan;
	private JTextField textJawaban;
	QuizController controller = new QuizController();
	int soal_ke = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasGUI window = new TugasGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TugasGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textPertanyaan = new JTextField();
		textPertanyaan.setBounds(38, 31, 381, 58);
		frame.getContentPane().add(textPertanyaan);
		textPertanyaan.setColumns(10);
		
		textJawaban = new JTextField();
		textJawaban.setBounds(38, 208, 282, 23);
		frame.getContentPane().add(textJawaban);
		textPertanyaan.setColumns(10);
		
		JButton btnNewButton = new JButton("next");
		btnNewButton.setBounds(330, 208, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(38, 97, 381, 100);
		frame.getContentPane().add(textArea);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				soal_ke += 1;
				controller.Tampil(soal_ke, textPertanyaan, textJawaban, textArea);
			}
		});
		
	}
}
