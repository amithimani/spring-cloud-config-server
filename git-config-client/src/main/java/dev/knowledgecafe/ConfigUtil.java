package dev.knowledgecafe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConfigUtil {

	@Autowired
	private Environment env;

	public String getDatabaseName() {
		return env.getProperty("db.name");
	}

}
