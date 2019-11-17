package com.develop24k.gridgaindataloader;

import com.develop24k.gridgaindataloader.core.DataLoaderService;
import com.develop24k.gridgaindataloader.core.GridGain;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GridgainDataloaderApplication implements CommandLineRunner {

	@Autowired
	private DataLoaderService service;

	private static final Logger logger = LoggerFactory.getLogger(GridgainDataloaderApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(GridgainDataloaderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

        service.createSchema();

        service.loadData();



        Ignition.setClientMode(true);


		try (Ignite ignite = Ignition.start()) {

			IgniteConfiguration cfg = new IgniteConfiguration();

			cfg.setSqlSchemas("MRDM_LITE2");
		}



	}
}
