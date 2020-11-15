package Adapter;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import businessLogic.BLFacade;
import domain.Bet;
import domain.Event;
import domain.Kuota;
import domain.Question;
import domain.User;
import gui.MainGUI;

public class UserAdapter extends AbstractTableModel{
	int luzera;
	private final Vector<Bet> bet;
	private String[] colNames = new String[] {"Event","Question","EventDate","Bet"};
	public UserAdapter(User u) {
		bet =u.getbetlista();
		luzera = bet.size();
	}
	
	public int getRowCount() {
		return luzera;
	}

	public int getColumnCount() {
		return 4;
	}
	
	public String getColumnName(int col) {
		return colNames[col];
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		Bet o = bet.get(rowIndex);
		int k = o.getKuotaId();
		BLFacade facade=MainGUI.getBusinessLogic();
		Kuota kuota=facade.getKuota(k);
		int q=kuota.getQuestionId();
		Question question = facade.getQuestion(q);
		Event ev = question.getEvent();
		switch(columnIndex) {
			case 0: return ev.getDescription();
			case 1: return question.getQuestion();
			case 2:	return ev.getEventDate();
			case 3:	return o.getZenbatDiru();
		}
		return null;
	}
	
	public String[] getColNames() {
		return this.colNames;
	}
	
}



