package com.spring.batch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class ProductJobListener implements JobExecutionListener {

	public void beforeJob(JobExecution jobExecution) {
		System.out.println("Before processing job : " + jobExecution.getId() );
	}

	public void afterJob(JobExecution jobExecution) {
		System.out.println("After processing job : " + jobExecution.getId() );
	}

}
