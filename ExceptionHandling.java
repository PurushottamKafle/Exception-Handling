package pksoft;
import javax.swing.*;
public class first  { // start of class
	
public static void main(String args[]) {

JOptionPane obj = new JOptionPane();
int loop=0;
do {
try {
String x = obj.showInputDialog(null, "Enter First Number: ");
String x1 = obj.showInputDialog(null, "Enter Second Number: ");

int y = Integer.parseInt(x);
int z = Integer.parseInt(x1);

int sum = y/z;
obj.showMessageDialog(null, "Your Answer is: "+sum);
loop =2;


}catch(Exception e) {
	obj.showMessageDialog(null,  "Something gone wrong!");
}
}while(loop==0);


}

}// end of class
