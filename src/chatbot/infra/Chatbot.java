package chatbot.infra;

public class Chatbot {
	
	private String userName = "YOUR NAME HERE";
	private String botName = "BOT NAME HERE";
	
	
	public Chatbot(String userName, String botName) {
		
		this.userName = userName;
		this.botName = botName;
		
	}
	
	/*
	 * Task 3: Add a response in Chatbot.java to respond to user message
	 * 
	 * Please modify the getResponse() method in the Chatbot class to respond
	 * to three or more different user messages meaningfully. I provided one
	 * example in the getResponse().
	 */
	
	public String getResponse(String nowInputText) {
		
		String nowResponse="THIS IS DEFAULT RESPONSE";
		if(nowInputText.toUpperCase().equals("WE ARE")) {
			nowResponse = "Penn State!";
		}
		
		// Task 3: part 1
		if(nowInputText.equalsIgnoreCase("how are you") || nowInputText.equalsIgnoreCase("how r u") 
				|| nowInputText.equalsIgnoreCase("how are u") || nowInputText.equalsIgnoreCase("hya")
				|| nowInputText.equalsIgnoreCase("how r you")) {
			nowResponse = "Doing great, how can I help you?";
		}
		
		// Task 3: part 2
		if (nowInputText.equalsIgnoreCase("thank you") || nowInputText.equalsIgnoreCase("thanks")
				|| nowInputText.equalsIgnoreCase("thx") || nowInputText.equalsIgnoreCase("tq")) {
			nowResponse = "You're welcome!";
		}
		
		// Task 3: part 3
		if(nowInputText.equalsIgnoreCase("Who's the best chatbot") || nowInputText.equalsIgnoreCase("who is the best chatbot")) {
			nowResponse = "Me!";
		}
	
		
		System.out.println("--------------");
		System.out.println("User Message: "+nowInputText);
		
		System.out.println("Chatbot Response: "+nowResponse);
		return nowResponse;
		
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBotName() {
		return botName;
	}

	public void setBotName(String botName) {
		this.botName = botName;
	}

	
	
	

}
