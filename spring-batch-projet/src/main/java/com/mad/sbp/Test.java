package com.mad.sbp;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		String[] springConfig  = {"spring/batch/setup/application-context.xml" };
		
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		//JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		//Job job = (Job) context.getBean("mainJob");
		
		/*
		try {
			
			JobParameters parameters = new JobParametersBuilder()
			        .addLong("currentTime", new Long(System.currentTimeMillis()))
			        .toJobParameters();

			JobExecution execution = jobLauncher.run(job, parameters);
			System.out.println("Exit Status : " + execution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Done");
		*/
	}

}
