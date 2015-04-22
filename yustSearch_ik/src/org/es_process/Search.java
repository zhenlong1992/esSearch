package org.es_process;

import java.util.List;

import org.entity.Document;

public class Search {
	private static String INDEX_NAME = "yustsearch_ik";
	private static String TYPE = "yust_demo";

	public static void main(String[] args) {
		ElasticSearchHandler esHandler = new ElasticSearchHandler("127.0.0.1",
				9300);
		String query = "你好";

		List<Document> result = esHandler.searcher(query, INDEX_NAME, TYPE);
		System.out.println("query: " + query);

		for (int i = 0; i < result.size(); i++) {
			Document document = result.get(i);
			System.out
					.println("doc" + document.getId() + "\n url:"
							+ document.getUrl() + "\n content:"
							+ document.getContent());
		}
	}
}
