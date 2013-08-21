public class jHashTest
{
    public static void main(String[] args) {
        jHash itr = new jHash();
	String out;
	itr.put("1","test");
	itr.put("2","test2");
	itr.put("3","some data1");
	itr.put("4","some data2");
	itr.put("5","some data3");
	itr.put("6","some data4");
	itr.put("7","some data5");
	itr.put("8","some data6");
	itr.del("6");
	itr.del("1");
 
	out =	itr.get("1");
	System.out.println ("1 returned -> "+out);
 
	out =	itr.get("2");
	System.out.println ("2 returned -> "+out);
 
	out =	itr.get("3");
	System.out.println ("3 returned -> "+out);
	out =	itr.get("4");
	System.out.println ("4 returned -> "+out);
	out =	itr.get("5");
	System.out.println ("5 returned -> "+out);
	out =	itr.get("6");
	System.out.println ("6 returned -> "+out);
 
	out =	itr.get("7");
	System.out.println ("7 returned -> "+out);
	out =	itr.get("8");
	System.out.println ("8 returned -> "+out);
 
 
 
    }
}
