package Demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import Demo.message.Message;

@XmlType(name="")
public class Service extends Message{
	ArrayList<Message> list = new ArrayList<Message>();

	public List<Message> getAllMessage() {
		list.add(new Message(1,"raghu"));
		return list;
	}
	
	public Message getMessage(int id) {
		for(Message m : list) {
			if(m.getEmpId() == id) {
				return m;
			}
		}
		return null;
	}
}
