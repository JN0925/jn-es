package com.jn;

import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class JnEsApplicationTests {

	@Autowired
	RestHighLevelClient restHighLevelClient;

	@Test
	void contextLoads() throws IOException {
		CreateIndexRequest createIndexRequest = new CreateIndexRequest("java_test_1");
		CreateIndexResponse response = restHighLevelClient.indices().create(createIndexRequest, RequestOptions.DEFAULT);
		System.out.println(response.isAcknowledged());
	}
}
