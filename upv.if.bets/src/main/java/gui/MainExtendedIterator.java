package gui;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import Iterator.ExtendedIterator;
import businessLogic.BLFacade;
import configuration.UtilDate;
import domain.Event;

public class MainExtendedIterator {

	public MainExtendedIterator(Date d) {
		boolean isLocal=true;
		//Facade objektua lortu lehendabiziko ariketa erabiliz
		//BLFacade facadeInterface=……….
		BLFacade facade=MainGUI.getBusinessLogic();
		ExtendedIterator<Event> i=facade.getEvents(d);
		Event ev;
		i.goLast();
		System.out.println("Atzetik Aurrera");
		while (i.hasPrevious()){
			ev=i.previous();
			System.out.println(ev);
		}
		//Nahiz eta suposatu hasierara ailegatu garela, eragiketa egiten dugu.
		i.goFirst();
		System.out.println("Aurretik Aztera");
		while (i.hasNext()){
			ev=(Event) i.next();
			System.out.println(ev);
		}
	}
}
