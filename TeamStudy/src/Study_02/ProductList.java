package Study_02;

import java.util.Map;

public class ProductList {
	private Map<Integer, String> maps;

	public void setMaps(Map<Integer, String> maps) {
		this.maps = maps;
	}

	@Override
	public String toString() {
		return "ProductList [maps=" + maps + "]";
	}
}
