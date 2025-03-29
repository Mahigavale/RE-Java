package java_revision;

public class SingeltonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Single x=Single.getObj();
		
		Single y=Single.getObj();
		
		
		Single z=Single.getObj();
		
		
		System.out.println(x.hashCode()==y.hashCode() &&y.hashCode()/**/==z.hashCode());

	}

}


class Single{
	
	
	private static Single sn=null;
	
	private String s;
	
	private Single()
	{
		 s="hiii";
		 
		 System.out.println(s);
	}
	
	
	public static synchronized Single getObj()
	{
		if(sn==null)
		
			sn=new Single();
		
		return sn;
			
	}
	
}