//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String MattsPower= " talking with cats";
String MaClarynsPower=" flying";
String NolansPower= " fat minipulation";
String DaelynsPower= " turning into fox";
String JensensPower=" crustacean mimicry";
		// 2. Ask the user to enter a name. Store their answer in a variable
String name=JOptionPane.showInputDialog(" Enter a name ");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if(name.equals("Matt")){
JOptionPane.showMessageDialog(null, " Matts super power is " + MattsPower);
	}
else if(name.equals("MaClaryn")) {
	JOptionPane.showMessageDialog(null," MaClaryns super power is" + MaClarynsPower);
}
else if(name.equals("Nolan")) {
	JOptionPane.showMessageDialog(null, " Nolans super power is" + NolansPower);
}
else if(name.equals("Daelyn")) {
	JOptionPane.showMessageDialog(null, " Daelyns super power is" + DaelynsPower);
}
else if(name.equals("Jensen")) {
	JOptionPane.showMessageDialog(null, " Jensens super power is" + JensensPower);
}
else {
 JOptionPane.showMessageDialog(null, " You dont have a power");
 }
}
}