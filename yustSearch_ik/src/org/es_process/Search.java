package org.es_process;

import java.util.List;
import org.entity.Document;

public class Search {

	public static void main(String[] args) {
		ElasticSearchHandler esHandler = new ElasticSearchHandler("127.0.0.1");
		String indexname = "yustsearch_ik";
		String type = "yust_demo";
		String query = "你好";

		List<Document> result = esHandler.searcher(query, indexname, type);
		System.out.println("query: " + query);

		for (int i = 0; i < result.size(); i++) {
			Document document = result.get(i);
			System.out.println("url:" + document.getUrl() + "\n content:"
					+ document.getContent());
		}
	}
}
