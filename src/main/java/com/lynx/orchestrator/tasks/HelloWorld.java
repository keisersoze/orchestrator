package com.lynx.orchestrator.tasks;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class HelloWorld implements JavaDelegate{
	private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Merry Christmas");
	}

}
