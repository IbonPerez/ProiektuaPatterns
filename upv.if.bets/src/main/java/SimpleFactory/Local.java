package SimpleFactory;

import businessLogic.BLFacade;
import businessLogic.BLFacadeImplementation;
import configuration.ConfigXML;
import dataAccess.DataAccess;

public class Local implements Factory{

	public BLFacade dataBase() {
		ConfigXML c=ConfigXML.getInstance();
		DataAccess da=new DataAccess(c.getDataBaseOpenMode().equals("initialize"));
		BLFacadeImplementation appFacadeInterface=new BLFacadeImplementation(da);
		return appFacadeInterface;
	}
}
