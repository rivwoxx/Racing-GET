package com.rivwox.racing.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component("ConsUtil")
public class ConsUtilImpl implements ConsUtil {

	@Override
	public JsonNode getJson(List<Object[]> list, String chain) {
		List<Map<String, String>> result = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		String[] names = chain.split(",");
		for (Object[] reg : list) {
			int i = 0;
			Map<String, String> entity = new HashMap<>();
			for (String field : names) {
				String value = String.valueOf(reg[i]);
				entity.put(field.trim(), value);
				i++;
			}
			result.add(entity);
		}
		JsonNode jsonResult = mapper.valueToTree(result);
		result.clear();
		return jsonResult;
	}

}
