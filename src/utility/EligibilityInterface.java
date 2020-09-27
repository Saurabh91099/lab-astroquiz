package utility;

import model.User;

interface EligibilityInterface{
	abstract boolean checkUser (User user);
	
	abstract boolean checkQuizAnswer(String points);
}