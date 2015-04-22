package org.es_process;

import java.io.IOException;
import java.util.List;

/**
 * index只需要创建一次，如果index 创建的话不要再次调用
 */
public class CreateIndex {
	private static String INDEX_NAME = "yustsearch_ik";
	private static String TYPE = "yust_demo";

	public static void main(String[] args) throws IOException {
		ElasticSearchHandler esHandler = new ElasticSearchHandler("127.0.0.1",
				9300);
		System.out.println("Start create Index");
		esHandler.createIndexResponse(INDEX_NAME);
		System.out.println("create Index over. Start mapping");
		esHandler.createMapping(INDEX_NAME, TYPE);
		System.out.println("Mapping over, Start add Documents to index");
		esHandler.addDoc(INDEX_NAME, TYPE);
		System.out.println("add Documents over");

	}
}
