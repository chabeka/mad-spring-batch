package com.mad.sbp.items;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.mad.sbp.entities.Person;

public class TestDeux implements ItemWriter<Person>{

	@Override
	public void write(List<? extends Person> items) throws Exception {
		System.out.println("test deux");
		
	}

}
