import java.util.Arrays;
import java.util.Scanner;
public class GDC {
	Scanner in= new Scanner(System.in);
private static int count;
private GDC[] AddC =new GDC [10];
private String name;
private int C_id;
private String C_Address;
public GDC() {
	this(null,0,null);
}
public GDC (String name,int C_id, String C_Adress) {
	this.setName(name);
	this.setC_id(C_id);
	this.setC_Address(C_Adress);
	++count;
}
public String getName() {
	return name;

}
public void setName(String name) {
	this.name = name;
}
public int getC_id() {
	return C_id;
}
public void setC_id(int c_id) {
	C_id = c_id;
}
public String getC_Address() {
	return C_Address;
}
public void setC_Address(String c_Address) {
	C_Address = c_Address;
}

public static int getCount() {
	return count;
}
public GDC[] AddCo (GDC X) {
 for (int i = 0 ; i < AddC.length ; i++) {
	 		AddC[i]=X;
 }
return AddC;
}
public void PrintAllC() {
for (GDC X:AddC) {
	System.out.println(X);
}
}
public void ModCo(String name,int C_id,String C_Address) {
	setName(name);
	setC_id(C_id);
	setC_Address(C_Address);
}

public static void DelC (int [] AddC,int index) {
	int [] DelC = new int[AddC.length-1];
	int Cost = AddC.length - (index - 1);
	System.arraycopy(AddC , index + 1 , DelC , index , Cost);
	System.out.println("Coustmers are:"+Arrays.toString(DelC));
}
public String toString() {
	return " Name: " +getName()+ "C_id: "+getC_id()+" Address: "+getC_Address();
}

}
