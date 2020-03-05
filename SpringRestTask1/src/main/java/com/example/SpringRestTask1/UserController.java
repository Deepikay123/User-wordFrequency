package com.example.SpringRestTask1;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.Response.Acknowledgement;
//import com.example.Response.InputDataResponse;

@RestController
public class UserController {
	
	
	@Value("${frequency.word}")
	String output1;
	
	@PostMapping("/inputDetails/")
	public String getData(@RequestBody User user) {
	
		String paragraph = user.getAbout();
		
		String emailline = user.getEmail();
		
		
		String words[] = paragraph.split(" ");
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		
			System.out.println(""+emailline);
			
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(emailline);
			System.out.println(match.matches());
				
		
	String output = null;
	
	Map<String ,String> maxFreq = new HashMap<String,String>();
		
		for(int i=0;i<words.length;i++){
			String word = words[i].toUpperCase();
			if(maxFreq.get(word) != null ){
				output = word;
				
				//System.out.println(""+word);	
				
			}
			else{
				maxFreq.put(word, word);
			}
			
		}
		System.out.println(""+output);	
		return output;
	}
		@PostMapping("/inputDetails/frequencyword")
		public int getwordFrequeny(@RequestBody User user) {
	  
			String paragraph = user.getAbout();
			
			String emailline = user.getEmail();
			
			
			String words[] = paragraph.split(" ");
			
			String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
			
				System.out.println(""+emailline);
				
				Pattern pattern = Pattern.compile(regex);
				Matcher match = pattern.matcher(emailline);
				System.out.println(match.matches());
				
              //logic for counting frequency of given word
		      int count = 0;
		      for (int i = 0; i < words.length; i++) {
		         if (output1.equals(words[i])) 
		            count++;
		      }
		      System.out.println("The string is: " + paragraph);
		      System.out.println("The word " + output1 + " occurs " + count + " times in the above string");
		      return count;  
		}
		
	}






