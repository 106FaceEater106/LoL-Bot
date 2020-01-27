import java.awt.*;
import java.awt.event.KeyEvent;

public class ClientPlayer
{
	private RobotPlus rp = new RobotPlus();
	
	public ClientPlayer() throws AWTException {}
	
	public void delay(int milliseconds)
	{
		rp.delay(milliseconds);
	}
	
	public void startQueue()
	{
		//start queue button
		rp.mouseMove(858, 846);
		rp.mouseClick(1);
	}
	
	public void acceptMatch()
	{
		//accept button
		rp.mouseMove(957, 717);
		rp.mouseClick(1);
	}
	
	public void honorTeammate()
	{
		//teammate portrait
		rp.mouseMove(1138, 521);
		rp.mouseClick(1);
		
		//sometimes wont accept only 1 click, client is bad at registering clicks
		rp.delay(250);
		
		rp.mouseClick(1);
	}
	
	public void clickOKButtonPosition1()
	{
		//OK button
		rp.mouseMove(960, 838);
		rp.mouseClick(1);
	}
	
	public void dismissLevelUp()
	{
		clickOKButtonPosition1();
	}
	
	public void dismissMissions()
	{
		clickOKButtonPosition1();
	}
	
	public void playAgain()
	{
		//play again button
		rp.mouseMove(855, 848);
		rp.mouseClick(1);
	}
	
	public void acceptDailyReward()
	{
		//champion portrait's select button
		rp.mouseMove(955, 548);
		rp.mouseClick(1);
		
		//was moving too fast to register properly
		rp.delay(1000);
		
		clickOKButtonPosition1();
	}
	
	public void bypassDailyReward()
	{
		//occasionally the 'select' button is unclickable
		//to avoid stalling
		//clicking on the champion's highlited portion + hitting escape
		//closes the selection screen without selecting a champion
		//the selection screen reappears upon relogging
		
		//THIS DOES NOT AQUIRE THE CHAMPION SHARD
		
		//champion's highlited portion
		rp.mouseMove(970, 653);
		rp.mouseClick(1);
		rp.mouseClick(1);
		rp.mouseClick(1);
		rp.keyClick(KeyEvent.VK_ESCAPE);
		rp.keyClick(KeyEvent.VK_ESCAPE);
		rp.keyClick(KeyEvent.VK_ESCAPE);
	}
	
	public void declineRunePageSaveRequest()
	{
		//No button
		rp.mouseMove(994, 554);
		rp.mouseClick(1);
	}
	
	public void clickOKButtonPosition2()
	{
		//OK button
		rp.mouseMove(960, 556);
		rp.mouseClick(1);
	}
	
	public void dismissCannotCreateCustomRunes()
	{
		clickOKButtonPosition2();
	}
	
	public void dismissProblemSelectingChampion()
	{
		clickOKButtonPosition2();
	}
	
	public void dismissErrorSettingSummonerSpells()
	{
		clickOKButtonPosition2();
	}
}