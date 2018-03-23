package com.mad.sbp.items;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.mad.sbp.entities.Person;

public class ListFieldSetMapper implements FieldSetMapper<Person>{

	@Override
	public Person mapFieldSet(FieldSet fs) throws BindException {
		Person p = new Person();
		p.setIdPerson(fs.readInt("idPerson"));
		p.setLastName(fs.readString("lastName"));
		p.setFirstName(fs.readString("firstName"));
		p.setSex(fs.readString("sex"));
		p.setBirthdate(fs.readString("birthdate"));
		return p;
	}

}
