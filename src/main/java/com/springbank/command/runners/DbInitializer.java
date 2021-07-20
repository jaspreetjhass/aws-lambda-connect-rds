package com.springbank.command.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import com.amazonaws.services.rds.AmazonRDS;
import com.amazonaws.services.rds.model.CreateDBInstanceRequest;

@ConditionalOnBean(value = AmazonRDS.class)
@Component
public class DbInitializer implements CommandLineRunner {

	@Autowired
	private AmazonRDS amazonRDS;

	@Override
	public void run(final String... args) throws Exception {
		final CreateDBInstanceRequest request = new CreateDBInstanceRequest();
		request.setDBInstanceIdentifier("test-db-instance");
		request.setDBInstanceClass("db.t2.micro");
		request.setEngine("mysql");
		request.setMultiAZ(false);
		request.setMasterUsername("admin");
		request.setMasterUserPassword("admin");
		request.setDBName("testdb");
		request.setStorageType("gp2");
		request.setAllocatedStorage(10);

		amazonRDS.createDBInstance(request);
	}

}
