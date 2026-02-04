package JSON.demo;

import java.io.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonFiles {

	public static void main(String[] args) throws Exception{
		
		ObjectMapper mapper = new ObjectMapper();

        JsonNode json1 = mapper.readTree(new File("C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\jsonDataHandling\\demo\\src\\main\\java\\JSON\\demo\\user2.json"));
        JsonNode json2 = mapper.readTree(new File("C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\jsonDataHandling\\demo\\src\\main\\java\\JSON\\demo\\user3.json"));

        ObjectNode merged = mapper.createObjectNode();

        merged.setAll((ObjectNode) json1);
        merged.setAll((ObjectNode) json2);

        String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(merged);
        System.out.println(result);

	}

}
