package com.mad.sbp.items;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.mad.sbp.entities.Person;

public class TestUn implements FieldSetMapper<Person>{

	@Override
	public Person mapFieldSet(FieldSet fieldSet) throws BindException {
		System.out.println("test un");
		return null;
	}

}
