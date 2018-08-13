
public class TT {
public static void main(String[] args) {
	String date="2018-02-01";
	date=date.replaceAll("-", "");
	System.out.println(date);
	
	String str="2018052100000";
	str=str.substring(0,8);
	System.out.println(str);
}
}
