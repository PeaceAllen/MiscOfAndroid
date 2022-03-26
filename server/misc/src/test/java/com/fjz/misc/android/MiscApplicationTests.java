package com.fjz.misc.android;

import com.fjz.misc.android.entity.Configurations;
import com.fjz.misc.android.service.TransferService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MiscApplicationTests {

	@Autowired
	TransferService transferService;
	@Test
	void contextLoads() {


		Configurations config = transferService.getValueByKey("key-2");

		System.out.println("config = " + config);



	}

}
