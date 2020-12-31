package asia.twentyci.utilities;

import java.io.File;

import jxl.write.DateTime;

public class FileUtilties {

	File tempFile = new File("C:/Users/ADMIN/XuanNguyen/Downloads");
	boolean exists = tempFile.exists();

	DateTime actualDateTime = new DateTime();
	DateTime timeout = actualDateTime.plusMinutes(15);

	int current = 0;

	while(current!=timeout.getSecondOfDay())
	{
		if (tempFile.exists()) {
			// LOGGER.info("The Downloading is Completed! ");
			break;
		}
		current = new DateTime().getSecondOfDay();
	}

}
