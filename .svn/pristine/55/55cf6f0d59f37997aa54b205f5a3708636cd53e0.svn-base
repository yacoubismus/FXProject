package de.kartellamt.commandline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CommandlineExecuter {
	
	
	public static HashSet<String> getUserDomainGroupList()
	{
		Process pr;

		HashSet<String> groupList = new HashSet<String>();
		com.sun.security.auth.module.NTSystem nts = new com.sun.security.auth.module.NTSystem();
		try
		{
			boolean groupHeaderFound = false;
			// Kommandozeilenaufruf zusammenbauen
			String cmdCommand = "net user " + nts.getName() + " /domain";
			pr = Runtime.getRuntime().exec(cmdCommand);
			BufferedReader input = new BufferedReader(new InputStreamReader(
					pr.getInputStream()));
			String line = null;

			while ((line = input.readLine()) != null)
			{
				if (line.contains("Globale Gruppenmitgliedschaften")
						|| groupHeaderFound)
				{
					groupHeaderFound = true;
					String gruppe = line.substring(line.indexOf('*') + 1).trim();
					groupList.add(gruppe);
				}
			}
		}
		catch (IOException exception)
		{
			//logger.error(exception.getMessage());
			exception.printStackTrace();
		}
		return groupList;
	}

}
