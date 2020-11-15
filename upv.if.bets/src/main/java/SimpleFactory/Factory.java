package SimpleFactory;

import java.net.MalformedURLException;

import businessLogic.BLFacade;

public interface Factory {
	public BLFacade dataBase() throws MalformedURLException;
}
