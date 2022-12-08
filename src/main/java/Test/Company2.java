package Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

import j17_JSON.User;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Company2 {
	
	@Expose(serialize = true, deserialize = true)
	private int companyId;
	@Expose(serialize = true, deserialize = true)
	private String companyName; 
	@Expose(serialize = true, deserialize = true)
	private String address;
	@Expose(serialize = true, deserialize = true)
	private String city;
	@Expose(serialize = true, deserialize = true)
	private String state;
	@Expose(serialize = true, deserialize = true)
	private String zipCode;
	
}