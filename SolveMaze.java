/** Fase 1 Proyecto AED
 *
 * @author Julio Barahona M
 * @author Rafael Leon
 * @author Pablo Lopez
 *
 * @version 07.31.2016
 * @file SolveMaze.java
 * */

public class SolveMaze{

	private boolean front;
	private boolean right;
	private Robot newRobot;
	private PathTaken decidir;
	private boolean fin=false;

	public void Play(){
	}

	public void run(){
		int escoger = decidir.desicion();
		if(escoger==0)
			newRobot.spinRobotRight();
		else if(escoger==1){
			newRobot.goForward();
		else
			newRobot.spinRobotLeft();
		}
	}

	public void setFront(boolean front){
		this.front=front;
	}

	public void setRight(boolean right){
		this.right=right;
	}

	public void setFin(boolean fin){
		this.fin=fin;
	}

	public boolean getFront(){
		return front;
	}

	public boolean getRight(){
		return right;
	}

	public boolean getFin(){
		return fin;
	}

}


