package com.adl.tugas.model;

import java.util.ArrayList;
import java.util.List;

public class ModelQuiz {
	List<String> listSoal = new ArrayList<String>();


	public void addListSoal(String soal) {
		this.listSoal.add(soal);
	}
	
	public List<String> getListSoal() {
		return listSoal;
	}

	public void setListSoal(List<String> listSoal) {
		this.listSoal = listSoal;
	}

	
	
	
	
	
	

}
