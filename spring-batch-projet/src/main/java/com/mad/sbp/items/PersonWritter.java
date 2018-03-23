package com.mad.sbp.items;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.mad.sbp.entities.Person;

public class PersonWritter implements ItemWriter<Person> {

	public void write(List<? extends Person> items) throws Exception {
		// TODO Auto-generated method stub
		for(Person item: items) {
			System.out.println(item.toString());
		}
	}

}
