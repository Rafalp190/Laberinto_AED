/** Fase 1 Proyecto AED
 *
 * @author Julio Barahona M
 * @author Rafael Leon
 * @author Pablo Lopez
 *
 * @version 07.31.2016
 * @file MazeSolverRobot.java
 * */

//checks if robot is outside the maze
public class PathTaken {

	public int robotStatus(boolean right, boolean front){
		if(right==true)
			return 0;
		else if(right==false && front==true)
			return 1;
		else 
			return 2;
	}

	public void choice(){

		//makes user input

	}
}