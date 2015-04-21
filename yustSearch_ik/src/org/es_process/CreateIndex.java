package org.es_process;

import java.io.IOException;
import java.util.List;


/**
 * index只需要创建一次，如果index 创建的话不要再次调用
 */
public class CreateIndex {
	public static void main(String[] args) throws IOException {
		ElasticSearchHandler esHandler = new ElasticSearchHandler("127.0.0.1");

		String indexname = "yustsearch_ik";
		String type = "yust_demo";
		esHandler.createIndexResponse(indexname);
		esHandler.createMapping(indexname, type);
		esHandler.addDoc(indexname, type);

	}
}
