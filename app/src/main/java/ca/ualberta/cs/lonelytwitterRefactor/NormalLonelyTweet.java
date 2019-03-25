package ca.ualberta.cs.lonelytwitterRefactor;

import java.util.Date;

public class NormalLonelyTweet extends Tweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (getTweetBODY().trim().length() == 0
				|| getTweetBODY().trim().length() > 10) {
			return false;
		}

		return true;
	}

}