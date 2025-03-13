
public class Binarycount {

	public static void main(String[] args) {

		Answer s = new Answer();
		System.out.println(s.checkRecord("PPALLL"));
	}

}

class Answer {
    public boolean checkRecord(String s) {
        int abs = 0, late = 0, pre = 0;
        int cons = 0, temp =0;

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='A') abs++;
            if(c=='P') pre++;

            if (c == 'L')
            {
            	late++;
                cons++;
            }
            else 
            {temp = Math.max(cons,temp); cons = 0;}
        }
      
        temp = Math.max(cons,temp);
        System.out.println("Attendence "+abs);
        System.out.println("Late  "+late);
        System.out.println("Present "+pre);
        System.out.println("consisecuty "+cons);
        System.out.println("result  "+temp);
        
        if(abs < 2 && temp < 3)
        return true;
        else return false;
    }
}