package Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Builder;

@Builder
public class Company {

	private int companyId;
	private String companyName; 
	private String address;
	private String city;
	private String state;
	private String zipCode;
	
	public static void main(String[] args) {
		
		Company2 company = Company2.builder()
				.companyId(100)
				.companyName("Apple")
				.address("Apple Computer Inc. 1 infinite Loop")
				.city("Cupertino")
				.state("CA")
				.zipCode("95014")
				.build();
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()
				.excludeFieldsWithoutExposeAnnotation()
				.create();
		
		String userJson = gson.toJson(company);
		System.out.println(userJson);
	}
	
}