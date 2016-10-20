package Study_02;

import java.util.List;

public class CustomerList {

	private List<String> lists;
	
	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	@Override
	public String toString() {
		return "CustomerList [lists=" + lists + "]";
	}

}