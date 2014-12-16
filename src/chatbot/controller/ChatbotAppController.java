package chatbot.controller;

import java.awt.Component;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotPanel;
import chatbot.view.ChatbotView;
/**
 * Application Controller for the Chatbot String
 * @author teat7438
 *
 */
public class ChatbotAppController
{	
	private ChatbotView appView;
	/**
	 * The GUI view for the application.
	 */
	private Chatbot notSoCleverBot;
	/**
	 * The ChatBot Model instance.
	 */
	private String startMessage;
	/**
	 * Creates a ChatbotAppController and initializes the associated View and Model objects.
	 */
	private String endMessage;
	
	private ChatbotFrame baseFrame;
	/**
	 * Creates a ChabotAppController and initializes the associated View and Model Objects
	 */
	
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		notSoCleverBot = new Chatbot("Mr. not so clever");
		baseFrame = new ChatbotFrame(this);
	}
	
	
	/**
	 * Allows other objects access to the notSoCleverbot
	 * @return The Chatbot for this app.
	 */
	public Chatbot getNotSocleverBot()
	{
		return notSoCleverBot;
	}
	/**
	 * Starts the Chatbot Application
	 */
	
	public void start()
	{
		ChatbotPanel myAppPanel = (ChatbotPanel)baseFrame.getContentPane();
		myAppPanel.displayTextToUser(startMessage);
		
		//((ChatbotPanel) baseFrame.getContentPane()).displayTextToUser(startMessage);
		
			String message = notSoCleverBot.processText();
			message = appView.displayChatbotConversations(message);
		
			
	}

	public String sendTextToChatBot(String userInput)
	{
		String respondText = "";
		
		respondText = notSoCleverBot.processText(userInput);
		
		return respondText;
	}
	
	/**
	 * Quits the Chatbot application with a message to the user that the application is closing.
	 */
	private void quit()
	{
		appView.displayInformation("goodbye cruel user :(");
		System.exit(0);
	}
	/**
	 * Closes out of Chatbot Application.
	 */


	public Component getBaseFrame()
	{
		// TODO Auto-generated method stub
		return null;
	}


	public String sendTextToChatBot1(String userTypedText)
	{
		// TODO Auto-generated method stub
		return null;
	}



	
}
