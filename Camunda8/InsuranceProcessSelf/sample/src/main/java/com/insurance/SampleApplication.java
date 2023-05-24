package com.insurance;

import java.io.File;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		String URL = "../resources/pleasework.html";
//		File file = new File(URL);
//		Desktop.getDesktop().browse(file.toURI());

		Document doc = Jsoup.parse(new File("C:\\Users\\HariharanB\\InnovationTeam\\Camunda8\\InsuranceProcess\\sample\\src\\main\\resources\\static\\index.html"),"utf-8");  
        String title = doc.title();  
        System.out.println("title is: " + title);  
	}

}
