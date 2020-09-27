package utility;

import model.User;

//EligibilityCheck which extends the abstract class BasicEligibility and implements EligibilityInterface
public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		
		if((user.getAge()>=18 &&user.getAge()<=35) && (user.getHeight()>=155 && user.getHeight()<=170) &&(user.getWeight()>=55 && user.getWeight()<=90)
				&&(user.getCountry().contentEquals("ProGrad")))
		{
			return true;
		}
		else {
		return false;}
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		User u=new User(points, points, 0, 0, 0, points);
		int number=Integer.parseInt(u.getNumber());
		if(number>80) {
			return true;
		}
		return false;
	}

	@Override
	public
	boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean checkQuizAnswers(String points) {
		// TODO Auto-generated method stub
		return false;
	}
	
}






